/*
 *****************************************************************
 Programa: Média Ponderada 1.1
 
 Autor: Kaíque Gomes Machado
    
 Descrição: média ponderada com os dados inseridos pelo usuário.
  
 01/05/2020
 *****************************************************************
 */

import java.util.Locale;

import java.util.Scanner;

public class ForQ3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		System.out.print("Média de quantos valores?");

		int n = input.nextInt();

		System.out.println("Digite o valor e seu respectivo peso:");

		double somaMedia = 0;
		int somaPeso = 0;

		for (int i = 0; i < n; i++) {

			double valor = input.nextDouble();
			int peso = input.nextInt();

			somaPeso += peso;

			somaMedia += valor * peso;

			if (i == (n - 1))
				System.out.printf("Média Ponderada: %.2f%n", (somaMedia / somaPeso));

		}

		input.close();
	}
}