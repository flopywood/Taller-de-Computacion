/*Tp1 Ejercicio 06
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
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
		if (a > b) 
			if (a > c) {
				System.out.print("El mayor es " + a);
			} else
				System.out.print("El mayor es " + c);
			else if (b > c) {
				System.out.print("El mayor es " + b);
			} else if(c>b)
				System.out.print("El mayor es " + c);
			else
				System.out.print("Son todos iguales");
		input.close();
	}
}
