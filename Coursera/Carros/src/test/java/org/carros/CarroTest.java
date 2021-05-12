package org.carros;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarroTest {

    public CarroTest() {
    }

    @Test
    public void testFrear() {
        Carro z = new Carro();
        z.potencia = 10;
        z.acelerar();
        z.frear();
        assertEquals(5, z.getVelocidade());
    }

    @Test
    public void testGetVelocidade() {
        Carro c = new Carro();
        c.velocidade = 5;
        c.potencia = 10;
        c.acelerar();
        assertEquals(15, c.getVelocidade());

    }

}
