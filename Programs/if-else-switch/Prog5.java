/*
 ***************************************************************************************
 Programa: Conta a pagar
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: l� o c�digo de um produto e a quantidade dele para informa a conta a pagar.
 O c�digo deve estar de 1 at� 5 e o pre�o j� est� definido.
 
 01/05/2020
 ***************************************************************************************
 */

import java.util.Locale;
import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		int cod = 0, qt = 0;
		double conta = 0.0;

		System.out.println("Digite o c�digo do produto e a quanditade comprada:");

		cod = input.nextInt();
		qt = input.nextInt();

		switch (cod) {

		case 1:
			conta = qt * 4;
			System.out.println("Total: R$ " + conta);
			break;
		case 2:
			conta = qt * 4.50;
			System.out.println("Total: R$ " + conta);
			break;
		case 3:
			conta = qt * 5;
			System.out.println("Total: R$ " + conta);
			break;
		case 4:
			conta = qt * 2;
			System.out.println("Total: R$ " + conta);
			break;
		case 5:
			conta = qt * 1.5;
			System.out.println("Total: R$ " + conta);
			break;
		default:
			System.out.println("Digite um c�digo de 1 a 5!");
		}

		input.close();
	}
}
