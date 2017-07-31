/* Tp4 Ejercicio 01
 * Grupo 1
 * Alessandrini Rosario, De Vuono Florencia, Fernades Rodrigo, Ocampos Nahuel
 * Declare la clase Pajaro con los atributos que considere necesarios. Debe tener,
 * como mínimo, los atributos booleanos hambriento y sediento.
 * Instancie un gorrión de 6 años de edad, 28 gramos de peso, 14 centímetros de
 * longitud y 20 de envergadura. completando los valores de todos sus atributos a
 * través de sus setters. Haga que coma semillas (o lo que le demos) y que beba, a
 * fin de calmar su hambre y su sed.
 * Finalmente muestre el estado de todos sus atributos.
 */
package edu.ort.t1.tp4;

import java.util.Scanner;

public class TestPajaro {
	public static Scanner input;

	private static Pajaro creaPajaro() {
		Pajaro paj = new Pajaro();

		paj.setNombre("Alfredo");
		paj.setTipo("Gorrion");
		paj.setLongitud(14);
		paj.setPeso(28);
		paj.setEdad(6);
		paj.setEnvergadura(20);

		return paj;
	}

	private static float pideCantidad(String txt) {
		float cant;
		do {
			System.out.print(txt);
			cant = input.nextFloat();

			input.nextLine();// LimpiaBuff

			txt = "Error, no puede ser negativo. Vuelva a ingresar";
		} while (cant < 0);

		return cant;
	}

	private static void inicio(Pajaro p) {
		System.out.println("****************************************");
		System.out.println("Bienvenidos a Dandole de Comer a " + p.getNombre());
		System.out.println("****************************************");
	}

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Pajaro paj = new Pajaro();
		//boolean entrar = true;
		//float cant = 0;

		paj = creaPajaro();

		inicio(paj);

		while (paj.getHambriento() || paj.getSediento()) {
			float sobras = 0;

			if (paj.getHambriento()) {
				sobras = paj
						.alimentar(pideCantidad("Ingrese los gramos que le dara de comer a " + paj.getNombre() + ":"));

				if (sobras == (float) 0)
					System.out.println("¡Se comio todo! :) ");
				else
					System.out.println("Dejo " + sobras + "gramos");

				if (paj.getHambriento() == false)
					System.out.println("Enhorabuena, ya no tiene más hambre!");
			}

			if (paj.getSediento()) {
				sobras = paj.beber(
						(pideCantidad("Ingrese los mili litros que le dara de beber a " + paj.getNombre() + ":")));

				if (sobras == (float) 0)
					System.out.println("¡Se tomo todo! :) ");
				else
					System.out.println("Devolvió " + sobras + " mili litros.");

				if (paj.getSediento() == false)
					System.out.println("Enhorabuena, ya no tiene más sed!");
			}
		}
		System.out.println("FIN!!");
		input.close();
	}
}
