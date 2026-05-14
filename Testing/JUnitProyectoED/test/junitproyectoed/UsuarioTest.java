/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package junitproyectoed;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alex
 */
public class UsuarioTest {

    @Test
    public void testValidarCredencialesCorrectas() {
        String codigoGenerado = "676942";
        String codigoUsuario = "676942";
        Usuario instance = new Usuario();
        
        boolean expResult = true;
        boolean result = instance.validarCredenciales(codigoGenerado, codigoUsuario);
        
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarCredencialesIncorrectas() {
        String codigoGenerado = "676942";
        String codigoUsuario = "499371";
        Usuario instance = new Usuario();
        
        boolean expResult = false;
        boolean result = instance.validarCredenciales(codigoGenerado, codigoUsuario);
        
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarCredencialesVacias() {
        String codigoGenerado = "";
        String codigoUsuario = "";
        Usuario instance = new Usuario();
        
        boolean expResult = false;
        boolean result = instance.validarCredenciales(codigoGenerado, codigoUsuario);
        
        assertEquals(expResult, result);
    }

    @Test
    public void testValidarCredencialesNull() {
        String codigoGenerado = "";
        String codigoUsuario = "";
        Usuario instance = new Usuario();
        
        boolean expResult = false;
        boolean result = instance.validarCredenciales(codigoGenerado, codigoUsuario);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidarCredencialesLongitudIncorrectaMenor() {
        String codigoGenerado = "1829";
        String codigoUsuario = "123654";
        Usuario instance = new Usuario();
        
        boolean expResult = false;
        boolean result = instance.validarCredenciales(codigoGenerado, codigoUsuario);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidarCredencialesLongitudIncorrectaMayor() {
        String codigoGenerado = "182911";
        String codigoUsuario = "123654789";
        Usuario instance = new Usuario();
        
        boolean expResult = false;
        boolean result = instance.validarCredenciales(codigoGenerado, codigoUsuario);
        
        assertEquals(expResult, result);
    }

}
