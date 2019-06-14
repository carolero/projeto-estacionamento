package br.com.zup.modelo;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
	
	// Atributos
	private List<Vaga> vagas = new ArrayList<Vaga>();
	private int vagasCarro;
	private int vagasMoto;
	private int vagasIdoso;
	private int vagasDeficiente;
	private int vagasComuns;
	
	// Construtor	
	public Estacionamento(int vagasCarro, int vagasMoto) {
		super();
		this.vagasCarro = vagasCarro;
		this.vagasMoto = vagasMoto;
	}

	// Getters & Setters
	public List<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(List<Vaga> vagas) {
		this.vagas = vagas;
	}
	
	public int getVagasCarro() {
		return vagasCarro;
	}

	public void setVagasCarro(int vagasCarro) {
		this.vagasCarro = vagasCarro;
	}

	public int getVagasMoto() {
		return vagasMoto;
	}

	public void setVagasMoto(int vagasMoto) {
		this.vagasMoto = vagasMoto;
	}

	public int getVagasIdoso() {
		return vagasIdoso;
	}

	public void setVagasIdoso(int vagasIdoso) {
		this.vagasIdoso = vagasIdoso;
	}

	public int getVagasDeficiente() {
		return vagasDeficiente;
	}

	public void setVagasDeficiente(int vagasDeficiente) {
		this.vagasDeficiente = vagasDeficiente;
	}

	public int getVagasComuns() {
		return vagasComuns;
	}

	public void setVagasComuns(int vagasComuns) {
		this.vagasComuns = vagasComuns;
	}

	// Método adicionar (na lista)
	public void adicionarVaga(Vaga vaga) {
		this.vagas.add(vaga);
	}
	
	// Calcular as vagas de idosos
	public int calcularVagasIdoso(int vagasCarro) {
		int vagasIdoso = 0;
		
		vagasIdoso = (vagasCarro * 5) / 100;
		this.setVagasIdoso(vagasIdoso);
		
		return vagasIdoso;
	}
	
	// Calcular as vagas de deficiente
	public int calcularVagasDeficiente(int vagasCarro) {
		int vagasDeficiente = 0;
		
		vagasDeficiente = (vagasCarro * 2) / 100; 
		this.setVagasDeficiente(vagasDeficiente);
		
		return vagasDeficiente;
	}
	
	// Vagas comuns
	public int calcularVagasComuns(int vagasCarro) {
		int vagasComuns = 0;
		
		int vagasEspeciais = this.getVagasIdoso() + this.getVagasDeficiente();
		vagasComuns =  vagasCarro - vagasEspeciais;
		this.setVagasComuns(vagasComuns);
		
		return vagasComuns;		
	}
	
	// Gerar vagas e nomea-las
		public List<Vaga> nomearVagas(List<Vaga> vagas, int vagasComuns, int vagasIdoso, int vagasDeficiente, int vagasMoto) {
			
			Vaga vaga = new Vaga(null, true);
			
			for (int i = 1; i <= vagasIdoso; i++) {
				
				int numeracao = i;
				
				String tipoVaga = "I";
				vaga.setTipoVaga(tipoVaga);

				vagas.add(new Vaga(tipoVaga + numeracao, true));
				
			}
			
			for (int d = 1; d <= vagasDeficiente; d++) {
				
				int numeracao = d;
				
				String tipoVaga = "D";
				vaga.setTipoVaga(tipoVaga);

				vagas.add(new Vaga(tipoVaga + numeracao, true));
				
			}
			
			for (int c = 1; c <= vagasComuns; c++) {
				
				int numeracao = c;
				
				String tipoVaga = "C";
				vaga.setTipoVaga(tipoVaga);

				vagas.add(new Vaga(tipoVaga + numeracao, true));
				
			}
			
			for (int m = 1; m <= vagasMoto; m++) {
				
				int numeracao = m;
				
				String tipoVaga = "M";
				
				vagas.add(new Vaga(tipoVaga + numeracao, true));
				
			}
			for (Vaga vagaEstacionamento : vagas) {
				System.out.println(vagaEstacionamento);
			}
			return vagas;
		}
	
	// Método to string
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "Lista de vagas: " + this.getVagas() + "\n";
		
		return modelo;
	}

}
