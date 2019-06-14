package br.com.zup.modelo;

public class Caixa {
	
	// Atributos
	private double horaEntrada;
	private double horaSaida;
	private int valorTotal;
	
	// Construtor
	public Caixa(double horaEntrada, double horaSaida) {
		super();
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
	}
	
	// Getters & Setters
	public double getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public double getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(double horaSaida) {
		this.horaSaida = horaSaida;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	// Métodos para calcular a quantidade de horas e valor
	public double calcularHoras(double horaEntrada, double horaSaida) {
		double horas;
		
		horas = this.getHoraSaida() - this.getHoraEntrada();
		
		return horas;
	}
	

	public int calcularValor(double horas) {
		int valor = 0;
		
		if (horas <= 0.15) {
			
			valor = 0;
			
		} else if (horas > 0.15 && horas <= 1.0) {
			
			valor = 10;
			
		} else {
			
			valor = 10;
			valor = (int) ((horas * 5) + valor);
			
		}
		
		return valor;
	}
	
	// Método to string
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "Horário de entrada -> " + this.getHoraEntrada() + "\n";
		modelo += "Horário de saída -> " + this.getHoraSaida() + "\n";
		modelo += "Valor total a pagar: R$" + this.getValorTotal() + "\n";
		
		return modelo;
	}

}
