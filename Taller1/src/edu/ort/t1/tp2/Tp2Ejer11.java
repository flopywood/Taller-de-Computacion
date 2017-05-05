package edu.ort.t1.tp2;

public class Tp2Ejer11 {
	public static boolean esMultiplo(int num1, int num2) {
		if (num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int a;
		int b;
		/* primera prueba */
		a = 5;
		b = 3;
		if (esMultiplo(a, b)) {
			System.out.println(a + " es multiplo de " + b);
		} else {
			System.out.println(a + " no es multiplo de " + b);
		}
		/* segunda prueba */
		a = 15;
		b = 3;
		if (esMultiplo(a, b)) {
			System.out.println(a + " es multiplo de " + b);
		} else {
			System.out.println(a + " no es multiplo de " + b);
		}
	}
}
