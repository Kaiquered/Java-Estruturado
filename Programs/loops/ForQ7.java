/*
 **********************************************************************
 Programa: Quadrados e Cubos
 
 Autor: Kaíque Gomes Machado
    
 Descrição: mostra na tela N linhas, começando de 1 até N. 
 Para cada linha, mostra o número da linha, depois o quadrado e o cubo 
 do valor posição da linha.
  
 01/05/2020
 **********************************************************************
 */

import java.util.Locale;
import java.util.Scanner;

public class ForQ7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o número de linhas: ");

		int n = input.nextInt();

		if (n < 0)
			System.exit(1);

		for (int i = 1; i <= n; i++)
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));

		input.close();
	}
}
