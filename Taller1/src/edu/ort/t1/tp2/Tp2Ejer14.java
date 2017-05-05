package edu.ort.t1.tp2;

import java.util.Scanner;

public class Tp2Ejer14 {
	public static Scanner input;

	public static int pedirViajes() {
		int viajes;
		int topeMin = 0;
		int topeMax = 1000;
		do {
			System.out.print("Ingrese cantidad de viajes:");
			viajes = input.nextInt();
		} while (viajes > 1000 || viajes <= 0);
		return viajes;
	}

	public static float calcularImporte(int viajes){
	float valor=100;
	float importe=0;
	float abono=8500;
	float descuento=0.9f;
	importe=abono+(viajes+valor);
	if(viajes>30){
		importe=importe*descuento;
	}
	return importe;
}

	public static String pedirEmpresa(String nombre) {
		System.out.print("Ingrese la empresa");
		nombre = input.nextLine();
		return nombre;
	}

	public static void main(String[] args) {
		input=new Scanner(System.in);
		float mayor;
		float acumulador;
		float importe;
		int contador;
		int viajes;
		String empresa="";
		contador = 0;
		acumulador = 0;
		mayor = 0;
		empresa = pedirEmpresa(empresa);
		while (!empresa.equals("") ) {
			viajes = pedirViajes();
			contador++;
			importe = calcularImporte(viajes);
			acumulador += importe;
			if (importe > mayor) {
				mayor = importe;
			}
			System.out.println("La empresa " + empresa + " debe abonar $" + importe);
			empresa = pedirEmpresa(empresa);
		}
		System.out.println("El promedio pagado por la empresa fue: $" + acumulador + contador);
		System.out.println("La mayor factura es por un total de $: " + mayor);
		input.close();

	}

}
