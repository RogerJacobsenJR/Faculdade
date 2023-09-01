import java.util.Scanner;

public class Exercicio06 {

	/*
	 	6.	Implemente um algoritmo que calcule a m�dia de sal�rios de uma empresa, 
	 		pedindo ao usu�rio a grade de funcion�rios e os sal�rios, 
	 		em seguida implemente um m�todo que retorne a m�dia salarial.
	 */
	public static void main(String[] args) {
		obterDados();
	}
	
	public static void obterDados() {
		String[] nomes = new String[3];
		double[] salarios = new double[3];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("************** Informe os dados **************");
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Informe o nome do funcion�rio [ " + (i + 1) + " ]: ");
			String nome = scanner.next();
			nomes[i] = nome;
			
			System.out.println("Informe o sal�rio do funcion�rio [ " + (i + 1) + " ]: ");
			double salario = scanner.nextDouble();
			salarios[i] = salario;
			
		}
		
		scanner.close();
		
		System.out.println("***********************************************");
		calcularMediaSalarios(nomes, salarios);
	}

	private static void calcularMediaSalarios(String[] nomes, double[] salarios) {
		double valorTotal = 0;
		double media = 0;
		for (int i = 0; i < salarios.length; i++) {
			valorTotal += salarios[i];
		}
		
		media = valorTotal / salarios.length;
		mostrarMediaSalarioFuncionario(nomes, salarios, media);
		
	}
	
	public static void mostrarMediaSalarioFuncionario(String[] nomes, double[] salarios, double media) {
		System.out.println("****** Rela��o sal�rio dos funcionarios ******");
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Funcion�rio: " + nomes[i] + " - Sal�rio R$: " + salarios[i]);
		}
		System.out.println("A m�dia de sal�rio dos funcion�rios da rela��o � R$: " + 
				String.format("%.2f", media));
		
		System.out.println("***********************************************");
	}

}
