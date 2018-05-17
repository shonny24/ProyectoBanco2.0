/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Enumeracion.Permiso;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Alejandro
 * @author Shonny
 * @author Juan Carlos
 */
public class Cliente extends Usuario {

    String nombres;
    private String apellidos;
    private String cedula;
    private int edad;
    private String sexo;
    private String email;
    private Date fechaCumpleanios;
    private ArrayList<Ahorro> ahorros;
    private ArrayList<Corriente> corrientes;
    private ArrayList<Nomina> nominasCliente;
    private ArrayList<CDTs> cdts;
    private ArrayList<String> numerosBancarios;

    /**
     *
     * @param nombres
     * @param apellidos
     * @param cedula
     * @param edad
     * @param sexo
     * @param email
     * @param fechaCumpleanios
     * @param usuario
     * @param password
     * @param preguntaSeguridad
     * @param respuesta
     * @param permisos
     */
    public Cliente(String nombres, String apellidos, String cedula, int edad, String sexo, String email, Date fechaCumpleanios, String usuario, String password, String preguntaSeguridad, String respuesta, Permiso permisos) {
        super(usuario, password, preguntaSeguridad, respuesta, permisos);
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.edad = edad;
        this.sexo = sexo;
        this.email = email;
        this.fechaCumpleanios = fechaCumpleanios;
        this.ahorros = new ArrayList<>();
        this.corrientes = new ArrayList<>();
        nominasCliente = new ArrayList<>();
        this.cdts = new ArrayList<>();
        //revisar lo hizo juank, los usuarios no tienen numeros bancario tienen cuentas...
        this.numerosBancarios = new ArrayList<>();
    }

    /**
     *
     * @param numeroBanco
     * @return
     */
    public Ahorro buscarCuentaAhorro(String numeroBanco) {
        for (Ahorro ahorro : ahorros) {
            if (numeroBanco.equals(ahorro.getNumeroBancario())) {
                return ahorro;
            }
        }
        return null;
    }

