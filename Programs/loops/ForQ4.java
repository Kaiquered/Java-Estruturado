/*
 ************************************************************************************
 Programa: Dividindo
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: l� N pares de n�meros e mostra a divis�o do primeiro pelo segundo. Se o 
 denominador for igual a zero, mostrar a mensagem "divisao impossivel".
  
 01/05/2020
 ************************************************************************************
 */

import java.util.Scanner;

public class ForQ4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Quantos pares?");

		int n = input.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite os pares: ");

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
