package br.com.serratec.aula6;

public enum TipoServico {
	TROCADEOLEO(100.0), LAVAR(50.0), REVISAO(200.0);

	private final double valorServico;

	private TipoServico(double valorServico) {
		this.valorServico = valorServico;
	}
	public double getValorServico() {
		return valorServico;
	}

}
