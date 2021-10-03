package Mercado;

public class Eletrodomestico extends Produto {
	
	private int voltagem;
	
	public Eletrodomestico(String nome, double valor, int voltagem) {
		super(nome, valor);
		this.voltagem = voltagem;
	}
	
	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	@Override
	public String toString() {
		return String.format("Produto: %s, Valor: %.2f, Voltagem: %d", this.getNome(), this.getValor(), this.voltagem);
	}
	@Override
	public double Vender(int qtdeDeItens) {
		return this.getValor() * qtdeDeItens;
	}
}
