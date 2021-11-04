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
public class ValoresIdeaisTest {
    
    public ValoresIdeaisTest() {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testEnviar() {
        var vi = new ValoresIdeais();
        String envio1 = vi.enviar("1", "2", "3", "4", "5", "6", "7");
        assertEquals("1 1 4 4 9 9 16 16 25 25 36 36 49 49", envio1);
        String envio2 = vi.enviar("1", "1", "1", "1", "1", "1", "1");
        assertEquals("1 1 2 2 3 3 4 4 5 5 6 6 7 7", envio2);
    }
    
}
