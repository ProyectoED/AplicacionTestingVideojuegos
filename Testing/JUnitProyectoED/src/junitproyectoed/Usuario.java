/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junitproyectoed;

/**
 *
 * @author alex
 */
public class Usuario {    
    public boolean validarCredenciales(String codigoGenerado, String codigoUsuario) {

        if (codigoGenerado == null || codigoUsuario == null) {
            return false;
        }
        
        if (codigoGenerado == "" || codigoUsuario == "") {
            return false;
        }
        
        if (codigoGenerado.length() != 6 || codigoUsuario.length() != 6) {
            return false;
        }

        return codigoGenerado.equals(codigoUsuario);
    }
}
