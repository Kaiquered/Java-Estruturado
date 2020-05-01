package application;

import java.util.Scanner;

//o programa recebe um número inteiro e diz se ele é positivo ou negativo.

public class Prog1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = 0;

		System.out.println("Digite um número inteiro:");

		num = input.nextInt();

		if (num > 0)
			System.out.println(num + " é um número positivo!");

		else if (num == 0)
			System.out.println(num + " é um número nulo!");

		else
			System.out.println(num + " é um número negativo!");

		input.close();

	}
}
