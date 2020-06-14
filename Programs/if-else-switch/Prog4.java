/*
 ****************************************************
 Programa: Duração do Jogo
 
 Autor: Kaíque Gomes Machado
    
 Descrição: lê a hora inicial e final de um  jogo 
 para calcular a duração dele.
 
 01/05/2020
 ****************************************************
 */

import java.util.Locale;
import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		int h_i = 0, h_f = 0, res = 0;

		System.out.println("Insira a hora inicial e final do jogo, respectivamente:");

		h_i = input.nextInt();
		h_f = input.nextInt();

		if (h_i > 24 || h_i < 0 || h_f > 24 || h_f < 0) {
			System.out.println("Digite um valor entre 1 h e 24 h!");
			System.exit(0);
		}

		if (h_i == 0 || h_f == 0) {
			h_i = 24;
			h_f = 24;
		}

		if (h_i == h_f)
			res = 24;

		if (h_f > h_i)
			res = h_f - h_i;

		else {
			h_f += 24;
			res = h_f - h_i;
		}

		System.out.println("O jogo durou: " + res + " Hora(s)");

		input.close();

	}
}
