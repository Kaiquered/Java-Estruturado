/*
 *************************************************************************************
 Programa: Dividindo Inteiros
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: l� N pares de n�meros inteiros e mostra a divis�o do primeiro pelo 
 segundo. Se o denominador for igual a zero, imprimi a mensagem "divis�o imposs�vel".
  
 01/05/2020
 *************************************************************************************
 */

import java.util.Locale;
import java.util.Scanner;

public class ForQ4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		System.out.println("Quantos pares?");

		int n = input.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite os n�meros: ");

			int x = input.nextInt();
			int y = input.nextInt();

			if (y == 0)
				System.out.println("Divis�o Imposs�vel!");
			else
				System.out.println("Resultado: " + String.format("%.2f", (double) x / y));

		}
		input.close();
	}
}
