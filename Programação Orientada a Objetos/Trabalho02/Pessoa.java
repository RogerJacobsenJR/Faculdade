package unidep.trabalhoAvaliativoN2.teste.pessoa;

public abstract class Pessoa {
	
	private int idPessoa;
	private String nome;
	private int dataNasc;
	private int CPF;
	private int RG;
	private String email;
	
	
	public Pessoa(
			int idPessoa,int CPF, String nome,
			int dataNasc, 
			int RG, String email){
		
		super();
	
		this.idPessoa = idPessoa;
		this.CPF = CPF;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.RG = RG;
		this.setEmail(email);
	}
	
	
	
	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(int dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int CPF) {
		this.CPF = CPF;
	}

	public int getRG() {
		return RG;
	}

	public void setRG(int RG) {
		this.RG = RG;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public abstract int calcularIdade();
	


	}
