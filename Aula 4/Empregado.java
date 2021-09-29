package br.com.serratec.aula4;

public class Empregado {

	private String nome;
	
	private String sobrenome;
	
	private double salario;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Empregado(String nome, String sobrenome, double salario) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
	
	public double calcImpostoRenda(double salario) {
		if(this.salario<=1903.98) {
			return this.salario;
		} else if (this.salario>=1903.98 && this.salario<=2826.65) {
			return this.salario -= this.salario*0.075;
		} else if (this.salario>=2826.66 && this.salario<=3751.05) {
			return this.salario -= this.salario*0.15;
		} else if (this.salario>=3751.06 && this.salario<=4664.68) {
			return this.salario -= this.salario*0.225;
		} else {
			return this.salario -= this.salario*0.275;
		}
	}
	
	/*
	 * @Override
	 * public String toString() {
	 * 	return String.format...("...", this.nome,...)
	 * }
	 */
	
}
