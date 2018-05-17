/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Enumeracion.Permiso;

/**
 * @author Alejandro
 * @author Shonny
 * @author Juan Carlos
 */
public class Usuario {
    private String usuario;
    private String password;
    private String preguntaSeguridad;
    private String respuesta;
    private Permiso permisos;

    /**
     *
     * @param usuario
     * @param password
     * @param preguntaSeguridad
     * @param respuesta
     * @param permisos
     */
    public Usuario(String usuario, String password, String preguntaSeguridad, String respuesta, Permiso permisos) {
        this.usuario = usuario;
        this.password = password;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuesta = respuesta;
        this.permisos = permisos;
    }

    /**
     *
     * @return
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     *
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    /**
     *
     * @param preguntaSeguridad
     */
    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    /**
     *
     * @return
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     *
     * @param respuesta
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     *
     * @return
     */
    public Permiso getPermisos() {
        return permisos;
    }

    /**
     *
     * @param permisos
     */
    public void setPermisos(Permiso permisos) {
        this.permisos = permisos;
    }


    
    
}
