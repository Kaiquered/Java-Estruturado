/*
 ************************************************************
 Programa: �mpares do Intervalo
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: l� um valor inteiro X (1 <= X <= 1000). Depois,
 mostra os �mpares de 1 at� X, um valor por linha, inclusive 
 o X, se for o caso. 
 
 01/05/2020
 ************************************************************
 */

import java.util.Scanner;

public class ForQ1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int x = 0;
		
		System.out.print("Digite um n�mero: ");
		
		x = input.nextInt();

		if (x >= 0 && x <= 1000)
			for (int i = 1; i <= x; i++) {
				if(i%2 != 0)
					System.out.println(i);
			}
		
		input.close();
	}
}
