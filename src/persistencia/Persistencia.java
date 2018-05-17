/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import Enumeracion.Permiso;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import logica.Ahorro;
import logica.Cliente;
import logica.Empresa;
import logica.Nomina;
import logica.Banco;
import logica.CDTs;
import logica.Corriente;

/**
 * @author Alejandro
 * @author Shonny
 * @author Juan Carlos
 */
public class Persistencia {
    
    
    /**
     * Metodo que recibe una ruta de archivo por parametro y retorna un arreglo
     * de String con el contenido del archivo
     *
     * @param nombreArchivo
     * @return contenidoTecto
     * @throws IOException excepción del archivo
     * @throws java.text.ParseException
     */
    public ArrayList<String> inicializarAtributos(String nombreArchivo) throws IOException, ParseException {
        FileReader lector;
        BufferedReader entradaTxt;
        ArrayList<String> contenidoTexto;
        String linea;

        lector = null;
        contenidoTexto = new ArrayList<>();

        lector = new FileReader(nombreArchivo);
        entradaTxt = new BufferedReader(lector);

        while ((linea = entradaTxt.readLine()) != null) {
            contenidoTexto.add(linea);
        }
        entradaTxt.close();
        lector.close();

        return contenidoTexto;
    }

    /**
     * Metodo que recibe una ruta de archivo por parametro y un arreglo de
     * String, guarda el arreglo dentro del archivo.
     *
     * @param nombreArchivo
     * @param texto
     * @param adicionar
     * @throws IOException excepción del archivo
     */
    public void guardarArchivo(String nombreArchivo, ArrayList<String> texto, boolean adicionar) throws IOException {
        FileWriter archivoSalida;
        BufferedWriter bufferSalida;

        archivoSalida = null;
        archivoSalida = new FileWriter(nombreArchivo, adicionar);
        bufferSalida = new BufferedWriter(archivoSalida);

        for (String linea : texto) {
            bufferSalida.write(linea + "\n");
        }
        bufferSalida.flush();
        bufferSalida.close();
        archivoSalida.close();
    }

