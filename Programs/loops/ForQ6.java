/*
 *********************************************************************
 Programa: Os Divisores
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: l� um n�mero inteiro N e calcula todos os seus divisores.
  
 01/05/2020
 *********************************************************************
 */

import java.util.Locale;
import java.util.Scanner;

public class ForQ6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int n = input.nextInt();

		System.out.printf("Divisores de %d = ", n);
		System.out.print(" {");
		
		for (int i = 1; i <= n; i++) {

			if ((n % i) == 0 && i!=n) 
				System.out.printf("%d, ", i);
						
			if ((n % i) == 0 && i==n)
				System.out.printf("%d", i);
		}
		
		System.out.print("}");
		
		input.close();
	}
}
