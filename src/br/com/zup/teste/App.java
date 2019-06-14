package br.com.zup.teste;

import java.util.Scanner;

import br.com.zup.modelo.Estacionamento;
import br.com.zup.modelo.Vaga;
import br.com.zup.modelo.Veiculo;

public class App {

	public static void main(String[] args) {
		
		Vaga vagas = new Vaga();
		Veiculo veiculo = new Veiculo();

		int vagasCarro;
		int vagasMoto;
		
		System.out.println("Quantas vagas para carro terão no estacionamento?");
		vagasCarro = scan().nextInt();
		
		System.out.println("Quantas vagas para moto terão no estacionamento?");
		vagasMoto = scan().nextInt();
	
		Estacionamento estacionamento = new Estacionamento(vagasCarro, vagasMoto);
		
		int vagasIdoso = estacionamento.calcularVagasIdoso(vagasCarro);
		int vagasDeficiente = estacionamento.calcularVagasDeficiente(vagasCarro);
		int vagasComuns = estacionamento.calcularVagasComuns(vagasCarro);
		
		estacionamento.setVagasIdoso(vagasIdoso);
		estacionamento.setVagasDeficiente(vagasDeficiente);
		estacionamento.setVagasComuns(vagasComuns);
		
		
		estacionamento.nomearVagas(estacionamento.getVagas(), estacionamento.getVagasComuns(), estacionamento.getVagasIdoso()
				, estacionamento.getVagasDeficiente(), estacionamento.getVagasMoto());
		
		
		// Entrar para o estacionamento (passar esse método para o caixa depois)
		
		int controle = 1;
		
		System.out.println("Bem vindo(a) ao estacionamento. Digite:");
		while (controle == 1) {
			
			System.out.println("\n\n1- Para vizualizar as vagas;\n"
					+ "2- Para entrar no estacionamento;\n"
					+ "3- Para sair do estacionamento;\n"
					+ "4- Para desligar.\n");
			int opcao = scan().nextInt();
			
			if (opcao == 1) {
				// mostrar as vagas
				estacionamento.mostrarVagas(vagas);
				
			} else if (opcao == 2) {
				// entrar no estacionamento
				estacionamento.entrarNoEstacionamento(estacionamento.getVagas());
				
				
				
			} else if (opcao == 3) {
				
			} else if (opcao == 4) {
				
			} else {
				System.err.println("Opção invalida, tente novamente.\n\n");
			}
			
		}
		
		
	}
	
	public static Scanner scan() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

}
