/*
 ******************************************************************
 Programa: Valida��o de Senha
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: repete a leitura de uma senha j� gravada at� que ela 
 seja v�lida.
  
 01/05/2020
 ******************************************************************
 */

import java.util.Scanner;

public class WhileQ1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a senha: ");
		int senha = input.nextInt();

		while (senha != 2002) {

			System.out.println("Senha Inv�lida!");
			     
			System.out.println("\nDigite a senha novamente:");
			senha = input.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		
		input.close();
	}
}
