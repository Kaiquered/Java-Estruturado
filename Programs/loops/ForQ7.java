import java.util.Scanner;

/*O programa deve mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostra o número da linha, 
 * depois o quadrado e o cubo do valor.
 */
public class ForQ7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número:");

		int n = input.nextInt();

		if (n < 0)
			System.exit(1);

		for (int i = 1; i <= n; i++)
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));

		input.close();
	}
}
