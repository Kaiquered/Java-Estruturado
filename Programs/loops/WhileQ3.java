/*
 ******************************************************************
 Programa: Quadrante 1.1
 
 Autor: Kaíque Gomes Machado
    
 Descrição: lê um ponto no plano cartesiano e diz o quadrante dele
 até ser digitado pelo menos uma coordenada nula.
  
 01/05/2020
 ******************************************************************
 */

import java.util.Locale;
import java.util.Scanner;

public class WhileQ3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		float x = 1, y = 1;

		while (x != 0 && y != 0) {

			System.out.print("Digite as coordenadas X e Y: ");

			x = input.nextFloat();
			y = input.nextFloat();

			if (x > 0 && y > 0)
				System.out.println("\nPrimeiro Quadrante!\n");
			if (x < 0 && y > 0)
				System.out.println("\nSegundo Quadrante!\n");
			if (x < 0 && y < 0)
				System.out.println("\nTerceiro Quadrante!\n");
			if (x > 0 && y < 0)
				System.out.println("\nQuarto Quadrante!\n");

		}
		
		System.out.println("\nVocê digitou uma coordenada nula.");
		
		input.close();
	}
}
