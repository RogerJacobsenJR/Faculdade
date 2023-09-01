public class Pessoa {
private String Nome;
private Integer Idade;
public String getNome() {return Nome;}	
public void setNome(String Nome) {this.Nome = Nome;}
public void setIdade(Integer Idade) {this.Idade = Idade;}
public Integer getIdade() {return Idade;}
public String calcularIdade (Integer Idade) {
	String resultado;
	if (Idade >= 16 && Idade < 18) {
		resultado = "Maior que 16 e menor que 18";
	} else if (Idade >= 18) {
		resultado = "Maior de idade";
	} else {
		resultado = "Menor de idade";
	}
	return resultado;	
}
}