/*Tp1 Ejercicio 09
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * Dados 2 valores numéricos num1 y num2, ingresados por teclado, asignar en la
 *  variable booleana sonIguales el valor correspondiente a partir de los valores de la
 *  comparación entre ambos (verdadero si son iguales, falso si no lo son).
 */
package edu.ort.t1.tp1;

import java.util.Scanner;

public class Tp1Ejer09 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int num1;
		int num2;
		boolean sonIguales = false;
		
		System.out.print("Ingrese un numero: ");
		num1 = input.nextInt();
		System.out.print("Ingrese otro numero: ");
		num2 = input.nextInt();
		sonIguales = num1 == num2;
		if (sonIguales) {
			System.out.print("Son iguales");
		} else {
			System.out.print("No son iguales");
		}
		input.close();
	}
}
