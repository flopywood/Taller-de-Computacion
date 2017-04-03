package edu.ort.t1.tp1;

import java.util.Scanner;

public class TpEjer12 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		boolean estaEnA=false;
		boolean estaEnB=false;
		boolean estaEnAmbos=false;
		boolean noEstaEnNinguno=false;
		int numero;
		
		System.out.print("Ingrese un numero: ");
		numero= input.nextInt();
		
		if (numero < 10) {
			System.out.print(!estaEnA);
		}
		

	}

}
