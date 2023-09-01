import java.util.Scanner;

public class Exercicio04 {

	/*
	 4.	Implemente um algoritmo que realize o cálculo de um valor que foi depositado e
	  	exiba o valor com rendimento após um mês.
		a.	Implementar um método que retorne o valor calculado considerando 
				juro da poupança em 0.70% a. m.
	 */
	public static void main(String[] args) {
		
		obterDados();

	}

	public static void obterDados() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor depositado:");
		double valorDepositado = scanner.nextDouble();
		
		System.out.println("Informe a quantidade de meses rendimento");
		int quantidadeMeses = scanner.nextInt();
		
		scanner.close();
		
		calcularJuros(valorDepositado, quantidadeMeses);

	}

	private static void calcularJuros(double valorDepositado, int quantidadeMeses) {
		double valorJuros = (valorDepositado * 0.07) * quantidadeMeses;
		mostrarMensagem(valorJuros);
	}
	
	public static void mostrarMensagem(double valorJuros) {
		
		System.out.println("O valor calculado de juros será: " + 
				String.format("%.2f", valorJuros));
		
	}
}
