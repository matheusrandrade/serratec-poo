package br.com.serratec.aula9;

public class Aluno {

	private String nome;
	
	private double nota1;
	
	private double nota2;
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double calcularMedia(double nota1, double nota2) throws AlunoException {
		if((this.nota1> 10 || this.nota1<0) || (this.nota2<0 || this.nota2>10)) {
			throw new AlunoException("Um valor informado está fora do limite permitido. \n Execução Suspensa!");
		} else {
			double media = (this.nota1+this.nota2)/2;	
			return media;
		}		
	}
	
	@Override
	public String toString() {
		return String.format("Aluno - Nome: %s, Nota1: %.2f, Nota2: %.2f", this.nome, this.nota1, this.nota2);
	}
}