package application;

import java.util.Scanner;

//programa que diz se um n�mero � par ou �mpar.

public class Prog2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = 0;

		System.out.println("Digite um n�mero:");

		num = input.nextInt();

		if (num % 2 == 0)
			System.out.println(num + " � um n�mero par!");

		else
			System.out.println(num + " � um n�mero �mpar!");

		input.close();

	}
}
