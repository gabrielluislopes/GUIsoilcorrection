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
public class CorrecaoCalcioMagnesioTest {
    
    public CorrecaoCalcioMagnesioTest() {
    }

    @Test
    public void testEnviar() {
        var ccm = new CorrecaoCalcioMagnesio();
        String enviado = ccm.enviar("10", "Calcário Calcítico", "10", "10");
        assertEquals("10 Calcário Dolomítico 10 10 44.7 44.7 12.6 12.6 0.00 0.00", enviado);
    }
    
}
