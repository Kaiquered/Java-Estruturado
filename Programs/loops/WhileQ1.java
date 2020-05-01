import java.util.Scanner;

//programa que repete a leitura de uma senha até que ela seja válida.

public class WhileQ1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Digite a senha:");
		int senha = input.nextInt();

		while (senha != 2002) {

			System.out.println("Senha Inválida!");
			
			System.out.println("Digite a senha novamente:");
			senha = input.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		
		input.close();
	}
}
