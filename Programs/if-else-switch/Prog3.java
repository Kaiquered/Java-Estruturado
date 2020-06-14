/*
 ****************************************************
 Programa: Múltiplos
 
 Autor: Kaíque Gomes Machado
    
 Descrição: diz se dois números sãos múltiplos mesmo 
 se digitados em ordem contrária.
 
 01/05/2020
 ****************************************************
 */

import java.util.Locale;
import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		int num1 = 0, num2 = 0;

		System.out.print("Digite dois números: ");

		num1 = input.nextInt();
		num2 = input.nextInt();

		if (num1 % num2 == 0)
			System.out.println("\nSão múltiplos!");

		else if (num2 % num1 == 0)
			System.out.println("\nSão múltiplos!");

		else
			System.out.println("\nNão são múltiplos!");

		input.close();

	}
}
