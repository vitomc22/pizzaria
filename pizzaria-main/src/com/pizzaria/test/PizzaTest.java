/**
 *
 */
package com.pizzaria.test;

import com.pizzaria.CarrinhoDeCompras;
import com.pizzaria.Pizza;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author victor
 *
 */
class PizzaTest {

    @Test
    void testZeraIngredientes() {
        Pizza pizza = new Pizza();
        Pizza.zeraIngredientes();
        assertEquals(0, pizza.getQtdeIngredientes());
    }

    @Test
    void testeUniIngrediente() {
        Pizza pizza = new Pizza();
        Pizza.zeraIngredientes();
        pizza.adicionarIngrediente("pepeoni", 10);
        int ingredientePizza = pizza.getQtdeIngredientes();
        assertEquals(1, ingredientePizza);
    }


    @Test
    void testPreco() {
        Pizza pizza = new Pizza();
        Pizza.zeraIngredientes();
        pizza.adicionarIngrediente("pepeoni", 10);
        int precoPizza = pizza.getPreco();
        assertEquals(23, precoPizza);
    }

    @Test
    void testeAdionaIngredienteTotal() {
        Pizza pizza = new Pizza();
        Pizza.zeraIngredientes();
        pizza.adicionarIngrediente("peperoni", 10);
        int ingredientePizza = pizza.getQtdeIngredientes();
        assertEquals(1, ingredientePizza);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(pizza);
        HashMap<String, Integer> ingredientes = carrinho.getIngredientes();
        assertEquals(10, ingredientes.get("peperoni"));

    }


}
