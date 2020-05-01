package application;

import java.util.Scanner;

//programa que diz se um número é par ou ímpar.

public class Prog2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = 0;

		System.out.println("Digite um número:");

		num = input.nextInt();

		if (num % 2 == 0)
			System.out.println(num + " é um número par!");

		else
			System.out.println(num + " é um número ímpar!");

		input.close();

	}
}
