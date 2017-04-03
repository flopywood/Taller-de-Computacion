package edu.ort.t1.tp1;

import java.util.Scanner;

public class TpEjer10 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		int edad;
		float altura;
		System.out.print("Ingrese su edad: ");
		edad = input.nextInt();

		System.out.print("Ingrese su altura: ");
		altura = input.nextFloat();

		if (edad >= 7 && altura > 1.40) {
			System.out.print("Puede ingresar");
		} else {
			System.out.print("No puede ingresar");
		}
		input.close();
	}

}
