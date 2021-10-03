package Mercado;

import java.text.NumberFormat;

public class MainMercado {

	public static void main(String[] args) {
		Produto cerveja = new BebibaAlcoolica("Cerveja", 12.00, 3);
		Produto vinho = new BebibaAlcoolica("Vinho", 150, 12);
		Produto tv = new Eletrodomestico("Televisão", 2000.00, 110);
		Produto geladeira = new Eletrodomestico("Geladeira", 2352.64, 110);
		Produto radio = new Eletrodomestico("Radio", 837.59, 110);
		
		double valorQtdeCerveja = cerveja.Vender(5);
		double valorQtdeVinho = vinho.Vender(3);
		double valorQtdeTv = tv.Vender(9);
		double valorQtdeGeladeira = geladeira.Vender(3);
		double valorQtdeRadio = radio.Vender(1);
		
		double valorTotal = cerveja.Vender(5) + vinho.Vender(3) + tv.Vender(9) + geladeira.Vender(3) + radio.Vender(1);
		
		System.out.println(cerveja);
		System.out.println(vinho);
		System.out.println(tv);
		System.out.println(geladeira);
		System.out.println(radio);
		
		System.out.println("Valor Total: "+NumberFormat.getCurrencyInstance().format(valorTotal));		
	}

}
