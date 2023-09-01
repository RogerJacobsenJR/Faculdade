
public class Exercicio04 {

	/*
	 4.	Implemente um algoritmo que leia um vetorA de 
	 	4 posições e mostre-o ordenando em ordem crescente. 
	 */
	public static void main(String[] args) {
		int[] vetorA = {5, 6, 4, 7, 8, 10, 9, 1};
		int auxiliar;
		
		for (int i = 0; i < vetorA.length; i++) {
			
			for (int j = 0; j < vetorA.length - 1; j++) {
				
				if (vetorA[j] > vetorA[ j + 1 ]) {
					auxiliar = vetorA[j];
					vetorA[j] =  vetorA[ j + 1 ];
					vetorA[j + 1] = auxiliar;
				}
				
			}
			
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}

	}

}
