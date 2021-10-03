package br.com.serratec.aula4;

public class Gerente extends Funcionario {
	
	private String nivel;
	
	public Gerente (String nome, double salario, String nivel) {
		super(nome, salario);
		this.nivel = nivel;
	}
	@Override
	public void calcParticipacaoSalario() {
		super.calcParticipacaoSalario();
		this.salario += 200;
	}
}
