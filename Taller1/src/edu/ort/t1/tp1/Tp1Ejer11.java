/*Tp1 Ejercicio 11
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * Para entrar a la monta�a rusa "Miedo a las alturas", que es algo m�s chica y
 * tranquila, alcanza con que se cumpla una de las siguientes dos condiciones: nos
 * piden ser mayores a 7 a�os � medir m�s de 1,50 m. Definir la operaci�n y validar
 * con el mismo lote de datos del ejercicio anterior.
 */
package edu.ort.t1.tp1;

import java.util.Scanner;

public class Tp1Ejer11 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int edad;
		float altura;
		System.out.print("Ingrese su edad:");
		edad = input.nextInt();
		System.out.print("Ingrese su altura:");
		altura = input.nextFloat();
		if (edad > 7 || altura > 1.50) {
			System.out.print("Puede pasar");
		} else {
			System.out.print("No puede pasar");
		}
		input.close();
	}

}
