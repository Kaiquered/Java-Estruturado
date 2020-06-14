/*
 ************************************************************************
 Programa: Positivo ou Negativo?
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: recebe um n�mero inteiro e diz se ele � positivo ou negativo.
 
 01/05/2020
 ************************************************************************
 */
import java.util.Locale;
import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		int num = 0;

		System.out.print("Digite um n�mero inteiro: ");

		num = input.nextInt();

		if (num > 0)
			System.out.println("\n" + num + " � um n�mero positivo!");

		else if (num == 0)
			System.out.println("\n" + num + " � um n�mero nulo!");

		else
			System.out.println("\n" + num + " � um n�mero negativo!");

		input.close();

	}
}
