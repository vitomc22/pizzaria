package com.pizzaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Pizza> pizzas = new ArrayList<>();

    public void adicionaPizza(Pizza pizza) {
        if (pizza.getQtdeIngredientes() > 0) {
            pizzas.add(pizza);
        } else if (pizza.getQtdeIngredientes() <= 0) {
            throw new RuntimeException("Não pode adiconar pizza sem ingredientes!");
        }

    }


    public Integer getTotalPreco() {
        int total = 0;
        for (Pizza item : pizzas) {
            total += item.getPreco();
        }
        return total;
    }


    public HashMap<String, Integer> getIngredientes() {
        HashMap<String, Integer> cesta = new HashMap<>();
        for (Pizza item : pizzas) {
            HashMap<String, Integer> ingredientes = item.getIngredientes();
            for (String key : ingredientes.keySet()) {
                Integer total = ingredientes.get(key);
                if (cesta.containsKey(key)) {
                    total += cesta.get(key);
                }
                cesta.put(key, total);
            }
        }

        return cesta;
    }

}