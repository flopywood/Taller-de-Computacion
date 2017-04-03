package edu.ort.t1.tp1;
import java.util.Scanner;

public class TpEjer07 {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int numero;
		System.out.print("Ingrese numero de uno a siete");
		numero = input.nextInt();
		
		switch(numero) { // selector variable de tipo int o char
		case 1:
			System.out.print("el dia es Domingo");
			break; // salta al fin del switch
		case 2:
			System.out.print("el dia es Lunes");
			break; // salta al fin del switch
		case 3:
			System.out.print("el dia es Martes");
			break; // salta al fin del switch
		case 4:
			System.out.print("el dia es Miercoles");
			break; // salta al fin del switch
		case 5:
			System.out.print("el dia es Jueves");
			break; // salta al fin del switch
		case 6:
			System.out.print("el dia es Viernes");
			break; // salta al fin del switch
		case 7:
			System.out.print("el dia es Sabado");
			break; // salta al fin del switch
		default:
			System.out.print("el dia " + numero + " no existe en este planeta!!!!!!");
	
		} // fin del switch
		
		
		
		/*if (numero >= 1 && numero <=7) {
			if (numero==1) {
				System.out.print("Domingo");
			} else if(numero==2) {
					System.out.print("Lunes");
			} else if (numero==3) {
					System.out.print("Martes");
			} else if (numero==4) {
					System.out.print("Miercoles");
			} else if (numero==5) {
					System.out.print("Jueves");
			} else if (numero==6) {
					System.out.print("Viernes");
			} else if (numero==7){
				System.out.print("Sabado");
			}
		} else {
			System.out.print("No existe ese dia de la semana en este planeta");
		} 
		input.close();
	}*/
  }		
}
