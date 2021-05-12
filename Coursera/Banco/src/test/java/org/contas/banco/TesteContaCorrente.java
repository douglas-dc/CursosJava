
package org.contas.banco;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TesteContaCorrente {
    
    @Test
    public void deposito() {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(200);
        assertEquals(200, cc.saldo);
    }
    
}
