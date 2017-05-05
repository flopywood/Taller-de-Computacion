package edu.ort.t1.tp2;

import java.util.Scanner;

public class Tp2Ejer07 {
	public static Scanner input;

	public static int azar(int num1, int num2) {
		int numeroAleatorio = (int) (Math.random() * num2 + num1);
		return numeroAleatorio;
	}

	public static void main(String[] args) {
		input = new Scanner(System.in);

		int numero;
		int cantidad = 0;
		int numeroAzar;
		numeroAzar = azar(1, 100);

		do{
			System.out.print("ingrese un numero:");
			numero = input.nextInt();
			cantidad++;
			if (numeroAzar > numero) {
				System.out.println("mi numero es mayor");
			} else if(numeroAzar < numero){
				System.out.println("mi numero es menor");
			}
		}while (numeroAzar != numero);

		System.out.println("felicitaciones!");
		System.out.println("Cantidad de intentos: "+cantidad);
		input.close();

	}

}
