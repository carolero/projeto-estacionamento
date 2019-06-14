package br.com.zup.modelo;

public class Veiculo {
	
	// Atributos
	private String placa;
	private String tipoVeiculo;
	private String classificacao;
	
	// Construtor
	public Veiculo(String placa, String tipoVeiculo, String classificacao) {
		super();
		this.placa = placa;
		this.tipoVeiculo = tipoVeiculo;
		this.classificacao = classificacao;
	}
	
	// Getters & Setters
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	// Método to string
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "Placa -> " + this.getPlaca() + "\n";
		modelo += "Tipo do veículo -> " + this.getTipoVeiculo() + "\n";
		modelo += "Classificação -> " + this.getClassificacao() + "\n";
		
		return modelo;
	}

}
