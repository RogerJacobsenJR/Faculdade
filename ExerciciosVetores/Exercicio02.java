
public class Exercicio02 {

	/*
	 2.	Implemente um algoritmo que recebe um vetor de inteiros 
	 	positivos e substitua seus ele-mentos de valor ímpar por 
	 	-1 e os pares por +1. 
	 */
	public static void main(String[] args) {
	
		int[] valores = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < valores.length; i++) {
			
			int valorAtualDoFor = valores[i];
			
			if (valorAtualDoFor % 2 == 0) {
				valorAtualDoFor = 1;
			} else {
				valorAtualDoFor = -1;
			}
			valores[i] = valorAtualDoFor;
		}
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Valores: " + valores[i]);
		}

	}

}
