/*
 ***********************************************************************************
 Programa: Intervalo [10,20]
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: l� um valor inteiro N. Este valor ser� a quantidade de valores inteiros
 X que ser�o lidos em seguida. Depois mostra qual destes valores X est�o dentro do 
 intervalo [10,20] e quantos est�o fora do intervalo.
  
 01/05/2020
 ***********************************************************************************
 */

import java.util.Locale;
import java.util.Scanner;

public class ForQ2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		int N = 0, x = 0, in = 0, out = 0;

		System.out.print("Digite a quantidade de n�meros: ");
		N = input.nextInt();
		
		System.out.println("Digite X n�meros:");

		for (int i = 0; i < N; i++) {

			x = input.nextInt();

			if (x >= 10 && x <= 20)
				in++;
			else
				out++;
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		input.close();
	}
}
