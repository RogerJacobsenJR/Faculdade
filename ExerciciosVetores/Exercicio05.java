
public class Exercicio05 {

	/*
	 * 5.	Implemente um algoritmo que leia dois vetores de 10 posições e 
	 * faça a multiplicação dos elementos de mesmo índice, colocando o 
	 * resultado em um terceiro vetor e imprima-o na tela.
	 * 
	 */
	public static void main(String[] args) {
		//               0   1   2   3   4   5   6  7   8   9
		int[] vetorA = { 5,  9, 10,  11, 15, 6,  8, 20, 30, 23 };
		int[] vetorB = { 10, 8, 5,   17, 14, 43, 23, 12, 2, 10 };
		int[] vetorC = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			for (int j = 0; j < vetorB.length; j++) {
				if (i == j) {
					vetorC[i] = vetorA[i] * vetorB[j];
					System.out.println(
							vetorA[i] + " * " + vetorB[j] + " = " + vetorC[i]
							);
				}
			}
		}
		
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println("Valores: " + vetorC[i]);
		}

	}

}
