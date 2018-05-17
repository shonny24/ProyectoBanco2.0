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
public class CDTs extends Cuenta{
    private double montoInversion;
    private int porcentajeInteresPagado;
    private boolean pagoMensual;

    /**
     *
     * @param montoInversion
     * @param porcentajeInteresPagado
     * @param pagoMensual
     * @param numeroBancario
     * @param fechaCreacion
     */
    public CDTs(double montoInversion, int porcentajeInteresPagado, boolean pagoMensual, String numeroBancario, Date fechaCreacion) {
        super(numeroBancario, fechaCreacion);
        this.montoInversion = montoInversion;
        this.porcentajeInteresPagado = porcentajeInteresPagado;
        this.pagoMensual = pagoMensual;
    }

    /**
     *
     * @return
     */
    public double getMontoInversion() {
        return montoInversion;
    }

    /**
     *
     * @param montoInversion
     */
    public void setMontoInversion(double montoInversion) {
        this.montoInversion = montoInversion;
    }

    /**
     *
     * @return
     */
    public int getPorcentajeInteresPagado() {
        return porcentajeInteresPagado;
    }

    /**
     *
     * @param porcentajeInteresPagado
     */
    public void setPorcentajeInteresPagado(int porcentajeInteresPagado) {
        this.porcentajeInteresPagado = porcentajeInteresPagado;
    }

    /**
     *
     * @return
     */
    public boolean isPagoMensual() {
        return pagoMensual;
    }

    /**
     *
     * @param pagoMensual
     */
    public void setPagoMensual(boolean pagoMensual) {
        this.pagoMensual = pagoMensual;
    }
    
    

    @Override
    public String toString() {
        return "CDTs{" +super.toString()+ "montoInversion=" + montoInversion + ", porcentajeInteresPagado=" + porcentajeInteresPagado + ", pagoMensual=" + pagoMensual + '}';
    }

   
}
