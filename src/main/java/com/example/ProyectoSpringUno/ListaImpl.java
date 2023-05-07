package com.example.ProyectoSpringUno;

import java.util.Scanner;

public class ListaImpl extends ListaAbstracta {

    public void agregarElementos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese elementos a la lista, ingrese 'fin' para terminar:");
        String elemento = scanner.nextLine();
        while (!elemento.equals("fin")) {
            lista.add(elemento);
            elemento = scanner.nextLine();
        }
    }

    public void eliminarElemento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el índice del elemento que desea eliminar:");
        int indice = scanner.nextInt();

        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
            System.out.println("El elemento ha sido eliminado.");
            mostrarElementos();
        } else {
            System.out.println("El índice ingresado no es válido.");
        }
    }

    public void modificarElemento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el índice del elemento que desea modificar:");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < lista.size()) {
            System.out.println("Ingrese el nuevo valor del elemento:");
            String nuevoValor = scanner.next();

            lista.set(indice, nuevoValor);
            System.out.println("El elemento ha sido modificado.");
            mostrarElementos();
        } else {
            System.out.println("El índice ingresado no es válido.");
        }
    }

    /*
    public void mostrarElementos() {
        System.out.println("Los elementos de la lista son:");
        for (String e : lista) {
            System.out.println(e);
        }
    }*/

}

