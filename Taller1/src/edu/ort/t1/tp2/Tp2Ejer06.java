package edu.ort.t1.tp2;

import java.util.Scanner;

public class Tp2Ejer06 {
	public static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int numero;
		int promedio;
		int cantidad=0;
		int suma=0;
		do {
			System.out.print("Ingrese un numero:");
			numero = input.nextInt();
			suma += numero;
			cantidad++;
			promedio = suma / cantidad;
		} while (promedio < 20);
		System.out.println("El promedio es:" + promedio);
		System.out.println("La cantidad es:" + cantidad);
		input.close();

	}

}
