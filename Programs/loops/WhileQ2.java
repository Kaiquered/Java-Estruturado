import java.util.Scanner;

/*Programa que contabiliza o ac�mulo de op��es escolhidas de  �lcool, Gasolina e Diesel
 * at� ser digitado a op��o 4, em seguida mostra o resultado.
 */

public class WhileQ2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int item = 0 , a = 0, g = 0, d = 0;
				
		while (item != 4) {
			
			System.out.println("Digite a op��o:");
			
			item = input.nextInt();
			
			if (item == 1) 
				a += 1;
			if (item == 2) 
				g += 1;
			if (item == 3) 
				d += 1;
		
		}
   
		System.out.println("Muito Obrigado!");
		System.out.printf("�lcool:%d \nGasolina:%d \nDiesel:%d",a,g,d);
		
		input.close();
		
	}
}
