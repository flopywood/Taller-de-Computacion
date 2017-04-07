/*Tp1 Ejercicio 05
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * Ingresar valores para las variables a y b. Una vez cargadas mostrar las variables
 * por pantalla, intercambiar entre sí sus valores (que lo cargado en a quede en b, y
 * viceversa) y volver a mostrarlas.
 */
package edu.ort.t1.tp1;

import java.util.Scanner;

public class Tp1Ejer05 {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int a;
		int b;
		int aux;
		
		System.out.print("Ingrese valor de a:");
		a = input.nextInt();
		System.out.print("Ingrese valor de b:");
		b = input.nextInt();
		System.out.println("El nuevo valor de a es: " + a + " y el nuevo de b es: " + b);
		aux=a;
		a=b;
		b=aux;
		System.out.print("El nuevo valor de a es: " + a + " y el nuevo de b es: " + b);
		input.close();
	}

}
