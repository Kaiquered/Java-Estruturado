package matriz.aplication;

import java.util.Scanner;

/* Programa que lê uma matriz NxM de inteiros e um número inteiro pertencente a matriz
 * mostrando os números a esquerda, a diinputita, acima, e baixo do número digitado.
 */

public class ProgramMatriz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o número de linhas e colunas da matriz: ");
		int n = input.nextInt();
		int m = input.nextInt();

		int[][] matriz = new int[n][m];

		System.out.println("Digite os elementos da matriz: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)

				matriz[i][j] = input.nextInt();

		}

		System.out.println("Digite um número pertecente a matriz: ");
		int num = input.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matriz[i][j] == num) {
					System.out.println("Posição: " + i + "," + j);
					if ((j - 1) >= 0)
						System.out.println("Esquerda de " + num + " é o " + matriz[i][j - 1]);

					if ((j + 1) < m)
						System.out.println("Direita de " + num + " é o " + matriz[i][j + 1]);

					if ((i - 1) >= 0)
						System.out.println("Acima de " + num + " é o " + matriz[i - 1][j]);

					if ((i + 1) < n)
						System.out.println("Abaixo de " + num + " é o " + matriz[i + 1][j]);
				}

			}

		}
		input.close();
	}
}
