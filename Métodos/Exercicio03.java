import java.util.Scanner;

public class Exercicio03 {

	/*
	  3.	Implemente um algoritmo que realize a conversão de um valor em real (R$) para dólar (US$). 

			a.	Implementar um método que deverá solicitar a quantidade em reais (R$) e a
			 	cotação do dólar, logo em seguida retornar o valor calculado. 

	 */
	public static void main(String[] args) {
		obterDados();
	}
	
	public static void obterDados() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor em R$:");
		double valorReal = scanner.nextDouble();
		
		System.out.println("Informe a cotação do U$");
		double cotacao = scanner.nextDouble();
		
		scanner.close();
		
		realizarConversao(valorReal, cotacao);
	}
	
	public static void realizarConversao(double valorReal, double cotacao) {
		double valorDolar = valorReal / cotacao;
		mostrarMensagem(valorDolar);
	}
	
	public static void mostrarMensagem(double valorDolar) {
		
		System.out.println("O valor convertido em é U$: " + 
				String.format("%.2f", valorDolar));
		
	}

}
