package edu.ort.t1.tp2;

public class Tp2Ejer13 {
	public static int binToDec(String numeroBinario) {
		int num;
		num = Integer.parseInt(numeroBinario, 2);
		return num;

	}

	public static void main(String[] args) {
		String n = "10110101";
		int num;
		num = binToDec(n);
		System.out.print(num);
	}
}
