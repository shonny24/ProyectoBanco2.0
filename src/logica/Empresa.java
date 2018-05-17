/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Enumeracion.Permiso;
import java.util.ArrayList;

/**
 * @author Alejandro
 * @author Shonny
 * @author Juan Carlos
 */
public class Empresa extends Usuario {

    private String razonSocial;
    private String NIT;
    private ArrayList<Nomina> nominasEmpresa;

    /**
     *
     * @param razonSocial
     * @param NIT
     * @param usuario
     * @param password
     * @param preguntaSeguridad
     * @param respuesta
     * @param permisos
     */
    public Empresa(String razonSocial, String NIT, String usuario, String password, String preguntaSeguridad, String respuesta, Permiso permisos) {
        super(usuario, password, preguntaSeguridad, respuesta, permisos);
        this.razonSocial = razonSocial;
        this.NIT = NIT;
        nominasEmpresa = new ArrayList<>();
    }

    public Nomina buscarCuentaNomina(String numeroBanco) {
        for (Nomina nomina : nominasEmpresa) {
            if (numeroBanco.equals(nomina.getNumeroBancario())) {
                return nomina;
            }
        }
        return null;
    }

    /**
     *
     * @param id
     * @param monto
     * @return
     */
    public boolean agregarMontoNomina(String id, double monto) {
        Nomina nomina = buscarCuentaNomina(id);
        double montoGuardado;
        double montoTotal;
        if (nominasEmpresa != null) {
            if (id.equals(nomina.getNumeroBancario())) {
                montoGuardado=nomina.getMonto();
                montoTotal=montoGuardado+monto;
                nomina.setMonto(montoTotal);
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @return
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     *
     * @param razonSocial
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     *
     * @return
     */
    public String getNIT() {
        return NIT;
    }

    /**
     *
     * @param NIT
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    /**
     *
     * @return
     */
    public ArrayList<Nomina> getNominasEmpresa() {
        return nominasEmpresa;
    }

    /**
     *
     * @param nominasEmpresa
     */
    public void setNominasEmpresa(ArrayList<Nomina> nominasEmpresa) {
        this.nominasEmpresa = nominasEmpresa;
    }

    @Override
    public String toString() {
        return "Razon Social: " + razonSocial + "\n"
                + "NIT: " + NIT;
    }

}
