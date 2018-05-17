/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 * @author Alejandro
 * @author Shonny
 * @author Juan Camilo
 */
public class Ahorro extends Cuenta{
    private Date fechaRetiroAhorros;
    private double monto;

    /**
     *
     * @param fechaRetiroAhorros
     * @param monto
     * @param numeroBancario
     * @param fechaCreacion
     */
    public Ahorro(Date fechaRetiroAhorros, double monto, String numeroBancario, Date fechaCreacion) {
        super(numeroBancario, fechaCreacion);
        this.fechaRetiroAhorros = fechaRetiroAhorros;
        this.monto = monto;
    }

    /**
     *
     * @return
     */
    public Date getFechaRetiroAhorros() {
        return fechaRetiroAhorros;
    }

    /**
     *
     * @param fechaRetiroAhorros
     */
    public void setFechaRetiroAhorros(Date fechaRetiroAhorros) {
        this.fechaRetiroAhorros = fechaRetiroAhorros;
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
