package edu.ort.t1.tp2;

import java.util.Scanner;

public class Tp2Ejer03 {
	public static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int a;
		int b;
		int sumaSucesiva=0;
		System.out.print("Ingrese un numero:");
		a = input.nextInt();
		System.out.print("Ingrese otro:");
		b = input.nextInt();
		for (int i = 0; i < b; i++) {
			sumaSucesiva += a;
		}
		System.out.print(sumaSucesiva);
		input.close();

	}

}
