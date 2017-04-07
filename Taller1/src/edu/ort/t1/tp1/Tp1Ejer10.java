/*Tp1 Ejercicio 10
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * Para entrar a la montaña rusa "Infierno en las alturas" nos piden tener al menos 7
 * años y medir más de 1,40 m. Definir la operación necesaria y probarla con los
 * siguientes datos:
 */
package edu.ort.t1.tp1;

import java.util.Scanner;

public class Tp1Ejer10 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int edad;
		float altura;
		
		System.out.print("Ingrese su edad:");
		edad = input.nextInt();
		System.out.print("Ingrese su altura:");
		altura = input.nextFloat();
		if (edad >= 7 && altura > 1.40) {
			System.out.print("Puede pasar");
		} else {
			System.out.print("No puede pasar");
		}
		input.close();
	}
}
