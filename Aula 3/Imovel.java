package br.com.serratec.aula3;

public class Imovel {
	
	private int codImovel;
	
	private String bairro;
	
	private String tipo;
	
	private double valor;

	public int getCodImovel() {
		return codImovel;
	}

	public void setCodImovel(int codImovel) {
		this.codImovel = codImovel;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double calcReajuste() {
		if(this.tipo == "Casa") {
			valor *= 1.05;
		} else {
			valor *= 1.08;
		}
		return this.valor;
	}
	
	public String mostraCategoria() {
		String categoria;
		if(this.valor>=50000) {
			categoria = "Categoria: A";
		} else if (this.valor>10000 && this.valor<50000) {
			categoria = "Categoria: B";
		} else {
			categoria = "Categoria: C";
		}
		return categoria;
	}
}
