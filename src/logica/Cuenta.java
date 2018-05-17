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
public class Cuenta{
    private String numeroBancario;
    private Date fechaCreacion;

    /**
     *
     * @param numeroBancario
     * @param fechaCreacion
     */
    public Cuenta(String numeroBancario, Date fechaCreacion) {
        this.fechaCreacion=fechaCreacion;
        this.numeroBancario = numeroBancario;
    }

    /**
     *
     * @return
     */
    public String getNumeroBancario() {
        return numeroBancario;
    }

    /**
     *
     * @param numeroBancario
     */
    public void setNumeroBancario(String numeroBancario) {
        this.numeroBancario = numeroBancario;
    }

    /**
     *
     * @return
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     *
     * @param fechaCreacion
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    
    
    
}
