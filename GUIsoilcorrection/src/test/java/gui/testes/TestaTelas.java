package gui.testes;

import gui.telas.CorrecaoCalcioMagnesio;
import gui.telas.CorrecaoFosforo;
import gui.telas.CorrecaoPotassio;
import gui.telas.MenuPrincipal;
import gui.telas.ValoresIdeais;
import org.junit.jupiter.api.Test;

/**
 *
 * @author gabri
 */
public class TestaTelas {
    
    public TestaTelas() {
    }

    @Test
    public void testaTelaPrincipal(){
        var mp = new MenuPrincipal();
        mp.setVisible(true);
    }
    
    @Test
    public void testaCorrecaoCalcioMagnesio(){
        var ccm = new CorrecaoCalcioMagnesio();
        ccm.setVisible(true);
    }
    
    @Test
    public void testaCorrecaoFosforo(){
        var cf = new CorrecaoFosforo();
        cf.setVisible(true);
    }
    
    @Test
    public void testaCorrecaoPotassio(){
        var cp = new CorrecaoPotassio();
        cp.setVisible(true);
    }
    
    @Test
    public void testaValoresIdeais(){
        var vi = new ValoresIdeais();
        vi.setVisible(true);
    }
    
}
