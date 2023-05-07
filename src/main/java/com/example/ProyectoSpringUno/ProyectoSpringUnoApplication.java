package com.example.ProyectoSpringUno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class ProyectoSpringUnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringUnoApplication.class, args);

		System.out.println("\n ARRAYLIST ");
		Scanner entrada = new Scanner(System.in);

		ArrayList<String> listaDos = new ArrayList<String>();

		//interface+       =     clase
		Lista listaImplEmn = new ListaImpl();

		int opcion = 0;

		while (opcion != 5) {
			System.out.println();
			System.out.println("1 = Agregar elementos");
			System.out.println("2 = Mostrar elementos");
			System.out.println("3 = Eliminar elemento");
			System.out.println("4 = Modificar elemento");
			System.out.println("5 = Salir");

			System.out.println("Elija una opción");
			opcion = entrada.nextInt();

			if (opcion == 1) {
				listaImplEmn.agregarElementos(listaDos);
			} else if (opcion == 2) {
				listaImplEmn.mostrarElementos(listaDos);
			} else if (opcion == 3) {
				listaImplEmn.eliminarElemento(listaDos);
			} else if (opcion == 4) {
				listaImplEmn.modificarElemento(listaDos);
			} else if (opcion == 5) {
				System.out.println("Saliendo...");
			} else {
				System.out.println("Seleccione una opción correcta");
			}
		}
	}
}
