/*
 *********************************************************
 Programa: Fatorial
 
 Autor: Kaíque Gomes Machado
    
 Descrição: programa que calcula o fatorial de um número.
  
 01/05/2020
 *********************************************************
 */

import java.util.Locale;
import java.util.Scanner;

public class ForQ5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número: ");

		int n = input.nextInt();
		int fat = 1;

		for (int i = 0; i < (n - 1); i++)
			fat *= (n - i);

		System.out.printf("O Fatorial de %d é %d.", n, fat);

		input.close();
	}
}
