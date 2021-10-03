package Mercado;

public class BebibaAlcoolica extends Produto {
	
	private int teorAlcoolico;
	
	public int getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(int teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	public BebibaAlcoolica(String nome, double valor, int teorAlcoolico) {
		super(nome, valor);
		this.teorAlcoolico = teorAlcoolico;
	}
	@Override
	public String toString() {
		return String.format("Produto: %s, Valor: %.2f, Teor Alcoolico: %d", this.getNome(), this.getValor(), this.teorAlcoolico);
	}
	@Override
	public double Vender(int qtdeDeItens) {
		return this.getValor() * qtdeDeItens;
	}
}
