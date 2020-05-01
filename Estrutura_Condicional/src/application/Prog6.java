package application;

import java.util.Locale;
import java.util.Scanner;

//programa que identifica se um valor pertence a algum intervalo definido pelo programa.

public class Prog6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		double num = 0.0;

		System.out.println("Digite um n�mero:");
		num = input.nextDouble();

		if (num < 0 || num > 100) {
			System.out.println("Fora do Intervalo");
			System.exit(0);
		}

		if (num >= 0 && num <= 25) {
			System.out.println(num + " Est� no Intervalo: [0,25]");

		} else if (num > 25 && num <= 50)
			System.out.println(num + " Est� no Intervalo: (25,50]");

		else if (num > 50 && num <= 75)
			System.out.println(num + " Est� no Intervalo: (50,75]");

		else if (num > 75 && num <= 100)
			System.out.println(num + " Est� no Intervalo: (75,100]");

		input.close();

	}
}
