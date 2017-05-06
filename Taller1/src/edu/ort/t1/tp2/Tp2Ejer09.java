/*Tp 2 Ejercicio 09
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * Ingresar N juegos de N1 valores enteros cada uno, donde N se informa al comienzo 
 * y N1 al cargar cada juego. Emitir el promedio más alto y la suma total de todos los juegos.
 */
package edu.ort.t1.tp2;

import java.util.Scanner;

public class Tp2Ejer09 {
	public static Scanner input;

	public static void muestraResultados(int total, float promedio) {
		System.out.println("*******************************************");
		System.out.println("La suma total de valores ingresados es: " + total);
		System.out.println("El promedio más alto registrado es: " + promedio);
		System.out.println("*******************************************");
	}

	public static int pideValores(int n1) {
		int valor;
		int sumaParcial = 0;
		for (int j = 1; j <= 1; j++) {
			valor = pideNum("Ingresa el valor " + j + "(mayor a 0):");
			sumaParcial += valor;
		}
		return sumaParcial;
	}

	public static int pideNum(String txt) {
		int num = 0;
		do {
			System.out.print(txt);
			num = input.nextInt();
		} while (num <= 0);
		return num;
	}

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n = 0;
		int n1 = 0;
		float prom = 0;
		float promMax = 0;
		int sumaParcial = 0;
		int sumaTotal = 0;

		n = pideNum("Por favor ingrese la cantidad de juegos(debe ser mayor a 0):");
		for (int i = 1; i <= n; i++) {
			// pide cantidad de vuelta que se van a dar por juego
			System.out.println("****JUEGO NRO." + i + "****");
			n1 = pideNum("Por favor ingrese la cantidad de juegos(debe ser mayor a 0):");
			prom = 0;
			// realiza todas las vueltas indicadas y solicita valores
			sumaParcial = pideValores(n1);
			// calcula promedio
			prom = (float) sumaParcial / (float) n1;
			// compara el promedio actual con el más grande, si este es mayor
			// pasa a ser el promMax
			if (prom > promMax)
				promMax = prom;
			sumaTotal += sumaParcial;
		}
		muestraResultados(sumaTotal, promMax);
		input.close();
	}

}
