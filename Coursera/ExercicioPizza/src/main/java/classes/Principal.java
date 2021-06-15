
package classes;

public class Principal {
    
    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        Pizza[] pizzas = new Pizza[3];
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        Pizza p3 = new Pizza();
      
        p1.adicionaIngrediente("Arroz");
        p1.adicionaIngrediente("Batata");
        p1.adicionaIngrediente("Frango");
        
        p2.adicionaIngrediente("Feijão");
        p2.adicionaIngrediente("Doritos");
        p2.adicionaIngrediente("Picanha");
        p2.adicionaIngrediente("Beterraba");
        p2.adicionaIngrediente("Alho");
        p2.adicionaIngrediente("Mignon");
        
        p3.adicionaIngrediente("Calabresa");
        p3.adicionaIngrediente("Mussarela");
        
        carrinho.adicionarPizza(p1);
        carrinho.adicionarPizza(p2);
        carrinho.adicionarPizza(p3);
        
        carrinho.getResultado();
    }
}
