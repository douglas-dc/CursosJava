
package classes;
 
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    
    public List<String> ingredientes = new ArrayList();
    private double preco;

    public Pizza() {
    }

    double getPreco() {
        return preco;
    }

    public void adicionaIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
        contabilizaIngrediente();
    }
    
    private void contabilizaIngrediente(){
       int qntdIngredientes = ingredientes.size();
       if (qntdIngredientes > 0 && qntdIngredientes <=2) {
            preco = 15;
        } else if (qntdIngredientes > 2 && qntdIngredientes <=5) {
            preco = 20;
        } else if (qntdIngredientes > 5) {
            preco = 23;
        } else {
            preco = 0;
        }
    }
    
    
}
