import java.util.Scanner;

/*O programa deve mostrar na tela N linhas, come�ando de 1 at� N. Para cada linha, mostra o n�mero da linha, 
 * depois o quadrado e o cubo do valor.
 */
public class ForQ7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um n�mero:");

		int n = input.nextInt();

		if (n < 0)
			System.exit(1);

		for (int i = 1; i <= n; i++)
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));

		input.close();
	}
}
