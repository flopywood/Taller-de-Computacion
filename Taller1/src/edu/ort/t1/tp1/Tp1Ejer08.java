package edu.ort.t1.tp1;

import java.util.Scanner;

public class Tp1Ejer08 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int num;
		System.out.print("Ingrese un numero");
		num = input.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.print(num + " es par");
			} else {
				System.out.print(num + " es impar");
			}
		} else {
			System.out.print("Cero no es divisible");
		}

	}

}
