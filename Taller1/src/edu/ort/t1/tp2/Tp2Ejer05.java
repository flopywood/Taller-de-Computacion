package edu.ort.t1.tp2;

import java.util.Scanner;

public class Tp2Ejer05 {
public static Scanner input;
	public static void main(String[] args) {
		input =new Scanner(System.in);
		int numero;
		int minimo;
//		System.out.print("Ingrese numero:");
		numero=input.nextInt();
		minimo=numero;
		while(numero!=0){
//			System.out.print("Ingrese numero:");
			numero=input.nextInt();
			if(numero!=0 && numero<minimo){
				minimo=numero;
			}
		}
		System.out.print(minimo);
		input.close();

	}

}
