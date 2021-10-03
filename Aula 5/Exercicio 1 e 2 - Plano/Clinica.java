package Exercicios;

public class Clinica extends Plano {
	
	private String nome;
	private String cgc;
	
	public Clinica (String empresa, String nome, String cgc) {
		super(empresa);
		this.nome = nome;
		this.cgc = cgc;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("Nome da Clínica: %s\n CGC: %s\n", this.nome, this.cgc);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCgc() {
		return this.cgc;
	}
	

}
