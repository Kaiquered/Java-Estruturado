/*
 ************************************************************************
 Programa: Positivo ou Negativo?
 
 Autor: Kaíque Gomes Machado
    
 Descrição: recebe um número inteiro e diz se ele é positivo ou negativo.
 
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

		System.out.print("Digite um número inteiro: ");

		num = input.nextInt();

		if (num > 0)
			System.out.println("\n" + num + " é um número positivo!");

		else if (num == 0)
			System.out.println("\n" + num + " é um número nulo!");

		else
			System.out.println("\n" + num + " é um número negativo!");

		input.close();

	}
}
