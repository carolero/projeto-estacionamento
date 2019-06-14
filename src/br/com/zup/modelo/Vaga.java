package br.com.zup.modelo;

import java.util.List;

public class Vaga {
	
	// Atributos
	private String tipoVaga;
	private boolean disponibilidade;
	
	// Construtor
	public Vaga(String tipoVaga, boolean disponibilidade) {
		super();
		this.tipoVaga = tipoVaga;
		this.disponibilidade = disponibilidade;
	}
	
	// Getters & Setters
	public String getTipoVaga() {
		return tipoVaga;
	}
	public void setTipoVaga(String tipoVaga) {
		this.tipoVaga = tipoVaga;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	
	
	// Método to string
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "Tipo da vaga -> " + this.getTipoVaga() + "\n";
		modelo += "Disponibilidade -> " + this.isDisponibilidade() + "\n";
		
		return modelo;
	}

}
