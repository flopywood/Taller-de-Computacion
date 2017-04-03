package edu.ort.t1.tp1;

import java.util.Scanner;

public class Tp1Ejer09 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int a, b;
		boolean sonIguales = false;
		System.out.print("Ingrese el primer numero: ");
		a = input.nextInt();

		System.out.print("Ingrese el siguiente numero: ");
		b = input.nextInt();
		sonIguales = a == b;
		if (sonIguales) {
			System.out.print("Los numeros ingresados son iguales");
		} else {
			System.out.print("Los numeros ingresados son diferentes");
		}
		input.close();
	}
	

}
