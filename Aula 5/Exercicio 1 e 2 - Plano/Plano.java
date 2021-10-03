package Exercicios;

public class Plano {

	protected String empresa;
	protected double valorPago = 80;
	protected double valorIss = 5;
	
	public Plano (String empresa) {
		this.empresa = empresa;
	}
	@Override
	public String toString() {
		return String.format("Empresa: %s\n Valor Pago: %.2f\n", this.empresa, this.valorPago);
	}
	
	public void calcularPagamento() {
		this.valorPago -= this.valorPago*(this.valorIss/100);
	}
	
	public double getValorPago() {
		return this.valorPago;
	}
}
