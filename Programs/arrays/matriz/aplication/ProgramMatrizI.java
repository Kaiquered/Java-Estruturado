/*
 *************************************************************************
 Programa: Matriz I
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: l� uma matriz NxM de inteiros e um n�mero inteiro contido na 
 matriz, depois mostra os n�meros a esquerda, a direita, acima e baixo do
 n�mero digitado.
 
 01/05/2020
 *************************************************************************
 */

package matriz.aplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatrizI {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
				
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o n�mero de linhas e colunas da matriz: ");
		int n = input.nextInt();
		int m = input.nextInt();

		int[][] matriz = new int[n][m];

		System.out.println("Digite os elementos da matriz: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)

				matriz[i][j] = input.nextInt();

		}

		System.out.println("Digite um n�mero pertecente a matriz: ");
		int num = input.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matriz[i][j] == num) {
					System.out.println("Posi��o: " + i + "," + j);
					if ((j - 1) >= 0)
						System.out.println("Esquerda de " + num + " � o " + matriz[i][j - 1]);

					if ((j + 1) < m)
						System.out.println("Direita de " + num + " � o " + matriz[i][j + 1]);

					if ((i - 1) >= 0)
						System.out.println("Acima de " + num + " � o " + matriz[i - 1][j]);

					if ((i + 1) < n)
						System.out.println("Abaixo de " + num + " � o " + matriz[i + 1][j]);
				}

			}

		}
		input.close();
	}
}
