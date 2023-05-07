package com.example.ProyectoSpringUno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class ProyectoSpringUnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringUnoApplication.class, args);

		System.out.println("\nARRAYLIST");
		Scanner entrada = new Scanner(System.in);

		ArrayList<String> lista = new ArrayList<String>();
		ListaAbstracta listaImpl = new ListaImpl();

		int x = 0, opcion = 0;

		while (x == 0) {
			System.out.println();
			System.out.println("1 = Agregar elementos");
			System.out.println("2 = Mostrar elementos");
			System.out.println("3 = Eliminar elemento");
			System.out.println("4 = Modificar elemento");
			System.out.println("0 = Salir");

			System.out.println("Elija una opción");
			opcion = entrada.nextInt();

			if (opcion == 1) {
				listaImpl.agregarElementos();
			} else if (opcion == 2) {
				listaImpl.mostrarElementos();
			} else if (opcion == 3) {
				listaImpl.eliminarElemento();
			} else if (opcion == 4) {
				listaImpl.modificarElemento();
			} else if (opcion == 0) {
				System.out.println("Saliendo...");
				x = 1;
			} else {
				System.out.println("Seleccione una opción correcta");
			}
		}
	}
}
