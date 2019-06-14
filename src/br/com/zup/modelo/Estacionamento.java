package br.com.zup.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.zup.teste.App;

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
			
		Vaga vaga = new Vaga();
		
		for (int i = 1; i <= vagasIdoso; i++) {
			
			int numeracao = i;
			
			String tipoVaga = "I";
			vaga.setTipoVaga(tipoVaga);

			vagas.add(new Vaga(tipoVaga, numeracao, true, null));
			
		}
		
		for (int d = 1; d <= vagasDeficiente; d++) {
			
			int numeracao = d;
			
			String tipoVaga = "D";
			vaga.setTipoVaga(tipoVaga);

			vagas.add(new Vaga(tipoVaga, numeracao, true, null));
			
		}
		
		for (int c = 1; c <= vagasComuns; c++) {
			
			int numeracao = c;
			
			String tipoVaga = "C";
			vaga.setTipoVaga(tipoVaga);

			vagas.add(new Vaga(tipoVaga, numeracao, true, null));
			
		}
		
		for (int m = 1; m <= vagasMoto; m++) {
			
			int numeracao = m;
			
			String tipoVaga = "M";
			
			vagas.add(new Vaga(tipoVaga, numeracao, true, null));
			
		}
		
		return vagas;
		
	}
	
	// Método para mostrar todas as vagas do estacionamento
	public void mostrarVagas(Vaga listaVagas) {
		for (Vaga vaga : vagas) {
			System.out.println(vaga);
		}
	}
	
	// Método para entrar no estacionamento
	public void entrarNoEstacionamento(List<Vaga> vagas) {

		Veiculo veiculo = new Veiculo();
//		Vaga vagasDoEstacionamento = new Vaga();
		
		// Chama o método criar veículo
		veiculo = veiculo.criarVeiculo();
		
		System.out.println("\nNosso sistema de estacionamento tem suas vagas dividias em:\n"
				+ "I - vagas para idosos;\n"
				+ "D - vagas para deficientes;\n"
				+ "C - vagas comuns;\n"
				+ "M - vagas para motos.\n"
				+ "E cada uma possuí uma numeração específica.");
		
		System.out.println("\nEm qual tipo de vaga vai estacionar o veículo?");
		String classificacaoEscolhida = App.scan().next();
		
		System.out.println("\nQual a numeração escolhida?");
		int numeracaoEscolhida = App.scan().nextInt();
		
		
		for (int i = 0; i < vagas.size(); i++) {
			Vaga vaga = vagas.get(i);
			
			if (classificacaoEscolhida.equalsIgnoreCase(vaga.getTipoVaga()) && 
					numeracaoEscolhida == vaga.getNumeroVaga() &&
					vaga.getVeiculo() == null) {
				
				vaga.setVeiculo(veiculo);
				vaga.setDisponibilidade(false);
				
			} else if (classificacaoEscolhida.equalsIgnoreCase(vaga.getTipoVaga()) && 
					vaga.getVeiculo() != null) {
				
				System.out.println("A vaga está ocupada");
				
			} 
			
		}
		
	}
		
		
	// Método to string
	@Override
	public String toString() {
		String modelo = "";
		
		modelo += "Lista de vagas: " + this.getVagas() + "\n";
		
		return modelo;
	}

}
