/*Tp1 Ejercicio 12
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * Existen dos reglas que identifican dos conjuntos de valores:
 * A. El número es de un solo dígito.
 * B. El número es impar.
 * A partir de estas reglas, crear un algoritmo que asigne a las variables booleanas
 * estaEnA, estaEnB, estaEnAmbos y noEstaEnNinguno el valor verdadero o falso,
 * según corresponda, para indicar si el valor ingresado pertenece al primer
 * conjunto, al segundo, a ambos o a ninguno, respectivamente.
 * Definir un lote de prueba de varios números y probar el algoritmo.
 */
package edu.ort.t1.tp1;

import java.util.Scanner;

public class Tp1Ejer12 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int num;
		boolean estaEnA = false;
		boolean estaEnB = false;
		boolean estaEnAmbos = false;
		boolean noEstaEnNinguno = false;
		
		System.out.print("Ingrese un numero:");
		num = input.nextInt();
		estaEnA = (num > 0 && num < 10);
		estaEnB = (num % 2 != 0);
		estaEnAmbos = (estaEnA && estaEnB);
		noEstaEnNinguno = (!estaEnA && !estaEnB);
		if (estaEnAmbos) {
			System.out.print("Esta en ambos");
		} else if (estaEnA) {
			System.out.print("Esta en A");
		} else if (estaEnB) {
			System.out.print("Esta en B");
		} else if(noEstaEnNinguno){
			System.out.print("No esta en ninguno");
		}
		input.close();
	}
}
