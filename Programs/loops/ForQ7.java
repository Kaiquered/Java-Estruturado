/*
 **********************************************************************
 Programa: Quadrados e Cubos
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: mostra na tela N linhas, come�ando de 1 at� N. 
 Para cada linha, mostra o n�mero da linha, depois o quadrado e o cubo 
 do valor posi��o da linha.
  
 01/05/2020
 **********************************************************************
 */

import java.util.Locale;
import java.util.Scanner;

public class ForQ7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o n�mero de linhas: ");

		int n = input.nextInt();

		if (n < 0)
			System.exit(1);

		for (int i = 1; i <= n; i++)
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));

		input.close();
	}
}
