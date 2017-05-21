/*Una empresa que vende jugos de  la linea Ades y Cepita necesita saber que porcentaje ha vendido de cada linea y ademas cual fue la menor venta y la mayor indicando la linea.
Se cargan las cantidades de cada venta indicando la linea. Cuando ingresa 0 termina la carga.
Informar porcentaje de los dos.
Validar que no se imprima si no hay datos.
Funciones obligatorias carga de datos, porcentaje.
*/
package ort.edu.t1.parcial;

import java.util.Scanner;

public class modeloParcialTaller {

	public static Scanner input;

	// Funcion que pide la cantidad de unidades vendidas. Devuelve cantidad de
	// unidades vendidas.
	public static int pedirCantidad() {
		int cantidad;
		do {
			System.out.print("Ingresar cantidad de unidades vendidas:");
			cantidad = input.nextInt();
		} while (cantidad < 0);
		input.nextLine();
		return cantidad;
	}

	// Funcion que pide la linea de bebida. Convierte el input a minuscula.
	// Compara Strings. Devuelve tipo de linea.
	public static String pedirLinea() {
		String linea = "";
		do {
			System.out.print("Ingresar linea \"Ades\" o \"Cepita\":");
			linea = input.nextLine();
			linea = linea.toLowerCase();
		} while (!linea.equals("ades") && !linea.equals("cepita"));
		return linea;
	}

	/*
	 * Funcion que calcula porcentaje de ventas. Recibe dos parametros:1-La
	 * linea de bebida 2-El total de ventas. Devuelve porcentaje de la linea
	 * ingresada como primer parametro.
	 */
	public static float calcularPorcentaje(int num1, int total) {
		float porcentaje;
		return porcentaje = (num1 * 100) / total;

	}

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int ades = 0;
		int cepita = 0;
		String linea;
		float porcentajeAdes;
		float porcentajeCepita;
		int cantidad;
		int total;

		cantidad = pedirCantidad();
		// V A L I D A R que no muestre datos cuando se ingresa cero.
		if (cantidad == 0)
			System.out.print("No se ingresaron datos.");

		while (cantidad != 0) {
			linea = pedirLinea();
			if (linea.equals("ades"))
				ades += cantidad;
			else
				cepita += cantidad;
			total = ades + cepita;

			//Imprimir la linea de bebida mas vendida.
			if (ades > cepita)
				System.out.println("La linea mas vendida fue \"Ades\".");
			else
				System.out.println("La linea mas vendida fue \"Cepita\".");

			porcentajeAdes = calcularPorcentaje(ades, total);
			porcentajeCepita = calcularPorcentaje(cepita, total);

			// V A L I D A R que imprima el porcentaje solo si no es cero
			if (porcentajeAdes != 0 || porcentajeCepita != 0) {
				if (porcentajeAdes > 0)
					System.out.println("El porcentaje de la linea \"Ades\" es del " + porcentajeAdes + "%.");
				else
					System.out.println("No hay datos suficientes para calcular el porcentaje de la linea \"Ades\".");

				if (porcentajeCepita > 0)
					System.out.println("El porcentaje de la linea \"Cepita\" es del " + porcentajeCepita + "%.");
				else
					System.out.println("No hay datos suficientes para calcular el porcentaje de la linea \"Cepita\".");
			}

			cantidad = pedirCantidad();
		}
		input.close();
	}
