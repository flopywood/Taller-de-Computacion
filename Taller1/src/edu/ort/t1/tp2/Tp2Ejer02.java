package edu.ort.t1.tp2;

import java.util.Scanner;

public class Tp2Ejer02 {
	public static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int num1;
		int num2;
		int i;
		System.out.print("Ingrese un numero:");
		num1 = input.nextInt();
		System.out.print("Ingrese otro numero:");
		num2 = input.nextInt();
		i = num1;
		while (i <= num2) {
			System.out.print(i);
			i++;
		}
		System.out.print("\n");

		i = num1 + 1;
		while (i < num2) {
			System.out.print(i);
			i++;
		}
		input.close();
	}
}
