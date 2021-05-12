
package org.test;

import org.carros.Carro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteCarros {
    
    @Test
    public void testAcelerar() {
        Carro c = new Carro();
        c.potencia = 10;
        c.acelerar();
        assertEquals(10, c.getVelocidade());
    }
    
}
