import java.util.Scanner;

public class Exercicio02 {

	/*
	 2.	Implemente um algoritmo que leia o nome de um vendedor, o seu sal�rio fixo 
	 	e o valor total de vendas efetuadas por ele no m�s.

		a.	Sabendo que este vendedor ganha uma comiss�o 15% sobre suas vendas efetuadas, 
			implemente um m�todo que retorne o valor final de seu sal�rio.
 
	 */
	public static void main(String[] args) {
		obterDados();
	}
	
	public static void obterDados() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o nome do vendedor:");
		String nome = scanner.next();
		
		System.out.println("Informe o sal�rio do vendedor: ");
		double salario = scanner.nextDouble();
		
		System.out.println("Informe o valor total de vendas efetuado pelo " + nome + " no m�s");
		double valorTotalVenda = scanner.nextDouble();
		
		scanner.close();
		
		calcularSalario(salario, valorTotalVenda);
	}
	
	public static void calcularSalario(double salario, double valorTotalVenda) {
		double valorComissao = valorTotalVenda * 0.15;
		double valorSalarioCalculado = salario + valorComissao;
		
		System.out.println("O valor total calculado do sal�rio �: " +  
				String.format("%.2f", valorSalarioCalculado));
	}

}
