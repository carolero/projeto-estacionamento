package br.com.zup.teste;

import java.util.Scanner;

import br.com.zup.modelo.Estacionamento;

public class App {

	public static void main(String[] args) {
		
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
		
		
	}
	
	public static Scanner scan() {
		Scanner scan = new Scanner(System.in);
		return scan;
	}

}
