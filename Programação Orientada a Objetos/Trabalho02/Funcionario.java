package unidep.trabalhoAvaliativoN2.teste.funcionario;

import unidep.trabalhoAvaliativoN2.teste.pessoa.Pessoa;

public class Funcionario extends Pessoa {
	
	
	private Double salario;
	private String numeroCtps;
	private String setor;
	private String cargo;
	private int idFuncionario;
	private String dataAdmissao;
	private String dataDemissao;
	
	
	public Funcionario(
			int idPessoa, int CPF, String nome, 
			int idade, int dataNasc, int RG, 
			String email, Double salario, 
			String numeroCtps, String setor, 
			String cargo, int idFuncionario, 
			String dataAdmissao, String dataDemissao) {
		super
		(idPessoa, CPF, nome, dataNasc, RG, email);
		
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		this.idFuncionario = idFuncionario;
		this.numeroCtps = numeroCtps;
		this.salario = salario;
		this.setor = setor;
	}
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getNumeroCtps() {
		return numeroCtps;
	}
	public void setNumeroCtps(String numeroCtps) {
		this.numeroCtps = numeroCtps;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getDataDemissao() {
		return dataDemissao;
	}
	public void setDataDemissao(String dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	@Override
	public int calcularIdade() {
		return 0;
	}

}
