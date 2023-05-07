package com.example.ProyectoSpringUno;

import java.util.ArrayList;

public abstract class ListaAbstracta implements Lista {
    protected ArrayList<String> lista;

    public ListaAbstracta() {
        lista = new ArrayList<>();
    }

    public void mostrarElementos() {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía. No hay elementos para mostrar.");
        } else {
            System.out.println("Los elementos de la lista son:");
            for (String elemento : lista) {
                System.out.println(elemento);
            }
        }
    }
}
