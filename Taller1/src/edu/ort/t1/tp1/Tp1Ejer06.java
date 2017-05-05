/*Tp1 Ejercicio 06
 * Dados tres numeros, informar el valor del mayor de todos (suponer que los tres
 * valors son distintos).
 */
package edu.ort.t1.tp1;

import java.util.Scanner;

public class Tp1Ejer06 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int a;
		int b;
		int c;

		System.out.print("Ingrese un numero a:");
		a = input.nextInt();
		System.out.print("Ingrese un numero b:");
		b = input.nextInt();
		System.out.print("Ingrese un numero c:");
		c = input.nextInt();

		if (a > b && a > c) {
			System.out.print("El mayor es: " + a);
		}
		else if (b > c) {
			System.out.print("El mayor es: " + b);
		}
		else if (a == b && b == c) {
			System.out.print("Todos los numeros son iguales");
		}
		else {
			System.out.print("El mayor es: " + c)
		}

		input.close();
	}
}
