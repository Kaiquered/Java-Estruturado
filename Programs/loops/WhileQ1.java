/*
 ******************************************************************
 Programa: Validação de Senha
 
 Autor: Kaíque Gomes Machado
    
 Descrição: repete a leitura de uma senha já gravada até que ela 
 seja válida.
  
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

			System.out.println("Senha Inválida!");
			     
			System.out.println("\nDigite a senha novamente:");
			senha = input.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		
		input.close();
	}
}
