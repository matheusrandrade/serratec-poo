package Mercado;

import java.util.ArrayList;

public class CarrinhoCompra {
	
	private ArrayList<Item> Itens;

	public CarrinhoCompra() {
		this.Itens = new ArrayList<Item>();
	}
	
	public double getValorTotal() {
		double valorTotal = 0;
		for (Item i : Itens) {
			Produto produto = i.getProduto();
			valorTotal += produto.Vender(i.getQtdeDeItems());
		}
		return valorTotal;
	}
	public void addItem(Item item) {
		this.Itens.add(item);
	}

	public ArrayList<Item> getItens() {
		return Itens;
	}
}

