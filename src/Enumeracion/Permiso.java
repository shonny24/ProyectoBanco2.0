/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumeracion;

/**
 * @author Alejandro
 * @author Shonny
 * @author Juan Carlos
 */
public enum Permiso {

    ADMIN("Admin"),EMPRESA("Empresa"),CLIENTE("Cliente");
    private final String display;

    private Permiso(String display) {
        this.display = display;
    }
    @Override
    public String toString() {
        return display;
    }
    
}
