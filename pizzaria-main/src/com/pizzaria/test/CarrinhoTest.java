/**
 *
 */
package com.pizzaria.test;

import com.pizzaria.CarrinhoDeCompras;
import com.pizzaria.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author victor
 *
 */
class CarrinhoTest {

    @Test
    void testZeraIngredientes() {
        Pizza pizza = new Pizza();
        Pizza.zeraIngredientes();
        assertEquals(0, pizza.getQtdeIngredientes());
    }

    @Test
    void testePrecoTotal() {
        Pizza pizza = new Pizza();
        Pizza.zeraIngredientes();
        pizza.adicionarIngrediente("pepeoni", 10);
        pizza.adicionarIngrediente("calabresa", 20);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(pizza);
        carrinho.getTotalPreco();
        assertEquals(46, carrinho.getTotalPreco());

    }

    @Test
    void testeAdicionaVazio() {
        Pizza pizza1 = new Pizza();
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pizza.zeraIngredientes();
        assertThrows(RuntimeException.class, () -> carrinho.adicionaPizza(pizza1));


    }


}
