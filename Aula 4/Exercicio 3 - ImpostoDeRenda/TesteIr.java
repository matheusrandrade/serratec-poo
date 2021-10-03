package br.com.serratec.aula4;

public class TesteIr {

	public static void main(String[] args) {
		
		PessoaFisica fisica1 = new PessoaFisica("Pedro Silva", "12345678933", "12394562", 5000.00);
		
		PessoaJuridica juridica1 = new PessoaJuridica("Padaria Do Carlos", "00852963000156", "185296355", 16000.00);
		
		fisica1.calculoIR();
		juridica1.calculoIR();
		
		System.out.println(fisica1);
		System.out.println(juridica1);
		
	}

}
