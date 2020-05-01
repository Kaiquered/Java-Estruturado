import java.util.Scanner;

/*Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
 */

public class ForQ2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int N = 0, x = 0, in = 0, out = 0;

		System.out.println("Digite um n�mero:");
		N = input.nextInt();

		for (int i = 0; i < N; i++) {

			x = input.nextInt();

			if (x >= 10 && x <= 20)
				in++;
			else
				out++;
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		input.close();
	}
}
