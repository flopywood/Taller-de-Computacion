/*Tp1 Ejercicio 03
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * Luego de ingresar por teclado dos números n1 y n2, mostrar el resultado de la
suma entre ambos, utilizando el siguiente formato:
“La suma entre “ + n1 + “ y “ + n2 + “ da como resultado “ + n1 + n2.
¿El resultado que se ve en pantalla es correcto? ¿Cómo se puede solucionar?
 */
package edu.ort.t1.tp1;

import java.util.Scanner;

public class Tp1Ejer03 {

	private static Scanner input;

	public static void main(String[] args) {
		int numa;
		int numb;
		int resultado;
		input = new Scanner(System.in);
		
		System.out.print("Ingrese el valor de numa:");
		numa = input.nextInt();
		System.out.print("Ingrese el valor de numb:");
		numb = input.nextInt();
		resultado = numa + numb;
		System.out.print("La suma entre " + numa + " y " + numb + " da como resultado:" + resultado);
		input.close();
	}

}
