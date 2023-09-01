
public class Exercicio08 {

	/*
	 	8.	Implemente um método que leia um valor inteiro e mostre na tela todos 
	 		os números pares abaixo. 
	 */
	public static void main(String[] args) {
		lerVetor();
	}

	private static void lerVetor() {
		int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Os valores pares menor que " + valores.length + " são eles.");
		for (int i = valores.length; i >= 1; i--) {
			if (valores[i-1] % 2 == 0) {
				System.out.println("Valor: "  + valores[i-1]);
			}
			
		}
	}

}
