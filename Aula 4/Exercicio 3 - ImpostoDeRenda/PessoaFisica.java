package br.com.serratec.aula4;

public class PessoaFisica extends ImpostoDeRenda {
	
	private String cpf;
	private String rg;
	
	public PessoaFisica (String nome, String cpf, String rg, double rendimentos) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	@Override
	public void calculoIR() {
		this.rendimentos -= this.rendimentos*0.12;
	}
	@Override
	public String toString() {
		return String.format("Pessoa Fisica - Nome: %s\n CPF: %s\n RG: %s\n Rendimentos: %.2f\n", 
								this.nome, this.cpf, this.rg, this.rendimentos);
	}

	
}
