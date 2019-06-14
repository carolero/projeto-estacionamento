package br.com.zup.modelo;

import br.com.zup.teste.App;

public class Veiculo {
	
	// Atributos
	private String placa;
	private String tipoVeiculo;
	private String classificacao;
	private double horaEntrada;
	
	// Construtor
	public Veiculo() {
		
	}
	
	public Veiculo(String placa, String tipoVeiculo, String classificacao, double horaEntrada) {
		super();
		this.placa = placa;
		this.tipoVeiculo = tipoVeiculo;
		this.classificacao = classificacao;
		this.horaEntrada = horaEntrada;
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
	public double getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
	// Método para criar veículos
	public Veiculo criarVeiculo() {
		
		App.scan();
		
		String placa;
		String tipoVeiculo;
		String classificacao = "";
		double horarioEntrada;
		
		System.out.println("Qual a placa do carro?");
		placa = App.scan().nextLine();
		
		System.out.println("Qual o tipo do veículo?");
		tipoVeiculo = App.scan().nextLine();
		
		if (tipoVeiculo.equalsIgnoreCase("Carro")) {
			System.out.println("Qual a classificação do carro?");
			classificacao = App.scan().next();
		}
		
		System.out.println("Que horário o veículo está entrando?");
		horarioEntrada = App.scan().nextDouble();
		
		Veiculo veiculo = new Veiculo(placa, tipoVeiculo, classificacao, horarioEntrada);
				
		return veiculo;
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
