/*
 *****************************************************************
 Programa: Média Ponderada de três números.
 
 Autor: Kaíque Gomes Machado
    
 Descrição: média ponderada de três números com pesos 2, e 3 e 5.
  
 01/05/2020
 *****************************************************************
 */

import java.util.Locale;

import java.util.Scanner;

public class ForQ3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite três números: ");

		for (int i = 0; i < 3; i++) {

			double a = input.nextDouble();

			double b = input.nextDouble();

			double c = input.nextDouble();

			double mediaP = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("Média Ponderada: %.1f%n", mediaP);

		}

		input.close();
	}
}