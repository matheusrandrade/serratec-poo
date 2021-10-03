package Mercado;

public abstract class Produto implements Venda{
	
	private String nome;
	
	private double valor;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Produto (String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public double Vender(int qtdeDeItens) {
		return this.valor * qtdeDeItens;
	}
}
