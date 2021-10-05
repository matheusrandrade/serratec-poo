package Mercado;

import java.text.NumberFormat;

public class MainMercado {

	public static void main(String[] args) {
		Produto cerveja = new BebibaAlcoolica("Cerveja", 12.00, 3);
		Produto vinho = new BebibaAlcoolica("Vinho", 150, 12);
		Produto tv = new Eletrodomestico("Televisão", 2000.00, 110);
		Produto geladeira = new Eletrodomestico("Geladeira", 2352.64, 110);
		Produto radio = new Eletrodomestico("Radio", 837.59, 110);
		
		CarrinhoCompra carrinho = new CarrinhoCompra();
		
		carrinho.addItem(new Item(5,cerveja));
		carrinho.addItem(new Item(3,vinho));
		carrinho.addItem(new Item(9,tv));
		carrinho.addItem(new Item(3,geladeira));
		carrinho.addItem(new Item(1,radio));
		
		for(Item i : carrinho.getItens()) {
			Produto produto = i.getProduto();
			System.out.printf(produto + " Subtotal: %s, Quantidade: %d; \n", NumberFormat.getCurrencyInstance().format(produto.Vender(i.getQtdeDeItems())), i.getQtdeDeItems());
		}
		
		System.out.println("Valor Total: "+NumberFormat.getCurrencyInstance().format(carrinho.getValorTotal()));		
	}

}
