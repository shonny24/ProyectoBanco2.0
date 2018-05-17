/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Enumeracion.Permiso;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Alejandro
 * @author Shonny
 * @author Juan Carlos
 */
public class Banco {

    private ArrayList<Cliente> clientes;
    private ArrayList<Empresa> empresas;

    /**
     *
     * @param clientes
     * @param empresas
     */
    public Banco(ArrayList<Cliente> clientes, ArrayList<Empresa> empresas) {
        this.clientes = clientes;
        this.empresas = empresas;
    }

    /**
     *
     * @param usuario
     * @return
     */
    public Empresa buscarEmpresaPorUsuario(String usuario) {
        for (Empresa empresa : empresas) {
            if (usuario.equals(empresa.getUsuario())) {
                return empresa;
            }
        }
        return null;
    }

    /**
     *
     * @param usuario
     * @return
     */
    public Cliente buscarClientePorUsuario(String usuario) {
        for (Cliente cliente : clientes) {
            if (usuario.equals(cliente.getUsuario())) {
                return cliente;
            }
        }
        return null;
    }

    /**
     *
     * @param id
     * @return
     */
    public Cliente buscarCliente(String id) {
        for (Cliente cliente : clientes) {
            if (id.equals(cliente.getCedula())) {
                return cliente;
            }
        }
        return null;
    }

    /**
     *
     * @param numeroBancario
     * @return
     */
    public Cliente buscarClientePorNumeroBancario(String numeroBancario) {
        for (Cliente cliente : clientes) {
            if (cliente.buscarNumeroBancario(numeroBancario)) {
                return cliente;
            }
        }
        return null;
    }

