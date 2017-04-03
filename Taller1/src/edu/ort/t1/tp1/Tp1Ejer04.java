/*Tp1 Ejercicio 03
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * Dados dos números (valor1 y valor2) cargados desde teclado por el usuario,
 * mostrar el resultado de la division del primero por el segundo siguiendo el
 * formato valor1 + “ / “ + valor 2 + “ = “ + resultado. Pero en el caso de que el
 * segundo valor sea cero, en vez de mostrar lo anterior mostrar el siguiente
 * mensaje de error: “No se puede dividir por cero”.
 */
package edu.ort.t1.tp1;

import java.util.Scanner;

public class Tp1Ejer04 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		float numa;
		float numb;
		float resultado;
		System.out.print("Ingrese el valor1:");
		numa = input.nextInt();
		System.out.print("Ingrese el valor2:");
		numb = input.nextInt();
		if (numb != 0) {
			resultado = numa / numb;
			System.out.print("La division entre: " + numa + " y " + numb + " da como resultado " + resultado);
		} else
			System.out.print("No se puede dividir por cero!");
		input.close();
	}

}
