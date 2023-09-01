public class Funcionario extends Pessoa {
	public String calcularIdade (Integer Idade) {
		String resultado;
		if (Idade >= 16 && Idade < 18) {
			resultado = "Colaborador poderá ser vinculado a empresa como Menor Aprendiz";
		} else if (Idade >= 18) {
			resultado = "Colaborador poderá ser vinculado a empresa com contrato efetivo";
		} else {
			resultado = "Não poderá ter um vinculo a empresa";
		}
		return resultado;
	}
}