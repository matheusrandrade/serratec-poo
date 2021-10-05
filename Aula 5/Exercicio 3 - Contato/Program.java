package model;

public class Program {

	public static void main(String[] args) {
		
		Estado estado1 = new Estado("Rio de Janeiro", "RJ");
		Estado estado2 = new Estado("Espirito Santo", "ES");
		
		Cidade cidade1 = new Cidade("Teresopolis", estado1);
		Cidade cidade2 = new Cidade("Vitoria", estado2);
		
		Endereco endereco1 = new Endereco("Rua 1 - 123", "Centro", "25000111", cidade1);
		Endereco endereco2 = new Endereco("Rua 2 - 741", "Centro", "32000555", cidade2);
		
		Telefone telefone1 = new Telefone("96328541");
		Telefone telefone2 = new Telefone("85419623");
		
		ArrayList<Telefone> telefones = new ArrayList<Telefone>();
		
		telefones.add(telefone1);
		telefones.add(telefone2);	
		
		Contato contato1 = new Contato("Juliana", endereco1);
		Contato contato2 = new Contato("Rafaela", endereco2);
	
		imprimirContato(contato1);
		imprimirContato(contato2);
	}
	
	public static void imprimirContato(Contato contato) {
		System.out.println("Nome: "+contato.getNome());
		System.out.println("Endereço: "+contato.getEndereco().obterEnderecoCompleto());
		contato.mostraTelefones();
	}

}
