package edu.ort.t1.tp2;

import java.util.Scanner;

public class Tp2Ejer08 {
	public static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int juego = 0;
		int num;
		int suma = 0;
		int promedio = 0;
		do {
			System.out.print("ingrese un juego");
			juego = input.nextInt();
			System.out.print("ingrese numeros:");
			num = input.nextInt();
			juego++;
			while (num < 3) {
				num++;
				System.out.print("ingrese numeros:");
				num = input.nextInt();
				suma += num;
			}
			promedio = suma / 3;
		} while (juego <= 5);
		System.out.print("el promedio es:" + promedio);
		input.close();

	}

}
