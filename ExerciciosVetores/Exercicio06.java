public class Exercicio06 {

	/*
	 * 6.	Implemente um algoritmo que leia dois vetores 
	 * de 5 posições, em seguida implemente um vetor 
	 * de 10 posições que contenha os valores dos vetores 
	 * anteriores e mostre-o na tela em ordem crescente.
	 */
	
	public static void main(String[] args) {
		int[] vetorA = { 10, 9, 8, 7, 6 };
		int[] vetorB = { 5, 4, 3, 2, 1};
		int[] vetorC = new int[10];
		int auxiliar;
		
		// Adiciona os valores do vetorA no vetorC
		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i];
		}
		
		// Adiciona os valores do vetorB no vetorC
		for (int i = 0; i < vetorB.length; i++) {
			vetorC[i + 5] = vetorB[i];
		}
		
		// Realiza a ordenação de forma crescente do vetorC.
		for (int i = 0; i < vetorC.length; i++) {
			for (int j = 0; j < vetorC.length - 1; j++) {
				if (vetorC[j] > vetorC[ j + 1 ]) {
					auxiliar = vetorC[j];
					vetorC[j] =  vetorC[ j + 1 ];
					vetorC[j + 1] = auxiliar;
				}
			}
		}
		
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i]);
		}

	}

}
