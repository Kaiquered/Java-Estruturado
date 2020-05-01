package application;

import java.util.Scanner;

//programa que recebe coordenadas (x,y) para determina qual quadrante o ponto se encontra. 

public class Prog7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double x = 0.0, y = 0.0;

		System.out.println("Insira as coordenadas X e Y:");

		x = input.nextDouble();
		y = input.nextDouble();

		if (x == 0.0 & y == 0.0)
			System.out.println("Origem");
		else if (x == 0.0)
			System.out.println("EIXO Y");
		else if (y == 0.0)
			System.out.println("EIXO X");
		else if (x > 0.0 && y > 0.0)
			System.out.println("1º Quadrante");
		else if (x < 0.0 && y > 0.0)
			System.out.println("2º Quadrante");
		else if (x < 0.0 && y < 0.0)
			System.out.println("3º Quadrante");
		else if (x > 0.0 && y < 0.0)
			System.out.println("4º Quadrante");

		input.close();
	}
}
