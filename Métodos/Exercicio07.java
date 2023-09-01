import java.util.Scanner;

public class Exercicio07 {

	/*
	 7.	Implemente um algoritmo que pergunte quanto a pessoa deseja realizar de empréstimo,
			faça o cálculo do empréstimo a juros compostos. Para realizar o empréstimo solicite:

		a.	Valor do empréstimo;
		b.	Quantidade de parcelas (considere taxa de juros de 2% a. m.).
		c.	Implementar um método que irá calcular 
			quanto a pessoa pagará de juros após a aplicação.
	 */
	public static void main(String[] args) {
		obterDados();
	}
	
	public static void obterDados() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o nome da pessoa que deseja realizar o empréstimo:");
		String nome = scanner.next();
		
		System.out.println("Informe o valor do empréstimo:");
		double valorEmprestimo = scanner.nextDouble();
		
		System.out.println("Informe a quantidade de meses para pagamento:");
		int numeroMeses = scanner.nextInt();
		
		scanner.close();
		calcularJuros(nome, valorEmprestimo, numeroMeses);

	}

	private static void calcularJuros(String nome, double valorEmprestimo, int numeroMeses) {
		double taxaJuros = 0.02;
		double valorJuros = 0;
		double valorFinal = 0;
		
		valorJuros = valorEmprestimo * (Math.pow((1 + taxaJuros), numeroMeses));
		valorFinal = valorJuros + valorEmprestimo;
		
		System.out.println("O valor final do Juros é: " + String.format("%.2f", valorFinal));
	}
	
	

}
