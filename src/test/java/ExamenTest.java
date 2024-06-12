/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.examen.Examen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author persona
 */
public class ExamenTest {
    private  Examen miCuenta;
    
    @BeforeEach
    void setUp() {
        miCuenta = new Examen();
        miCuenta.dSaldo = 100; // Inicializar el saldo con 1000 euros para las pruebas
    }
    
    @Test
    void testIngresarCantidadPositiva() {
        miCuenta.ingresar(100);
        assertEquals(100, miCuenta.dSaldo);
    }

    @Test
    void testIngresarCantidadNegativa() {
        int resultado = miCuenta.ingresar(-100);
        assertEquals(1, resultado);
        assertEquals(0, miCuenta.dSaldo);
    }

    @Test
    void testIngresarCantidadCero() {
        int resultado = miCuenta.ingresar(0);
        assertEquals(1, resultado);
        assertEquals(0, miCuenta.dSaldo);
    }

    @Test
    void testIngresarCantidadSuperiorA3000() {
        
        int resultado = miCuenta.ingresar(4000);
        assertEquals(1, resultado);
        assertEquals(0, miCuenta.dSaldo);
    }

    @Test
    void testRetirarCantidadPositiva() {
        miCuenta.ingresar(100);
        miCuenta.retirar(50);
        assertEquals(50, miCuenta.dSaldo);
    }

    @Test
    void testRetirarCantidadNegativa() {
        miCuenta.ingresar(100);
        miCuenta.retirar(-50);
        assertEquals(100, miCuenta.dSaldo);
    }

    @Test
    void testRetirarCantidadSuperiorAlSaldo() {
        miCuenta.ingresar(100);
        miCuenta.retirar(150);
        assertEquals(100, miCuenta.dSaldo);
    }
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
