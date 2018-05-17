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
 * @author Juan Carlos
 */
public class Corriente extends Cuenta{
    private double monto;

    /**
     *
     * @param monto
     * @param numeroBancario
     * @param fechaCreacion
     */
    public Corriente(double monto, String numeroBancario, Date fechaCreacion) {
        super(numeroBancario, fechaCreacion);
        this.monto = monto;
    }

    /**
     *
     * @return monto
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
