/*Tp1 Ejercicio 07
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * Suponiendo que el primer día de la semana es el Domingo, pedir un número entre
 * 1 y 7 (inclusive) y mostrar el nombre del día correspondiente. Si el día no está en
 * el rango permitido debe emitir por pantalla un mensaje de error.
 */
package edu.ort.t1.tp1;

import java.util.Scanner;

public class Tp1Ejer07 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int dia;
		
		System.out.print("Ingrese un dia de la semana: ");
		dia = input.nextInt();
		switch (dia) { // selector de variable int o char
		case 1:
			System.out.print("El dia es Domingo");
			break; // salta al fin del switch
		case 2:
			System.out.print("El dia es Lunes");
			break; // salta al fin del switch
		case 3:
			System.out.print("El dia es Martes");
			break; // salta al fin del switch
		case 4:
			System.out.print("El dia es Miercoles");
			break; // salta al fin del switch
		case 5:
			System.out.print("El dia es Jueves");
			break; // salta al fin del switch
		case 6:
			System.out.print("El dia es Viernes");
			break; // salta al fin del switch
		case 7:
			System.out.print("El dia es Sabado");
			break; // salta al fin del switch
		default:
			System.out.print("No existe el dia " + dia);
		} // fin del switch
		input.close();
	}
}
