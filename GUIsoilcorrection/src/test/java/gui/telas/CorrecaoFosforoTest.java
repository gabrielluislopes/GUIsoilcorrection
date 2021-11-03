/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package gui.telas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gabri
 */
public class CorrecaoFosforoTest {
    
    public CorrecaoFosforoTest() {
    }

    @Test
    public void testEnviar() {
        var cf = new CorrecaoFosforo();
        String enviado = cf.enviar("10", "Superfosfato Simples", "70");
        assertEquals("10 Superfosfato Simples 70 51.25 0.51 5.1 14.4", enviado);
    }
    
}
