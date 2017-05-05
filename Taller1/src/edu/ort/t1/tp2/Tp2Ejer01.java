package edu.ort.t1.tp2;

public class Tp2Ejer01 {

	public static void main(String[] args) {
		int numero = 1;
		while (numero <= 100) {
			System.out.println("numero:" + numero);
			numero++;
		}
		System.out.println();
		do{
			numero--;
			System.out.println("numero:"+numero);
		}while(numero>1);
		System.out.println();
		for(int i=1; i<=100; i++){
			System.out.println("numero:"+i);
		}
		System.out.println();
		for(int i=100; i>0; i--){
			System.out.println("numero:"+i);
		}
	}
}
