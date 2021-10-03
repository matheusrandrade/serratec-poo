package br.com.serratec.aula4;

public class PessoaJuridica extends ImpostoDeRenda {

	private String cnpj;
	private String inscEstadual;
	
	public PessoaJuridica (String nome, String cnpj, String inscEstadual, double rendimentos) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}
	
	@Override
	public void calculoIR() {
		this.rendimentos -= rendimentos*0.15;
	}
	@Override
	public String toString() {
		return String.format("Pessoa Jur�dica - Nome: %s\n CNPJ: %s\n Inscri��o Estadual: %s\n Rendimentos: %.2f\n", 
								this.nome, this.cnpj, this.inscEstadual, this.rendimentos);
	}

	
}
