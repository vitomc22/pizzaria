package com.pizzaria;

public class Principal {
    public static void main(String[] args){
        Pizza pizza1 = new Pizza();
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        pizza1.adicionarIngrediente("peperoni",1);
        pizza1.adicionarIngrediente("mozzarela",2);
        carrinho.adicionaPizza(pizza1);
        System.out.println("A primeira pizza t�m " + pizza1.getIngredientes() + " ingredientes.");
        System.out.println("O pre�o da primeira pizza �: R$ " + pizza1.getPreco());
        System.out.println(" ");

        Pizza pizza2 = new Pizza();
        pizza2.adicionarIngrediente("peperoni",2);
        pizza2.adicionarIngrediente("mozzarela",5);
        pizza2.adicionarIngrediente("molho de tomate",6);
        carrinho.adicionaPizza(pizza2);
        System.out.println("A segunda pizza t�m " + pizza2.getIngredientes() + " ingredientes.");
        System.out.println("O pre�o da segunda pizza �: R$ " + pizza2.getPreco());
        System.out.println(" ");

        Pizza pizza3 = new Pizza();
        pizza3.adicionarIngrediente("peperoni",3);
        pizza3.adicionarIngrediente("mozzarela",1);
        pizza3.adicionarIngrediente("molho de tomate",2);
        pizza3.adicionarIngrediente("calabresa",4);
        pizza3.adicionarIngrediente("milho",1);
        pizza3.adicionarIngrediente("frango",3);
        carrinho.adicionaPizza(pizza3);
        System.out.println("A terceira pizza t�m " + pizza3.getIngredientes() + " ingredientes.");
        System.out.println("O pre�o da terceira pizza �: R$ " + pizza3.getPreco());
        System.out.println(" ");

        Pizza pizza4 = new Pizza();
        pizza4.adicionarIngrediente("peperoni",2);
        pizza4.adicionarIngrediente("mozzarela",1);
        pizza4.adicionarIngrediente("molho de tomate",6);
        pizza4.adicionarIngrediente("calabresa",2);
        pizza4.adicionarIngrediente("milho",2);
        pizza4.adicionarIngrediente("frango",1);
        carrinho.adicionaPizza(pizza4);
        System.out.println("A quarta pizza t�m " + pizza4.getIngredientes() + " ingredientes.");
        System.out.println("O pre�o da quarta pizza �: R$ " + pizza4.getPreco());
        System.out.println(" ");

        System.out.println("O total do carrinho �: R$ " + carrinho.getTotalPreco());
        System.out.println("O total de ingredientes nas pizzas �: " + carrinho.getIngredientes());

    }


}
