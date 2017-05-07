/*Tp 2 Ejercicio 04
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernandes Rodrigo, Ocampos Nahuel
 *A partir de un valor ingresado por el usuario (el cual deberá estar comprendido
 *entre 2 y 9, inclusive), generar y mostrar todos los múltiplos del mismo menores
 *a 100, primero en forma ascendente y luego en sentido inverso, dentro del mismo programa. 
 */
package edu.ort.t1.tp2;

import java.util.Scanner;

public class Tp2Ejer04 {
	public static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int num = 0;
		int min = 2;
		int max = 9;
		int i = 1;
		int ultimoMultiplo = 1;
		int res = 0;

		String leyenda = "Por favor ingresa un numero que se encuentre entre 2 y 9 inclusive:";
		do {
			System.out.print(leyenda);
			num = input.nextInt();
		} while (num < min || num > max);
		System.out.println("Multiplos ASCENDENTES de " + num);
		res = num;
		do {
			ultimoMultiplo = i;
			System.out.println(num + " x " + i + " = " + res);
			i++;
			res = num * i;
		} while (res < 100);
		System.out.println("Multiplos DESCENDENTES de " + num);
		while (ultimoMultiplo > 0) {
			res = num * ultimoMultiplo;
			System.out.println(num + " x " + ultimoMultiplo + " = " + res);
			ultimoMultiplo--;
		}
		input.close();

	}

}
