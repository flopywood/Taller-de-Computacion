package edu.ort.t1.tp2;

import java.util.Scanner;

public class Tp2Ejer15 {
	public static Scanner input;
	public static int sumaA;
	public static int sumaB;
	public static int sumaC;

	public static int pedirCodigo() {
		int num;
		do {
			System.out.print("Ingrese el codigo de cliente:");
			num = input.nextInt();
		} while (num < 10001 || num > 99999 && num <= 0);
		return num;
	}

	public static int pedirDuracion() {
		int num;
		do {
			System.out.print("Ingresar duracion de la llamada:");
			num = input.nextInt();
		} while (num <= 0);
		return num;
	}

	public static String pedirTipoAbono() {
		String abono;
		System.out.print("Ingrese el tipo de abono:");
		abono = input.next();

		switch (abono) {
		case "A":
			break;
		case "B":
			break;
		case "C":
			break;
		}
		return abono;
	}

	public static int calcularImporte(int duracion, String tipoAbono) {
		int importe = 0;

		switch (tipoAbono) {
		case "A":
			importe = duracion * 2;
			sumaA += importe;
			break;
		case "B":
			if (duracion < 5)
				importe = duracion * 2;
			else
				importe = (int) (duracion * 1.5);
			sumaB += importe;
			break;
		case "C":
			if (duracion < 10)
				importe = duracion * 1;
			else
				importe = 10;
			sumaC += importe;
			break;
		}
		return importe;
	};

	public static int calcularPromedio(int duracion, int llamadas) {
		int promedio;
		promedio = duracion / llamadas;
		return promedio;
	}

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int codigo;
		int duracion;
		int importe;
		int promedio;
		int llamadas = 0;
		int masLarga = 0;
		int contador = 0;
		String tipoAbono = "";

		codigo = pedirCodigo();

		while (codigo != 0) {
			duracion = pedirDuracion();
			tipoAbono = pedirTipoAbono();
			importe = calcularImporte(duracion, tipoAbono);

			if (duracion > masLarga)
				masLarga = duracion;
			if (duracion < 6)
				contador++;

			llamadas++;
			promedio = calcularPromedio(duracion, llamadas);

			System.out.println("El importe total para el abono A es: " + sumaA
					+ ". El importe total para el abono B es: " + sumaB + ". El importe total para el abono C es: "
					+ sumaC + ". La llamada mas larga duro " + masLarga + " minutos. Hubo un total de " + contador
					+ " llamadas menores a 6 minutos. El precio promedio por llamada fue de " + promedio + " pesos.");
			codigo = pedirCodigo();
		}
		input.close();
	}
}
