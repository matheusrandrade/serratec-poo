package br.com.serratec.aula6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {
	public String categoria;
	
	public Carro (String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public double lavarVeiculo() {
		valorCobrado += TipoServico.LAVAR.getValorServico();
		return valorCobrado;
	}
	
	public double trocarOleo() {
		if(this.dataConserto.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
			valorCobrado += TipoServico.TROCADEOLEO.getValorServico() - 50;

		} else {
			valorCobrado += TipoServico.TROCADEOLEO.getValorServico();
		}
		return valorCobrado;

	}
	public double revisao() {
		if (dataConserto.getMonth().equals(Month.AUGUST)) {
			valorCobrado += TipoServico.REVISAO.getValorServico() * 0.9;
		} else {
			valorCobrado += TipoServico.REVISAO.getValorServico();
		}
		return valorCobrado;
	}
}
