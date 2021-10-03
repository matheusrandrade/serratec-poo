package Exercicios;

public class Medico extends Plano{
	
	protected String nome;
	private int crm;
	
	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("Nome do Médico: %s\n CRM: %d \n", this.nome, this.crm);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getCrm() {
		return this.crm;
	}
	@Override
	public void calcularPagamento() {
		super.calcularPagamento();
		this.valorPago += this.valorPago*0.10;
	}

}
