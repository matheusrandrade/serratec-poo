package Mercado;

public class Item {
	private int qtdeDeItems;
	
	private Produto produto;
	
	public Item(int qtdeDeItems, Produto produto) {
		super();
		this.qtdeDeItems = qtdeDeItems;
		this.produto = produto;
	}

	public int getQtdeDeItems() {
		return qtdeDeItems;
	}

	public void setQtdeDeItems(int qtdeDeItems) {
		this.qtdeDeItems = qtdeDeItems;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}	
}
