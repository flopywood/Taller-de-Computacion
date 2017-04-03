/* Tp1 Ejercicio 01
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * Escriba un algoritmo donde se cree un número entero x, que inicialmente valdrá
0. Luego incremente su valor en 1, muéstrelo por pantalla y después muéstrelo
multiplicado por 2.
 */
package edu.ort.t1.tp1;

public class Tp1Ejer01 {
	
	public static int x;
	public static void main(String[] args) {
		x=0;
		System.out.println("El numero es:" + x);
		x=x+1;
		System.out.println("El numero es:" + x);
		x=x*2;
		System.out.print("El numero es:" + x);

	}

}