    /**
     *Metodo para añadir más clientes al archivo
     * @param clientes
     */
    public void aniadirArchivoClientes(ArrayList<Cliente> clientes) {
        String nombreArchivo = "src\\persistencia\\Clientes.txt";
        ArrayList<String> texto;
        
        texto = new ArrayList<>();
        texto = crearTextoClientes(clientes); 

        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
            guardarArchivo(nombreArchivo, texto,false);
            System.out.println("Archivo Clientes modificado satisfactoriamente..");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al manipular el archivo "
                + e.getMessage(), "Dialogo de error", JOptionPane.ERROR_MESSAGE);
        } 
    }

    /**
     * Metodo que carga el archivo Clientes.txt en el arreglo (persistencia)
     *
     * @return clientes
     * @throws IOException excepción del archivo
     * @throws java.text.ParseException
     */
    public ArrayList<Cliente> inicializarAtributosClientes() throws IOException, ParseException {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<String> archivoClientes;
        ArrayList<String> numerosBancarios;
        
        archivoClientes = new ArrayList<>();
        numerosBancarios = new ArrayList<>();
        String nombreArchivo = "src\\persistencia\\Clientes.txt";
        archivoClientes = inicializarAtributos(nombreArchivo);

        for (String archivoCliente : archivoClientes) {
            if (archivoCliente != null) {
                String cli[] = archivoCliente.split("--");//hace split a la linea para separarla y irla guardando en el arreglo
                SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");
                Date fechaNacimiento = formatter.parse(cli[6]);
                String permiso = cli[11];
                Permiso permisoEnum = Permiso.valueOf(permiso);

                Cliente nuevoCLiente = new Cliente(cli[0], cli[1], cli[2], Integer.parseInt(cli[3]), cli[4], cli[5], fechaNacimiento, cli[7], cli[8], cli[9], cli[10], permisoEnum);
                if(cli.length==13){
                    numerosBancarios=crearNumerosBancarios(cli[12]);
                    nuevoCLiente.setNumerosBancarios(numerosBancarios);
                }
                clientes.add(nuevoCLiente);
            }
        }
        return clientes;
    }

    /**
     *
     * @param empresas
     */
    public void aniadirArchivoEmpresas(ArrayList<Empresa> empresas) {
        String nombreArchivo = "src\\persistencia\\Empresas.txt";
        ArrayList<String> texto;
        
        texto = new ArrayList<>();
        texto = crearTextoEmpresa(empresas); 

        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
            guardarArchivo(nombreArchivo, texto,false);
            System.out.println("Archivo Empresas modificado satisfactoriamente..");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al manipular el archivo "
                + e.getMessage(), "Dialogo de error", JOptionPane.ERROR_MESSAGE);
        } 
    }

    /**
     * Metodo que carga el archivo Empresa.txt en el arreglo (persistencia)
     *
     * @return
     * @throws IOException excepción del archivo
     * @throws java.text.ParseException
     */
    public ArrayList<Empresa> inicializarAtributosEmpresa() throws IOException, ParseException {
        ArrayList<Empresa> empresas = new ArrayList<>();
        ArrayList<String> archivoEmpresas;

        archivoEmpresas = new ArrayList<>();
        String nombreArchivo = "src\\persistencia\\Empresas.txt";
        archivoEmpresas = inicializarAtributos(nombreArchivo);

        for (String archivoEmpresa : archivoEmpresas) {
            if (archivoEmpresa != null) {
                String emp[] = archivoEmpresa.split("--");//hace split a la linea para separarla y irla guardando en el arreglo
                String permiso = emp[6];
                Permiso permisoEnum = Permiso.valueOf(permiso);

                Empresa nuevaEmpresa = new Empresa(emp[0], emp[1], emp[2], emp[3], emp[4], emp[5], permisoEnum);

                empresas.add(nuevaEmpresa);
            }
        }
        return empresas;
    }
    
    /**
     *Metodo para añadir más nominas al archivo
     * @param nominas
     */
    public void aniadirArchivoNominas(ArrayList<Nomina> nominas) {
        String nombreArchivo = "src\\persistencia\\CuentasNomina.txt";
        ArrayList<String> texto;
        
        texto = new ArrayList<>();
        texto = crearTextoNominas(nominas); 

        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
            guardarArchivo(nombreArchivo, texto,false);
            System.out.println("Archivo CuentasNomina modificado satisfactoriamente..");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al manipular el archivo "
                + e.getMessage(), "Dialogo de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    /**
     * Metodo que carga el archivo CuentasNomina.txt en el arreglo (persistencia)
     *
     * @param miBanco
     * @throws IOException excepción del archivo
     * @throws java.text.ParseException
     */
    public void inicializarAtributosNominas(Banco miBanco) throws IOException, ParseException {
        ArrayList<Nomina> nominas = new ArrayList<>();
        ArrayList<String> archivoNominas;
        
        archivoNominas = new ArrayList<>();
        String nombreArchivo = "src\\persistencia\\CuentasNomina.txt";
        archivoNominas = inicializarAtributos(nombreArchivo);

        for (String archivoNomina : archivoNominas) {
            if (archivoNomina != null) {
                String[] nom = archivoNomina.split("--");//hace split a la linea para separarla e irla guardando en el arreglo
                SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");
                Date fechaCreacion = formatter.parse(nom[4]);

                Nomina nuevaNomina = new Nomina(miBanco.buscarEmpresa(nom[0]), miBanco.buscarCliente(nom[1]), Double.parseDouble(nom[2]),nom[3],fechaCreacion);

                
                nominas.add(nuevaNomina);
            }
        }
    }

    /**
     *Metodo para añadir más ahorros al archivo
     * @param ahorros
     */
    public void aniadirArchivoAhorros(ArrayList<Ahorro> ahorros) {
        String nombreArchivo = "src\\persistencia\\CuentasAhorro.txt";
        ArrayList<String> texto;
        
        texto = new ArrayList<>();
        texto = crearTextoAhorros(ahorros); 

        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
            guardarArchivo(nombreArchivo, texto,false);
            System.out.println("Archivo CuentasAhorro modificado satisfactoriamente..");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al manipular el archivo "
                + e.getMessage(), "Dialogo de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    /**
     * Metodo que carga el archivo CuentasAhorro.txt en el arreglo (persistencia)
     *
     * @param miBanco
     * @throws IOException excepción del archivo
     * @throws java.text.ParseException
     */
    public void inicializarAtributosAhorros(Banco miBanco) throws IOException, ParseException {
        ArrayList<Ahorro> ahorros = new ArrayList<>();
        ArrayList<String> archivoAhorros;
        
        archivoAhorros = new ArrayList<>();
        String nombreArchivo = "src\\persistencia\\CuentasAhorro.txt";
        archivoAhorros = inicializarAtributos(nombreArchivo);

        for (String archivoAhorro : archivoAhorros) {
            if (archivoAhorro != null) {
                String[] aho = archivoAhorro.split("--");//hace split a la linea para separarla e irla guardando en el arreglo
                SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");
                Date fechaRetiroAhorros = formatter.parse(aho[0]);
                Date fechaCreacion = formatter.parse(aho[3]);

                Ahorro nuevoAhorro = new Ahorro(fechaRetiroAhorros,Double.parseDouble(aho[1]),aho[2],fechaCreacion);

                ahorros.add(nuevoAhorro);
            }
        }
        repartirCuentasAhorro(miBanco, ahorros);
    }
    
    /**
     *Metodo para añadir más ahorros al archivo
     * @param CuentasCDTs
     */
    public void aniadirArchivoCDTs(ArrayList<CDTs> CuentasCDTs) {
        String nombreArchivo = "src\\persistencia\\CDTs.txt";
        ArrayList<String> texto;
        
        texto = new ArrayList<>();
        texto = crearTextoCDTs(CuentasCDTs); 

        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
            guardarArchivo(nombreArchivo, texto,false);
            System.out.println("Archivo CDTs modificado satisfactoriamente..");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al manipular el archivo "
                + e.getMessage(), "Dialogo de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    /**
     * Metodo que carga el archivo CuentasAhorro.txt en el arreglo (persistencia)
     *
     * @param miBanco
     * @throws IOException excepción del archivo
     * @throws java.text.ParseException
     */
    public void inicializarAtributosCDTs(Banco miBanco) throws IOException, ParseException {
        ArrayList<CDTs> cuentasCDTs = new ArrayList<>();
        ArrayList<String> archivoCDTs;
        
        archivoCDTs = new ArrayList<>();
        String nombreArchivo = "src\\persistencia\\CDTs.txt";
        archivoCDTs = inicializarAtributos(nombreArchivo);

        for (String archivoCDT : archivoCDTs) {
            if (archivoCDT != null) {
                String[] CDT = archivoCDT.split("--");//hace split a la linea para separarla e irla guardando en el arreglo
                SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");
                Date fechaCreacion = formatter.parse(CDT[4]);

                CDTs nuevoCDT = new CDTs(Double.parseDouble(CDT[0]),Integer.parseInt(CDT[1]),Boolean.parseBoolean(CDT[2]),CDT[3],fechaCreacion);

                cuentasCDTs.add(nuevoCDT);
            }
        }
        repartirCuentasCDTs(miBanco, cuentasCDTs);
    }
    
     /**
     *Metodo para añadir más cuentas corrientes al archivo
     * @param corrientes
     */
    public void aniadirArchivoCorrientes(ArrayList<Corriente> corrientes) {
        String nombreArchivo = "src\\persistencia\\CuentasCorriente.txt";
        ArrayList<String> texto;
        
        texto = new ArrayList<>();
        texto = crearTextoCorrientes(corrientes); 

        try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
            guardarArchivo(nombreArchivo, texto,false);
            System.out.println("Archivo CuentasCorrinte modificado satisfactoriamente..");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al manipular el archivo "
                + e.getMessage(), "Dialogo de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    /**
     * Metodo que carga el archivo CuentasAhorro.txt en el arreglo (persistencia)
     *
     * @param miBanco
     * @throws IOException excepción del archivo
     * @throws java.text.ParseException
     */
    public void inicializarAtributosCorrientes(Banco miBanco) throws IOException, ParseException {
        ArrayList<Corriente> corrientes = new ArrayList<>();
        ArrayList<String> archivoCorrientes;
        
        archivoCorrientes = new ArrayList<>();
        String nombreArchivo = "src\\persistencia\\CuentasCorriente.txt";
        archivoCorrientes = inicializarAtributos(nombreArchivo);

        for (String archivoCorriente : archivoCorrientes) {
            if (archivoCorrientes != null) {
                String[] cor = archivoCorriente.split("--");//hace split a la linea para separarla e irla guardando en el arreglo
                SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");
                Date fechaCreacion = formatter.parse(cor[2]);

                Corriente nuevaCorriente = new Corriente(Double.parseDouble(cor[0]),cor[1],fechaCreacion);

                corrientes.add(nuevaCorriente);
            }
        }
        repartirCuentasCorrientes(miBanco, corrientes);
    }

    /**
     * Metodo que retorna los datos de los clientes en un array de String con
     * su respectivo formato
     *@param clientes
     * @return Texto
     */
    private ArrayList<String> crearTextoClientes(ArrayList<Cliente> clientes) {
        ArrayList<String> texto;
        texto = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");
        String numerosBancarios="";

        for (Cliente cliente : clientes) {
                numerosBancarios = obtenerNumerosBancarios(cliente.getNumerosBancarios());
                texto.add(cliente.getNombres() + "--" + cliente.getApellidos() + "--" + cliente.getCedula()
                        + "--" + cliente.getEdad() + "--" + cliente.getSexo() + "--" + cliente.getEmail()
                        + "--" + formatter.format(cliente.getFechaCumpleanios()) + "--" + cliente.getUsuario()
                        + "--" + cliente.getPassword() + "--" + cliente.getPreguntaSeguridad() + "--" + cliente.getRespuesta()
                        + "--" + cliente.getPermisos().name()+ "--" +numerosBancarios);
            }
        return texto;
    }
    
    /**
     * Metodo que retorna los datos de los cuentas de ahorro en un array de String con
     * su respectivo formato
     *@param clientes
     * @return Texto
     */
    private ArrayList<String> crearTextoNominas(ArrayList<Nomina> nominas) {
        ArrayList<String> texto;
        texto = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");

        for (Nomina nomina : nominas) {
                //escribe los datos en el texto
                texto.add(nomina.getEmpresa().getNIT() + "--" + nomina.getCliente().getCedula()+ "--" + nomina.getMonto()
                        + "--" + nomina.getNumeroBancario()+ "--" + formatter.format(nomina.getFechaCreacion()));
            }
        return texto;
    }
    
    /**
     * Metodo que retorna los datos de las cuentas de ahorros en un array de String con
     * su respectivo formato
     *@param clientes
     * @return Texto
     */
    private ArrayList<String> crearTextoAhorros(ArrayList<Ahorro> ahorros) {
        ArrayList<String> texto;
        texto = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");

        for (Ahorro ahorro : ahorros) {
                //escribe los datos en el texto
                texto.add(formatter.format(ahorro.getFechaRetiroAhorros())+ "--" + ahorro.getMonto()+ "--" + ahorro.getNumeroBancario()+ "--" + formatter.format(ahorro.getFechaCreacion()));
            }
        return texto;
    }
    
    /**
     * Metodo que retorna los datos de las cuentas corrientes en un array de String con
     * su respectivo formato
     *@param clientes
     * @return Texto
     */
    private ArrayList<String> crearTextoCorrientes(ArrayList<Corriente> corrientes) {
        ArrayList<String> texto;
        texto = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");

        for (Corriente corriente : corrientes) {
                //escribe los datos en el texto
                texto.add(corriente.getMonto()+ "--" + corriente.getNumeroBancario()+ "--" + formatter.format(corriente.getFechaCreacion()));
            }
        return texto;
    }
    
    /**
     * Metodo que retorna los datos de las cuentas corrientes en un array de String con
     * su respectivo formato
     *@param clientes
     * @return Texto
     */
    private ArrayList<String> crearTextoCDTs(ArrayList<CDTs> cuentasCDTs) {
        ArrayList<String> texto;
        texto = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");

        for (CDTs CDT : cuentasCDTs) {
                //escribe los datos en el texto
                texto.add(CDT.getMontoInversion()+ "--" + CDT.getPorcentajeInteresPagado()+ "--" + CDT.isPagoMensual()+ "--" + CDT.getNumeroBancario()+ "--" + formatter.format(CDT.getFechaCreacion()));
            }
        return texto;
    }
    
    /**
     * Metodo que retorna los datos de las empresas en un array de String con
     * su respectivo formato
     *@param empresas
     * @return Texto
     */
    private ArrayList<String> crearTextoEmpresa(ArrayList<Empresa> empresas) {
        ArrayList<String> texto;
        texto = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("d/MM/yyyy");

        for (Empresa empresa : empresas) {
                //escribe los datos en el texto
                texto.add(empresa.getRazonSocial() + "--" + empresa.getNIT() + "--" + empresa.getUsuario()
                        + "--" + empresa.getPassword() + "--" + empresa.getPreguntaSeguridad() + "--" + empresa.getRespuesta() + "--" + empresa.getPermisos().name());
            }
        return texto;
    }

    private String obtenerNumerosBancarios(ArrayList<String> numerosBancarios) {
        String numBancarios="";
        for (String numeroBancario : numerosBancarios) {
            numBancarios += numeroBancario+",,"; 
        }
        return numBancarios;
    }

    private ArrayList<String> crearNumerosBancarios(String numBancarios) {
        ArrayList<String> numerosBancarios;
        String [] codigosBancarios = numBancarios.split(",,");
        numerosBancarios = new ArrayList<>();
        for (String numeroBancario : codigosBancarios) {
            numerosBancarios.add(numeroBancario);
        }
        return numerosBancarios;
    }

    private void repartirCuentasAhorro(Banco miBanco, ArrayList<Ahorro> ahorros) {
        Cliente cliente=null;
        for (Ahorro ahorro : ahorros) {
            cliente = miBanco.buscarClientePorNumeroBancario(ahorro.getNumeroBancario());
            if(cliente!=null){
                cliente.setCuentaAhorro(ahorro);
            }
        }
        
    }
    
    private void repartirCuentasCorrientes(Banco miBanco, ArrayList<Corriente> corrientes) {
        Cliente cliente=null;
        for (Corriente corriente : corrientes) {
            cliente = miBanco.buscarClientePorNumeroBancario(corriente.getNumeroBancario());
            if(cliente!=null){
                cliente.setCuentaCorriente(corriente);
            }
        }
        
    }
    
    private void repartirCuentasCDTs(Banco miBanco, ArrayList<CDTs> cuentasCDTs) {
        Cliente cliente=null;
        for (CDTs cuentaCDT : cuentasCDTs) {
            cliente = miBanco.buscarClientePorNumeroBancario(cuentaCDT.getNumeroBancario());
            if(cliente!=null){
                cliente.setCuentaCDT(cuentaCDT);
            }
        }
    }
}
