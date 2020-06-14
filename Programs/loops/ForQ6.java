/*
 *********************************************************************
 Programa: Os Divisores
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: l� um n�mero inteiro N e calcula todos os seus divisores.
  
 01/05/2020
 *********************************************************************
 */

import java.util.Scanner;

public class ForQ6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int n = input.nextInt();

		System.out.printf("Divisores de %d:", n);
		for (int i = 1; i <= n; i++) {

			if ((n % i) == 0) {
				System.out.printf(" " + i);
			}
		}
		input.close();
	}
}
