package br.com.serratec.aula6;

import java.time.LocalDate;

public class Moto extends Veiculo {
	public int cilindradas;
	
	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}
	@Override
	public double lavarVeiculo() {
		return valorCobrado = TipoServico.LAVAR.getValorServico();
	}
	
	public double trocarOleo() {
		return valorCobrado = TipoServico.TROCADEOLEO.getValorServico();
	}
	public double revisao() {
		return valorCobrado = TipoServico.REVISAO.getValorServico();
	}
	
}
