package application;

import java.util.Scanner;

//programa que diz se dois n�meros s�os m�ltiplos.

public class Prog3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1 = 0, num2 = 0;

		System.out.println("Digite dois n�meros:");

		num1 = input.nextInt();
		num2 = input.nextInt();

		if (num1 % num2 == 0)
			System.out.println("S�o m�ltiplos!");

		else if (num2 % num1 == 0)
			System.out.println("S�o m�ltiplos!");

		else
			System.out.println("N�o s�o m�ltiplos!");

		input.close();

	}
}
