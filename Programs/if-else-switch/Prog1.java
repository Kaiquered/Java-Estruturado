import java.util.Scanner;

//o programa recebe um n�mero inteiro e diz se ele � positivo ou negativo.

public class Prog1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = 0;

		System.out.println("Digite um n�mero inteiro:");

		num = input.nextInt();

		if (num > 0)
			System.out.println(num + " � um n�mero positivo!");

		else if (num == 0)
			System.out.println(num + " � um n�mero nulo!");

		else
			System.out.println(num + " � um n�mero negativo!");

		input.close();

	}
}
