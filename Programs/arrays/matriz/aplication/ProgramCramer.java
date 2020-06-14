/*
 ****************************************************************
 Programa: Regra de Cramer
 
 Autor: Kaíque Gomes Machado
    
 Descrição: aplica a Regra de Cramer em um sistema linear 3x3
 definido pelo programa.
 
 17/05/2020
 ****************************************************************
 */

package matriz.aplication;

public class ProgramCramer {

	public static void main(String[] args) {

		double[][] matriz = { { 1, 2, 3, 1 }, { 6, 8, 10, 1 }, { 10, 3, 5, 1 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("********************");

		System.out.printf("DET: %.2f", delta(matriz));
		System.out.printf("\nDETX: %.2f", deltaX(matriz));
		System.out.printf("\nDETY: %.2f", deltaY(matriz));
		System.out.printf("\nDETZ: %.2f\n", deltaZ(matriz));

		System.out.println("********************");

		System.out.printf("X: %.2f", deltaX(matriz) / delta(matriz));
		System.out.printf("\nY: %.2f", deltaY(matriz) / delta(matriz));
		System.out.printf("\nZ: %.2f", deltaZ(matriz) / delta(matriz));
	}

	public static double delta(double[][] m) {

		double[][] mS = new double[3][5];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {

				if (j < 3)
					mS[i][j] = m[i][j];

				if (j == 3 || j == 4)
					mS[i][j] = m[i][j - 3];
			}
		}
		double delta = (mS[0][0] * mS[1][1] * mS[2][2] + mS[0][1] * mS[1][2] * mS[2][0]
				+ mS[0][2] * mS[1][0] * mS[2][1])
				- (mS[0][2] * mS[1][1] * mS[2][0] + mS[0][0] * mS[1][2] * mS[2][1] + mS[0][1] * mS[1][0] * mS[2][2]);

		return delta;
	}

	public static double deltaX(double[][] m) {

		double[][] mX = new double[3][5];

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {

				if (j == 0)
					mX[i][j] = m[i][3];
				else
					mX[i][j] = m[i][j];
			}

		return delta(mX);
	}

	public static double deltaY(double[][] m) {

		double[][] mY = new double[3][5];

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {

				if (j == 1)
					mY[i][j] = m[i][3];
				else
					mY[i][j] = m[i][j];
			}

		return delta(mY);
	}

	public static double deltaZ(double[][] m) {

		double[][] mZ = new double[3][5];

		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {

				if (j == 2)
					mZ[i][j] = m[i][3];

				else
					mZ[i][j] = m[i][j];
			}

		return delta(mZ);
	}
}