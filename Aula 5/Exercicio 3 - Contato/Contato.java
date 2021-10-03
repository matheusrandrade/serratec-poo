package model;

//import java.util.ArrayList;

public class Contato {
	
	private String nome;
	
	private Endereco endereco;
	
	private Telefone[] telefones; //ArrayList<Telefone> telefones = new ArrayList<Telefone>();

	public Contato (String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	
	public void mostraTelefones() {
		 for(int i = 0; i < telefones.length; i++){
		  	System.out.println(telefones[i].getNumero());
		 }
		 
	}
	
}
