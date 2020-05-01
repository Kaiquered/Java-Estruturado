import java.util.Scanner;

//programa que lê o código de um produto e a quantidade dele para informa a conta a pagar.

public class Prog5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int cod = 0, qt = 0;
		double conta = 0.0;

		System.out.println("Digite o código do produto e a quanditade comprada:");

		cod = input.nextInt();
		qt = input.nextInt();

		switch (cod) {

		case 1:
			conta = qt * 4;
			System.out.println("Total: R$ " + conta);
			break;
		case 2:
			conta = qt * 4.50;
			System.out.println("Total: R$ " + conta);
			break;
		case 3:
			conta = qt * 5;
			System.out.println("Total: R$ " + conta);
			break;
		case 4:
			conta = qt * 2;
			System.out.println("Total: R$ " + conta);
			break;
		case 5:
			conta = qt * 1.5;
			System.out.println("Total: R$ " + conta);
			break;
		default:
			System.out.println("Digite um código de 1 a 5.");
		}

		input.close();
	}
}
