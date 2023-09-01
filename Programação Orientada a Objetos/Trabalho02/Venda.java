package unidep.trabalhoAvaliativoN2.teste.venda;

import unidep.trabalhoAvaliativoN2.teste.imposto.Imposto;

public class Venda implements Imposto{
	

	private String estadoVenda;
	private String produto;
	private int dataVenda;
	private Double valorVenda;
	private Double icmsParana = valorVenda * 0.7/100;
	private Double icmsOutrosEstados = valorVenda * 12/100;
	
	
	@Override
	public Double calculcarICMS() {
		return null;
	}	
	
	public String getEstadoVenda() {
		return estadoVenda;
	}

	public void setEstadoVenda(String estadoVenda) {
		this.estadoVenda = estadoVenda;
	}
	
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(int dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Double getIcmsParana() {
		return icmsParana;
	}

	public void setIcmsParana(Double icmsParana) {
		this.icmsParana = icmsParana;
	}

	public Double getIcmsOutrosEstados() {
		return icmsOutrosEstados;
	}

	public void setIcmsOutrosEstados(Double icmsOutrosEstados) {
		this.icmsOutrosEstados = icmsOutrosEstados;
	}
		
}
