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
public class CorrecaoPotassioTest {
    
    public CorrecaoPotassioTest() {
    }

    @Test
    public void testEnviar(){
        var cp = new CorrecaoPotassio();
        String enviado = cp.enviar("10", "Sulfato Potássio/Magnésio");
        assertEquals("110 110 110 110", enviado);
    }
    
}
