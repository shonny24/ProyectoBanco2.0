/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 * @author ALejandro
 * @author Shonny
 * @author Juan Carlos
 */
public class Nomina extends Cuenta {

    private Empresa empresa;
    private Cliente cliente;
    private double monto;

    /**
     *
     * @param empresa
     * @param cliente
     * @param monto
     * @param numeroBancario
     * @param fechaCreacion
     */
    public Nomina(Empresa empresa, Cliente cliente, double monto, String numeroBancario, Date fechaCreacion) {
        super(numeroBancario, fechaCreacion);
        this.empresa = empresa;
        this.cliente = cliente;
        this.monto = monto;
        
        cliente.getNominasCliente().add(this);
        empresa.getNominasEmpresa().add(this);
    }

    /**
     *
     * @return
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     *
     * @param empresa
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa.getNominasEmpresa().remove(this);
        this.empresa = empresa;
        empresa.getNominasEmpresa().add(this);
    }

    /**
     *
     * @return
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     *
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente.getNominasCliente().remove(this);
        this.cliente = cliente;
        cliente.getNominasCliente().add(this);
    }

    /**
     *
     * @return
     */
    public double getMonto() {
        return monto;
    }

    /**
     *
     * @param monto
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }
    

}
