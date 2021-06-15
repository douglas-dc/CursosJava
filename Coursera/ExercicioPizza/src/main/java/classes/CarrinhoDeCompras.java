
package classes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Pizza> pizzas = new ArrayList<>();
    static double total = 0;
    
    
    public void adicionarPizza(Pizza pizzas){
        this.pizzas.add(pizzas);
    }
    
    public double valorTotal(){
        for (Pizza p : this.pizzas) {
            total += p.getPreco();
        }
        return total;
    }
    
    public void getResultado(){
       System.out.printf("Valor total das pizzas: R$%.2f", valorTotal());
    }
    
    @Override
    public String toString() {
        return "Valor total das pizzas: R$ " + valorTotal();
    }
}
