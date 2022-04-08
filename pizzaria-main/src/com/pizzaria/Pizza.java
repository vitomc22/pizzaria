package com.pizzaria;

import java.util.HashMap;

public class Pizza {
    private static final HashMap<String, Integer> ingredientes = new HashMap<>();

    public static void zeraIngredientes() {
        ingredientes.clear();
    }

    public void adicionarIngrediente(String ingrediente, Integer qtde) {

        ingredientes.put(ingrediente, qtde);
    }

    public int getQtdeIngredientes() {
        return ingredientes.size();
    }


    public int getPreco() {
        int total = 0;

        for (Integer value : ingredientes.values()) {
            int preco;
            if (value <= 2) {
                preco = 15;
            } else if (value <= 5) {
                preco = 20;
            } else {
                preco = 23;
            }
            total += preco;
        }

        return total;

    }


    public HashMap<String, Integer> getIngredientes() {
        return ingredientes;
    }

}