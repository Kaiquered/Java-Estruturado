import java.util.Scanner;

//programa que lê um ponto no plano cartesiano e diz o quadrante em que está até ser digitado pelo menos uma coordenada nula.

public class WhileQ3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int x = 1, y = 1;

		while (x != 0 && y != 0) {

			System.out.println("Digite as coordenadas X e Y:");

			x = input.nextInt();
			y = input.nextInt();

			if (x > 0 && y > 0)
				System.out.println("Primeiro Quadrante!");
			if (x < 0 && y > 0)
				System.out.println("Segundo Quadrante!");
			if (x < 0 && y < 0)
				System.out.println("Terceiro Quadrante!");
			if (x > 0 && y < 0)
				System.out.println("Quarto Quadrante!");

		}
		
		System.out.println("Você digitou uma coordenada nula.");
		
		input.close();
	}
}
