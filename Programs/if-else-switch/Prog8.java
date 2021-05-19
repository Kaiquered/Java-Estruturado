package application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

/*
 ************************************************************
 Programa: IMC
 
 Autor: Kaíque Gomes Machado
    
 Descrição: lê a altura e o peso do usuário para calcular o
 valor do IMC. 
 
 VALORES DE IMC
 Abaixo do peso: menor que 18,5;
 Normal: entre 18,5 e 24,9;
 Acima do peso: entre 25 e 29,9;
 Obeso: 30 ou mais.
 
 18/05/2020
 ************************************************************
 */

public class Prog8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner re = new Scanner(System.in);

		float altura = 0.00f, peso = 0.00f, imc = 0.00f;

		System.out.println("********Cálculo do IMC********");

		System.out.println("Digite sua altura(metros): ");

		altura = re.nextFloat();

		System.out.println("Digite seu peso(Kg): ");

		peso = re.nextFloat();

		imc = peso / (altura * altura);

		BigDecimal imc_ = new BigDecimal(imc).setScale(2, RoundingMode.DOWN);

		System.out.printf("IMC = %.2f%n", imc_.floatValue());

		System.out.print("Você está ");

		if (imc_.floatValue() < 18.50f)
			System.out.println("abaixo do peso.");
		else if (imc_.floatValue() <= 24.90f)
			System.out.println("normal.");
		else if (imc_.floatValue() <= 29.90f)
			System.out.println("acima do peso.");
		else
			System.out.println("obeso.");

		re.close();

	}
}
