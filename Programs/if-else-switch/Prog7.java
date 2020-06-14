/*
 ***************************************************
 Programa: Encontrando o quadrante
 
 Autor: Ka�que Gomes Machado
    
 Descri��o: recebe coordenadas (x,y) para determina 
 qual quadrante o ponto se encontra. 
 
 01/05/2020
 ***************************************************
 */

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double x = 0.0, y = 0.0;

		System.out.print("Insira as coordenadas X e Y: ");

		x = input.nextDouble();
		y = input.nextDouble();

		if (x == 0.0 & y == 0.0)
			System.out.println("Origem");
		else if (x == 0.0)
			System.out.println("EIXO Y");
		else if (y == 0.0)
			System.out.println("EIXO X");
		else if (x > 0.0 && y > 0.0)
			System.out.println("1� Quadrante");
		else if (x < 0.0 && y > 0.0)
			System.out.println("2� Quadrante");
		else if (x < 0.0 && y < 0.0)
			System.out.println("3� Quadrante");
		else if (x > 0.0 && y < 0.0)
			System.out.println("4� Quadrante");

		input.close();
	}
}