    /**
     *
     * @param ahorro
     * @return
     */
    public boolean agregarCuentaAhorro(Ahorro ahorro) {
        String numeroBanco = ahorro.getNumeroBancario();

        Ahorro verificar = buscarCuentaAhorro(numeroBanco);
        if (verificar == null) {
            ahorros.add(ahorro);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarCuentaAhorro(String numeroBanco) {
        for (int i = 0; i < ahorros.size(); i++) {
            if (numeroBanco.equals(ahorros.get(i).getNumeroBancario())) {
                ahorros.remove(i);
                return true;
            }
        }

        return false;
    }

    public boolean modificarCuentaAhorro(String id, Date fechaRetiroAhorros, double monto, String numeroBancario) {
        Ahorro ahorro = buscarCuentaAhorro(id);
        if (ahorros != null) {
            if (id.equals(ahorro.getNumeroBancario())) {
                ahorro.setFechaRetiroAhorros(fechaRetiroAhorros);
                ahorro.setMonto(monto);
                ahorro.setNumeroBancario(numeroBancario);
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param numeroBanco
     * @return
     */
    public Corriente buscarCuentaCorriente(String numeroBanco) {
        for (Corriente corriente : corrientes) {
            if (numeroBanco.equals(corriente.getNumeroBancario())) {
                return corriente;
            }
        }
        return null;
    }

    /**
     *
     * @param corriente
     * @return
     */
    public boolean agregarCuentaCorriente(Corriente corriente) {
        String numeroBanco = corriente.getNumeroBancario();

        Corriente verificar = buscarCuentaCorriente(numeroBanco);
        if (verificar == null) {
            corrientes.add(corriente);
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarCuentaCorriente(String id, double monto, String numeroBancario) {
        Corriente corriente = buscarCuentaCorriente(id);
        if (ahorros != null) {
            if (id.equals(corriente.getNumeroBancario())) {
                corriente.setMonto(monto);
                corriente.setNumeroBancario(numeroBancario);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarCuentaCorriente(String numeroBanco) {
        for (int i = 0; i < corrientes.size(); i++) {
            if (numeroBanco.equals(corrientes.get(i).getNumeroBancario())) {
                corrientes.remove(i);
                return true;
            }
        }

        return false;
    }

    /**
     *
     * @param numeroBanco
     * @return
     */
    public Nomina buscarCuentaNomina(String numeroBanco) {
        for (Nomina nomina : nominasCliente) {
            if (numeroBanco.equals(nomina.getNumeroBancario())) {
                return nomina;
            }
        }
        return null;
    }

    //MODIFICAR ESTE METODO PUESTO QUE NO TIENE LA VALIDACION POR NUMERO BANCARIO 
    /**
     *
     * @param nomina
     * @return
     */
    public boolean agregarCuentaNomina(Nomina nomina) {
        String numeroBanco = nomina.getNumeroBancario();

        Nomina verificar = buscarCuentaNomina(numeroBanco);
        if (verificar == null) {
            nominasCliente.add(nomina);
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarCuentaNomina(String id, Empresa empresa, double monto) {
        Nomina nomina = buscarCuentaNomina(id);
        if (nominasCliente != null) {
            if (id.equals(nomina.getNumeroBancario())) {
                nomina.setEmpresa(empresa);
                nomina.setMonto(monto);
                return true;
            }
        }
        return false;
    }
    
        public boolean eliminarCuentaNomina(String numeroBanco) {
        for (int i = 0; i < nominasCliente.size(); i++) {
            if (numeroBanco.equals(nominasCliente.get(i).getNumeroBancario())) {
                nominasCliente.remove(i);
                return true;
            }
        }

        return false;
    }

    /**
     *
     * @param identificador
     * @return
     */
    public CDTs buscarCDT(String identificador) {
        for (CDTs cdt : cdts) {
            if (identificador.equals(cdt.getNumeroBancario())) {
                return cdt;
            }
        }
        return null;
    }

    /**
     *
     * @param cdt
     * @return
     */
    public boolean agregarCDT(CDTs cdt) {
        String numeroCDT = cdt.getNumeroBancario();

        CDTs verificar = buscarCDT(numeroCDT);
        if (verificar == null) {
            cdts.add(cdt);
            return true;
        } else {
            return false;
        }
    }

    public boolean modificarCuentaCDT(String id, double montoInversion, int porcentajeInteresPagado, boolean pagoMensual) {
        CDTs cdt = buscarCDT(id);
        if (cdts != null) {
            if (id.equals(cdt.getNumeroBancario())) {
                cdt.setMontoInversion(montoInversion);
                cdt.setPorcentajeInteresPagado(porcentajeInteresPagado);
                cdt.setPagoMensual(pagoMensual);
                return true;
            }
        }
        return false;
    }
    
            public boolean eliminarCuentaCDT(String numeroBanco) {
        for (int i = 0; i < cdts.size(); i++) {
            if (numeroBanco.equals(cdts.get(i).getNumeroBancario())) {
                cdts.remove(i);
                return true;
            }
        }

        return false;
    }

//    public void modificarCDT(String id, String dato, int col) {
//        switch (col) {
//            case 1:
//                double montoInver = Double.parseDouble(dato);
//                for (CDTs cdt : cdts) {
//                    if (cdt != null) {
//                        if (id.equals(cdt.getNumeroBancario())) {
//                            cdt.setMontoInversion(montoInver);
//                        }
//                    }
//                }
//                break;
//            case 2:
//                int porceInteres = Integer.parseInt(dato);
//                for (CDTs cdt : cdts) {
//                    if (cdt != null) {
//                        if (id.equals(cdt.getNumeroBancario())) {
//                            cdt.setPorcentajeInteresPagado(porceInteres);
//                        }
//                    }
//                }
//                break;
//            case 3:
//                boolean puntosAtp = Boolean.parseBoolean(dato);
//                for (CDTs cdt : cdts) {
//                    if (cdt != null) {
//                        if (id.equals(cdt.getNumeroBancario())) {
//                            cdt.setPagoMensual(puntosAtp);
//                        }
//                    }
//                }
//                break;
//            default:
//                break;
//        }
//
//    }
//
//    public void modificarAhorro(String id, String dato, int col) {
//        switch (col) {
//            case 1:
//                double monto = Double.parseDouble(dato);
//                for (Ahorro ahorro : ahorros) {
//                    if (ahorro != null) {
//                        if (id.equals(ahorro.getNumeroBancario())) {
//                            ahorro.setMonto(monto);
//                        }
//                    }
//                }
//                break;
//            default:
//                break;
//        }
//
//    }
//
//    public void modificarCorriente(String id, String dato, int col) {
//        switch (col) {
//            case 1:
//                double monto = Double.parseDouble(dato);
//                for (Corriente corriente : corrientes) {
//                    if (corriente != null) {
//                        if (id.equals(corriente.getNumeroBancario())) {
//                            corriente.setMonto(monto);
//                        }
//                    }
//                }
//                break;
//            default:
//                break;
//        }
//
//    }
    /**
     *
     * @return
     */
    public int numeroCDT() {
        return cdts.size();
    }

    /**
     *
     * @return
     */
    public int numeroAhorro() {
        return ahorros.size();
    }

    /**
     *
     * @return
     */
    public int numeroCorriente() {
        return corrientes.size();
    }

    /**
     *
     * @return
     */
    public int numeroNomina() {
        return nominasCliente.size();
    }

    /**
     *
     * @return
     */
    public String getNombres() {
        return nombres;
    }

    /**
     *
     * @param nombres
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     *
     * @return
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *
     * @return
     */
    public String getCedula() {
        return cedula;
    }

    /**
     *
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public String getSexo() {
        return sexo;
    }

    /**
     *
     * @param sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     */
    public Date getFechaCumpleanios() {
        return fechaCumpleanios;
    }

    /**
     *
     * @param fechaCumpleanios
     */
    public void setFechaCumpleanios(Date fechaCumpleanios) {
        this.fechaCumpleanios = fechaCumpleanios;
    }

    /**
     *
     * @return
     */
    public ArrayList<Ahorro> getAhorros() {
        return ahorros;
    }

    /**
     *
     * @param ahorros
     */
    public void setAhorros(ArrayList<Ahorro> ahorros) {
        this.ahorros = ahorros;
    }

    /**
     *
     * @return
     */
    public ArrayList<Corriente> getCorrientes() {
        return corrientes;
    }

    /**
     *
     * @param corrientes
     */
    public void setCorrientes(ArrayList<Corriente> corrientes) {
        this.corrientes = corrientes;
    }

    /**
     *
     * @return
     */
    public ArrayList<Nomina> getNominasCliente() {
        return nominasCliente;
    }

    /**
     *
     * @param nominasCliente
     */
    public void setNominasCliente(ArrayList<Nomina> nominasCliente) {
        this.nominasCliente = nominasCliente;
    }

    /**
     *
     * @return
     */
    public ArrayList<CDTs> getCdts() {
        return cdts;
    }

    /**
     *
     * @param cdts
     */
    public void setCdts(ArrayList<CDTs> cdts) {
        this.cdts = cdts;
    }

    public ArrayList<String> getNumerosBancarios() {
        return numerosBancarios;
    }

    public void setNumeroBancario(String numeroBancario) {
        this.numerosBancarios.add(numeroBancario);
    }

    public void setNumerosBancarios(ArrayList<String> numerosBancarios) {
        this.numerosBancarios = numerosBancarios;
    }

    public boolean buscarNumeroBancario(String numeroBancario) {
        for (String nBancario : numerosBancarios) {
            if (numeroBancario.equalsIgnoreCase(nBancario)) {
                return true;
            }
        }
        return false;
    }

    public void setCuentaAhorro(Ahorro ahorro) {
        ahorros.add(ahorro);
    }

    public void setCuentaCorriente(Corriente corriente) {
        corrientes.add(corriente);
    }

    public void setCuentaCDT(CDTs cuentaCDT) {
        cdts.add(cuentaCDT);
    }

    @Override
    public String toString() {
        return "Nombres: " + nombres + "\n"
                + "Apellidos: " + apellidos + "\n"
                + "Cedula: " + cedula + "\n"
                + "Edad: " + edad + "\n"
                + "Sexo: " + sexo + "\n"
                + "Email: " + email + "\n"
                + "Fecha Nacimiento: " + fechaCumpleanios;
    }
}
