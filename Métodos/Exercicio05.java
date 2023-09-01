import java.util.Scanner;

public class Exercicio05 {

	/*
	 5.	Implemente um algoritmo que solicite o nome e a altura de 10 pessoas, 
	 	em seguida implemente um método que retorne:
		a.	A maior e a menor altura do grupo;
		b.	Média de altura.
 
	 */
	public static void main(String[] args) {
		obterDados();
	}
	
	public static void obterDados() {
		
		String[] nomes = new String[10];
		double[] alturas = new double[10];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("************** Informe os dados **************");
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Informe o nome da pessoa [ " + (i + 1) + " ]: ");
			String nome = scanner.next();
			nomes[i] = nome;
			
			System.out.println("Informe a altura da pessoa [ " + (i + 1) + " ]: ");
			double altura = scanner.nextDouble();
			alturas[i] = altura;
			
		}
		
		scanner.close();
		System.out.println("***********************************************");
		
		calcularAltura(nomes, alturas);
	
	}
	
	public static void calcularAltura(String[] nomes, double[] alturas) {
		double maiorAltura = Double.MIN_VALUE;
		double menorAltura = Float.MAX_VALUE;
		int posicaoMaiorAltura = 0;
		int posicaoMenorAltura = 0;
		
		double somaAlturaPessoas = 0;
		
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
				posicaoMaiorAltura = i;
			}
			
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
				posicaoMenorAltura = i;
			}
			somaAlturaPessoas += alturas[i];
		}
		String nomeMaiorAltura = nomes[posicaoMaiorAltura];
		String nomeMenorAltura = nomes[posicaoMenorAltura];
		double mediaAltura = somaAlturaPessoas / alturas.length;
		
		mostrarMensagem(nomeMaiorAltura, nomeMenorAltura, mediaAltura);
	}
	private static void mostrarMensagem(String nomeMaiorAltura, String nomeMenorAltura, double mediaAltura) {
		System.out.println("A pessoa com a maior altura é: " + nomeMaiorAltura);
		System.out.println("A pessoa com a menor altura é: " + nomeMenorAltura);
		System.out.println("A média de altura das pessoas é: " + mediaAltura);
	}
 
}
