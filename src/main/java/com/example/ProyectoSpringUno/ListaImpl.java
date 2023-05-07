package com.example.ProyectoSpringUno;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaImpl implements Lista {
    public void agregarElementos(ArrayList<String> lista) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese elementos a la lista, ingrese 'fin' para terminar:");
        String elemento = scanner.nextLine();
        while (!elemento.equals("fin")) {
            lista.add(elemento);
            elemento = scanner.nextLine();
        }
    }

    public void mostrarElementos(ArrayList<String> lista) {
        System.out.println("Los elementos de la lista son:");
        for (String e : lista) {
            System.out.println(e);
        }
    }

    public void eliminarElemento(ArrayList<String> lista) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el índice del elemento que desea eliminar:");
        String entrada = scanner.nextLine();

        try {
            int indice = Integer.parseInt(entrada);

            if (indice >= 0 && indice < lista.size()) {
                lista.remove(indice);
                System.out.println("El elemento ha sido eliminado.");
                mostrarElementos(lista);
            } else {
                System.out.println("El índice ingresado no es válido.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Debe ingresar un número como índice.");
        }
    }

    public void modificarElemento(ArrayList<String> lista) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el índice del elemento que desea modificar:");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < lista.size()) {
            System.out.println("Ingrese el nuevo valor del elemento:");
            String nuevoValor = scanner.next();

            lista.set(indice, nuevoValor);
            System.out.println("El elemento ha sido modificado.");
            mostrarElementos(lista);
        } else {
            System.out.println("El índice ingresado no es válido.");
        }
    }
}
