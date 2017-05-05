package edu.ort.t1.tp2;

import java.util.Scanner;

public class Tp2Ejer10 {
	public static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int n1;
		int n2;
		int r;
		String op;
		System.out.print("Ingrese un numero:");
		n1 = input.nextInt();
		System.out.print("Ingrese otro numero:");
		n2 = input.nextInt();
		System.out.print("Ingrese signo para efectuar la operacion:");
		op = input.next();
		switch (op) {
		case "+":
			r = n1 + n2;
			System.out.print(r);
			break;
		case "-":
			r = n1 - n1;
			System.out.print(r);
			break;
		case "/":
			if (n2 == 0) {
				System.out.print("no se puede dividir por cero!");
			} else {
				r = n1 / n2;
				System.out.print(r);
			}
			break;
		case "*":
			r = n1 * n2;
			System.out.print(r);
			break;
		case "%":
			r = n1 % n2;
			System.out.print(r);
			break;
		}
		input.close();
	}

}
