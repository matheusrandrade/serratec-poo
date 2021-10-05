package model;

//import java.util.ArrayList;

public class Contato {
	
	private String nome;
	
	private Endereco endereco;
	
	private ArrayList<Telefone> telefones;

	public Contato (String nome, Endereco endereco, ArrayList<Telefone> telefones) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = telefones;
	}
	
	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(ArrayList<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	public void mostraTelefones() {
		for(Telefone i : telefones) {
			System.out.println(String.format("Telefone: %s", i.getNumero()));
		}
	}
	
}
