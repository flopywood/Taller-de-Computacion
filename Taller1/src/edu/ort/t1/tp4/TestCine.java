/*Tp4 Ejercicio 05
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * El cine de Villa Chica da una única función por noche. Cada día ingresa el nombre de la película (casi siempre distinta)
 * para su sala de 170 espectadores, y en la boletería fijan el precio del boleto y reinician el contador de transacciones.
 * Por cada intento de transacción, la boletería controla que alcancen los asientos disponibles como para cumplir con el pedido.
 * Si no alcanzan las localidades se informa y el pedido es rechazado.
 * Cuando sí alcanza, la boletería procesa la venta de los boletos y entrega un ticket indicando el número de transacción, la 
 * película, la cantidad de butacas pagadas y el importe total de la transacción, que se le muestra al comprador.
 * La carga se interrumpe cuando se ingresa 0 en la cantidad de entradas pedidas o cuando no hay más localidades 
 * (lo que se informa por programa).Al cierre se informan las localidades vendidas, la cantidad de transacciones
 * realizadas y el total recaudado. 
 */
package edu.ort.t1.tp4;

import java.util.Scanner;

public class TestCine {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int cantEntradas = 0;
		Sala s = new Sala(170);

		System.out.println("************** CINE HOYTS *****************************");

		Funcion f = new Funcion(pideString("Ingrese nombre de película del día:"), s);
		Boleteria b = new Boleteria(pideFloat("Ingrese precio de la entrada:"));

		System.out.println("");
		System.out.println("************** C O M P R A de E N T R A D A S *********************");
		cantEntradas = pideInt("¿Cuantas entradas quiere comprar para " + f.getPelicula() + "? ");
		while (cantEntradas != 0) {
			Respuesta resp = b.venderLocalidades(cantEntradas, f);
			if (resp.getEstado()) {
				System.out.println(resp.getInforme());
			} else if (f.getLocalidadesLibres() > 0)
				System.out.println("Operación cancelada, solamente quedán " + f.getLocalidadesLibres() + " entradas.");

			if (f.getLocalidadesLibres() == 0) {
				System.out.println("Lo siento, las localidades estan agotadas.");
				break;
			}

			System.out.println("");
			System.out.println("************** C O M P R A de E N T R A D A S *********************");
			cantEntradas = pideInt("¿Cuantas entradas quiere comprar para " + f.getPelicula() + "? ");
		}

		if (b.getCantTransacciones() > 0)
			finPrograma(b.cerrarBoleteria());
		else
			System.out.println("No se han registrado ventas.");

	}

	private static void finPrograma(String s) {
		System.out.println("");
		System.out.println("**********************************************************");
		System.out.println("************** Cierre de Boletería ***********************");
		System.out.println("**********************************************************");
		System.out.println(s);
		System.out.println("");
		System.out.println("**********************************************************");
		System.out.println("********************** F I N *****************************");
	}

	private static String pideString(String texto) {
		System.out.print(texto);
		return input.nextLine();
	}

	private static int pideInt(String texto) {
		System.out.print(texto);
		return input.nextInt();
	}

	private static float pideFloat(String texto) {
		System.out.print(texto);
		return input.nextFloat();
	}

}
