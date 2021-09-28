package br.com.serratec.aula3;

public class MainImovel {

	public static void main(String[] args) {

	Imovel imovel1 = new Imovel();
	
	imovel1.setCodImovel(1);
	imovel1.setBairro("Centro");
	imovel1.setTipo("Apto");
	imovel1.setValor(25000);
	
	Imovel imovel2 = new Imovel();
	
	imovel2.setCodImovel(2);
	imovel2.setBairro("Quintandinha");
	imovel2.setTipo("Casa");
	imovel2.setValor(98900);
	
	System.out.println(imovel1.mostraCategoria());
	System.out.println(imovel1.calcReajuste());
	
	System.out.println(imovel2.mostraCategoria());
	System.out.println(imovel2.calcReajuste());
	
	}

}
