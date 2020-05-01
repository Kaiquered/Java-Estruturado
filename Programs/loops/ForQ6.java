import java.util.Scanner;

//Ler um número inteiro N e calcular todos os seus divisores.

public class ForQ6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número:");
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
