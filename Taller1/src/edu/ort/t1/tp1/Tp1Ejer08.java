/*Tp1 Ejercicio 08
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * Dado un valor numérico mayor que 0 ingresado por teclado, mostrar un mensaje
 * por pantalla indicando si el número es par o impar. Para eso debe utilizarse el
 * operador “módulo” (%)
 */
package edu.ort.t1.tp1;

import java.util.Scanner;

public class Tp1Ejer08 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int num;
		
		System.out.print("Ingrese un numero:");
		num = input.nextInt();
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.print("Es par");
			} else
				System.out.print("Es impar");
		} else
			System.out.print("Ingrese un número positivo y distinto de cero.");

		input.close();
	}

}
