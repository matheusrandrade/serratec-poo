package br.com.serratec.aula6;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario proprietario1 = new Proprietario("Pedro");
		Carro carro1 = new Carro("Celta", LocalDate.now(), proprietario1, "Popular"); 
	
		carro1.trocarOleo();
		carro1.lavarVeiculo();
		
		System.out.println(carro1);
	}
	
	

}
