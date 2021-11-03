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
        String enviado = cp.enviar("10", "Cloreto de Potássio");
        assertEquals("10 Cloreto de Potássio 1.2 10,0 2168.03 21.68", enviado);
    }
    
}
