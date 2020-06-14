/*
 ********************************************************
 Programa: Dot Product
 
 Autor: Kaíque Gomes Machado
    
 Descrição: calcula o produto escalar entre dois vetores.
 
 06/05/2020
 ********************************************************
 */

package vector.aplication;

import java.util.Locale;
import java.util.Scanner;

public class DotProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of dimensions: ");
		int n = input.nextInt();

		double sum = 0;

		double[] vectorA = new double[n];
		double[] vectorB = new double[n];

		System.out.print("\nEnter elements Vector A: ");

		for (int i = 0; i < n; i++) {
			vectorA[i] = input.nextDouble();
		}

		System.out.print("Enter elements Vector B: ");

		for (int i = 0; i < n; i++) {
			vectorB[i] = input.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			sum += vectorA[i] * vectorB[i];
		}

		System.out.printf("\nThe dot product is: %.2f", sum);
		
		input.close();
	}
}
