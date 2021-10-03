package br.com.serratec.aula4;

public class MainFuncionario {

	public static void main(String[] args) {
		
		Gerente func1 = new Gerente("José Silva", 1800.00, "Senior");
		
		Assistente func2 = new Assistente("Maria Silva", 4000.00, 200.00);
		
		CalcularBonificacao(func1);
		CalcularBonificacao(func2);
	}
	
	public static void CalcularBonificacao(Funcionario funcionario) {
		funcionario.calcParticipacaoSalario();
		System.out.println(funcionario);
	}
	
}
