package Exercicios;

public class Anestesista extends Medico {
	
	private String tipoAnestesia;
	
	public Anestesista(String empresa, String nome, int crm, String tipoAnestesia) {
		super(empresa, nome, crm);
		this.tipoAnestesia = tipoAnestesia;
	}
	
	public String getTipoAnestesia() {
		return this.tipoAnestesia;
	}
	
	public void setTipoAnestesias(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("Tipo de Anestesia: %s\n", this.tipoAnestesia);
	}
	@Override
	public void calcularPagamento() {
		super.calcularPagamento();
		this.valorPago += this.valorPago + 1000.00;	
	}
}
