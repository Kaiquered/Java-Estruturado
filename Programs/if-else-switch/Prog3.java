/*
 ********************************************
 Programa: Múltiplos
 
 Autor: Kaíque Gomes Machado
    
 Descrição: diz se dois números sãos múltiplos.
 
 01/05/2020
 ********************************************
 */

import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1 = 0, num2 = 0;

		System.out.println("Digite dois números:");

		num1 = input.nextInt();
		num2 = input.nextInt();

		if (num1 % num2 == 0)
			System.out.println("São múltiplos!");

		else if (num2 % num1 == 0)
			System.out.println("São múltiplos!");

		else
			System.out.println("Não são múltiplos!");

		input.close();

	}
}
