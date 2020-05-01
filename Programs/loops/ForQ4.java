import java.util.Scanner;

/* * Programa que lê N pares de números e mostra a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
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
				System.out.println("Divisão Impossível!");
			else
				System.out.println("Resultado: " + String.format("%.2f", (double) x / y));

		}
		input.close();
	}
}
