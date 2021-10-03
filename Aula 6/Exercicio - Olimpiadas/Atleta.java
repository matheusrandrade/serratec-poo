package Exercicio;

public class Atleta implements Olimpiadas {
	private String nome;
	private double peso;
	private String modalidade;
	private int totalParticipantes;
	private Pais pais;
	
	public Atleta (String nome, double peso, Pais pais) {
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
	}
	
	public String verificaSituacao() {
		if(this.peso>90) {
			this.modalidade = "Peso Pesado";
			return "Participar�";
		} else if (this.peso>60 && this.peso<90) {
			this.modalidade = "Peso Pesado";
			return "Participar�";
		} else {
			this.modalidade = "N�o Qualificado";
			return "N�o Participar�";
		}
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	public int getTotalParticipantes() {
		return totalParticipantes;
	}

	public Pais getPais() {
		return pais;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s, Peso: %.2f, Modalidade: %s, Pais: %s, Status: %s", this.nome, this.peso, this.modalidade, this.pais.getNome(), verificaSituacao());
	}
	
}
