
public class Exercicio03 {

	/*
	 * 3. Implemente um algoritmo que recebe um vetor de inteiros chamado vetorA com
	 * 5 posições e um vetor de inteiros chamado vetorB também com 5 posições e
	 * retorne à quantidade total de números iguais que aparecem nos dois vetores.
	 * 
	 */
	public static void main(String[] args) {
		int[] vetorA = { 5, 9, 10, 11, 15 };
		int[] vetorB = { 10, 8, 5, 17, 14 };
		int contador = 0;

		for (int i = 0; i < vetorA.length; i++) {
//			System.out.println(vetorA[i]);

			for (int j = 0; j < vetorB.length; j++) {
//					System.out.println(
//							"Valor vetor A: " + vetorA[i] + 
//							"---------" +
//							"Valor vetor B: " + vetorB[j]
//					);
				if (vetorA[i] == vetorB[j]) {
					contador ++;
				}
			}

		}
		
		System.out.println("Os vetores A e B possuem " + contador +
				" números iguais.");

	}

}
