package br.com.serratec.aula4;

public class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected double salario;
	protected String turno;
	
	public Funcionario (String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void calcParticipacaoSalario() {
		this.salario += this.salario*0.01;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s\n Salário: %.2f\n", this.nome, this.salario);
	}

}
