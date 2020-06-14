/*
 ****************************************************
 Programa: M�ltiplos
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: diz se dois n�meros s�os m�ltiplos mesmo 
 se digitados em ordem contr�ria.
 
 01/05/2020
 ****************************************************
 */

import java.util.Locale;
import java.util.Scanner;

public class Prog3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		int num1 = 0, num2 = 0;

		System.out.print("Digite dois n�meros: ");

		num1 = input.nextInt();
		num2 = input.nextInt();

		if (num1 % num2 == 0)
			System.out.println("\nS�o m�ltiplos!");

		else if (num2 % num1 == 0)
			System.out.println("\nS�o m�ltiplos!");

		else
			System.out.println("\nN�o s�o m�ltiplos!");

		input.close();

	}
}
