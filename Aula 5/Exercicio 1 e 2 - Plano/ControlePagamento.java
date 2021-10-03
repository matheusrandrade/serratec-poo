package Exercicios;

public class ControlePagamento{

	private double totalPago;
	
	public double getTotalPago() {
		return this.totalPago;
	}
	
	public void calcularTotalPago(Plano plano) {
		this.totalPago += plano.valorPago;	
	}
	
}
