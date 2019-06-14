package br.com.zup.modelo;

public class Vaga {
	
	// Atributos
	private String tipoVaga = "";
	private int numeroVaga = 0;
	private boolean disponibilidade = true;
	private Veiculo veiculo = null;
	
	// Construtor
	public Vaga () {
		
	}
	
	public Vaga(String tipoVaga, int numeroVaga, boolean disponibilidade, Veiculo veiculo) {
		super();
		this.tipoVaga = tipoVaga;
		this.numeroVaga = numeroVaga;
		this.disponibilidade = disponibilidade;
		this.veiculo = veiculo;
	}
	
	// Getters & Setters
	public String getTipoVaga() {
		return tipoVaga;
	}
	public void setTipoVaga(String tipoVaga) {
		this.tipoVaga = tipoVaga;
	}
	public int getNumeroVaga() {
		return numeroVaga;
	}
	public void setNumeroVaga(int numeroVaga) {
		this.numeroVaga = numeroVaga;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	// Método to string
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "Vaga -> " + this.getTipoVaga() + this.numeroVaga + "\n";
		modelo += "Disponibilidade -> " + this.isDisponibilidade() + "\n";
		modelo += "Veiculo: " + this.getVeiculo() + "\n";
		
		return modelo;
	}

}
