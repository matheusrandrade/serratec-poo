package br.com.serratec.aula6;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {
	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	
	public Veiculo (String modelo, LocalDate dataConserto, Proprietario proprietario) {
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}
	@Override
	public String toString() {
		return String.format("Proprietário: %s\n Modelo: %s\n Valor Cobrado: %.2f\n ", this.proprietario, this.modelo, this.valorCobrado);	
	}
	
	public double getValorCobrado() {
		return valorCobrado;
	}	
}