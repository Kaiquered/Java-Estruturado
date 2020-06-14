/*
 ************************************************************
 Programa: Ímpares do Intervalo
 
 Autor: Kaíque Gomes Machado
    
 Descrição: lê um valor inteiro X (1 <= X <= 1000). Depois,
 mostra os ímpares de 1 até X, um valor por linha, inclusive 
 o X, se for o caso. 
 
 01/05/2020
 ************************************************************
 */

import java.util.Scanner;

public class ForQ1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int x = 0;
		
		System.out.print("Digite um número: ");
		
		x = input.nextInt();

		if (x >= 0 && x <= 1000)
			for (int i = 1; i <= x; i++) {
				if(i%2 != 0)
					System.out.println(i);
			}
		
		input.close();
	}
}
