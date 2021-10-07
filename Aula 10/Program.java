package br.com.serratec.aula10;

import java.util.HashMap;

public class Program {

	public static void main(String[] args) {
		HashMap<String, String[]> mapCarros = new HashMap<>();
		
		mapCarros.put("Volkswagen", new String[] {
				"Fusca", "Gol"
		});
		mapCarros.put("Fiat", new String[] {
				"Uno", "Bravo"
		});
		mapCarros.put("Chevrolet", new String[] {
				"Celta", "Cruze"
		});
		
		for(String chave : mapCarros.keySet()) {
			String[] valores = mapCarros.get(chave);
			String valoresConca = String.join(", ", valores);			
			System.out.printf("Chave: %s, Modelos: %s \n", chave, valoresConca);
			
		}
	}

}
