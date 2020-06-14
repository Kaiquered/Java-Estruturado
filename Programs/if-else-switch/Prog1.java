/*
 ************************************************************************
 Programa: Positivo ou Negativo?
 
 Autor: Kaíque Gomes Machado
    
 Descrição: recebe um número inteiro e diz se ele é positivo ou negativo.
 
 01/05/2020
 ************************************************************************
 */
import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num = 0;

		System.out.println("Digite um número inteiro:");

		num = input.nextInt();

		if (num > 0)
			System.out.println(num + " é um número positivo!");

		else if (num == 0)
			System.out.println(num + " é um número nulo!");

		else
			System.out.println(num + " é um número negativo!");

		input.close();

	}
}
