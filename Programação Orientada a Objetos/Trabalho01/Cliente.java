public class Cliente extends Pessoa {
	public String calcularIdade (Integer Idade) {
		String resultado;
		if (Idade >= 16 && Idade < 18) {
			resultado = "Cliente poderá ter um cadastro desde que tenha aprovação de um responsável";
		} else if (Idade >= 18) {
			resultado = "Cliente podera ter um cadastro sujeito a consulta no SPC";
		} else {
			resultado = "Não poderá ter um cadastro devido idade ser menor de 16 anos";
		}
		return resultado;
	}
}