    /**
     *
     * @param client
     * @return
     */
    public boolean agregarCliente(Cliente client) {
        String ident = client.getCedula();

        Cliente verificar = buscarCliente(ident);
        if (verificar == null) {
            clientes.add(client);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarCliente(String id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (id.equals(clientes.get(i).getCedula())) {
                clientes.remove(i);
                return true;
            }
        }

        return false;
    }
    
    
    public boolean modificarClientePorVentana(String id, String nombres, String apellidos, String cedula, int edad, String sexo, String email, Date fechaCumpleanios, String usuario, String password, String preguntaSeguridad, String respuesta, Permiso permisos){
        Cliente cliente = buscarCliente(id);
        if (clientes != null) {
            if (id.equals(cliente.getCedula())) {
                cliente.setNombres(nombres);
                cliente.setApellidos(apellidos);
                cliente.setCedula(cedula);
                cliente.setEdad(edad);
                cliente.setSexo(sexo);
                cliente.setEmail(email);
                cliente.setFechaCumpleanios(fechaCumpleanios);
                cliente.setUsuario(usuario);
                cliente.setPassword(password);
                cliente.setPreguntaSeguridad(preguntaSeguridad);
                cliente.setRespuesta(respuesta);
                cliente.setPermisos(permisos);
                return true;
            }
        }
        return false;
    }

    public void modificarCliente(String id, String dato, int col) throws ParseException {
        Cliente cliente = buscarCliente(id);
        switch (col) {
            //Usuario
            case 1:
                if (clientes != null) {
                    if (id.equals(cliente.getCedula())) {
                        cliente.setUsuario(dato);
                    }
                }
                break;
            //Pregunta de seguridas
            case 2:
                if (clientes != null) {
                    if (id.equals(cliente.getCedula())) {
                        cliente.setPreguntaSeguridad(dato);
                    }
                }
                break;
            //Respuesta
            case 3:
                if (clientes != null) {
                    if (id.equals(cliente.getCedula())) {
                        cliente.setRespuesta(dato);
                    }
                }
                break;
            //Permiso
            case 4:
                Permiso permisoEnum = Permiso.valueOf(dato);
                if (clientes != null) {
                    if (id.equals(cliente.getCedula())) {
                        cliente.setPermisos(permisoEnum);
                    }
                }
                break;
            //Nombres
            case 5:
                if (clientes != null) {
                    if (id.equals(cliente.getCedula())) {
                        cliente.setNombres(dato);
                    }
                }
                break;
            //Apellidos
            case 6:
                if (clientes != null) {
                    if (id.equals(cliente.getCedula())) {
                        cliente.setApellidos(dato);
                    }
                }
                break;
            //Edad
            case 7:
                int edad = Integer.parseInt(dato);
                if (clientes != null) {
                    if (id.equals(cliente.getCedula())) {
                        cliente.setEdad(edad);
                    }
                }
                break;
            //Sexo
            case 8:
                if (clientes != null) {
                    if (id.equals(cliente.getCedula())) {
                        cliente.setSexo(dato);
                    }
                }
                break;
            //Email
            case 9:
                if (clientes != null) {
                    if (id.equals(cliente.getCedula())) {
                        cliente.setEmail(dato);
                    }
                }
                break;
            //Fecha Nacimiento
            case 10:
                SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");
                Date fechaNacimiento = formatter.parse(dato);
                if (clientes != null) {
                    if (id.equals(cliente.getCedula())) {
                        cliente.setFechaCumpleanios(fechaNacimiento);
                    }
                }
                break;
            default:
                break;
        }

    }

    /**
     *
     * @param nit
     * @return
     */
    public Empresa buscarEmpresa(String nit) {
        for (Empresa empresa : empresas) {
            if (nit.equals(empresa.getNIT())) {
                return empresa;
            }
        }
        return null;
    }

    /**
     *
     * @param empre
     * @return
     */
    public boolean agregarEmpresa(Empresa empre) {
        String nit = empre.getNIT();

        Empresa verificar = buscarEmpresa(nit);
        if (verificar == null) {
            empresas.add(empre);
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return
     */
    public int numeroTotalCDT() {
        int numeroTotal = 0;
        for (Cliente cliente : clientes) {
            numeroTotal += cliente.numeroCDT();
        }
        return numeroTotal;
    }

    /**
     *
     * @return
     */
    public int numeroTotalAhorro() {
        int numeroTotal = 0;
        for (Cliente cliente : clientes) {
            numeroTotal += cliente.numeroAhorro();
        }
        return numeroTotal;
    }

    /**
     *
     * @return
     */
    public int numeroTotalCorriente() {
        int numeroTotal = 0;
        for (Cliente cliente : clientes) {
            numeroTotal += cliente.numeroCorriente();
        }
        return numeroTotal;
    }

    /**
     *
     * @return
     */
    public int numeroTotalNomina() {
        int numeroTotal = 0;
        for (Cliente cliente : clientes) {
            numeroTotal += cliente.numeroNomina();
        }
        return numeroTotal;
    }

    /**
     *
     * @return
     */
    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    /**
     *
     * @param empresas
     */
    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    /**
     *
     * @return
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Nomina> getNominas() {
        ArrayList<Nomina> nominas = new ArrayList<>();
        for (Cliente cliente : clientes) {
            for (Nomina nomina : cliente.getNominasCliente()) {
                nominas.add(nomina);
            }
        }
        return nominas;
    }

    public ArrayList<Ahorro> getAhorros() {
        ArrayList<Ahorro> ahorros = new ArrayList<>();
        for (Cliente cliente : clientes) {
            for (Ahorro ahorro : cliente.getAhorros()) {
                ahorros.add(ahorro);
            }
        }
        return ahorros;
    }

    public ArrayList<Corriente> getCorrientes() {
        ArrayList<Corriente> corrientes = new ArrayList<>();
        for (Cliente cliente : clientes) {
            for (Corriente corriente : cliente.getCorrientes()) {
                corrientes.add(corriente);
            }
        }
        return corrientes;
    }

    public ArrayList<CDTs> getCuentasCDTs() {
        ArrayList<CDTs> cuentasCDTS = new ArrayList<>();
        for (Cliente cliente : clientes) {
            for (CDTs cuentaCDT : cliente.getCdts()) {
                cuentasCDTS.add(cuentaCDT);
            }
        }
        return cuentasCDTS;
    }
}
