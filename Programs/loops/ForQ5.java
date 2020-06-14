/*
 *********************************************************
 Programa: Fatorial
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: programa que calcula o fatorial de um n�mero.
  
 01/05/2020
 *********************************************************
 */

import java.util.Locale;
import java.util.Scanner;

public class ForQ5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");

		int n = input.nextInt();
		int fat = 1;

		for (int i = 0; i < (n - 1); i++)
			fat *= (n - i);

		System.out.printf("O Fatorial de %d � %d.", n, fat);

		input.close();
	}
}
