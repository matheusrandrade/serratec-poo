package br.com.serratec.aula4;

public class MainEmpregado {

	public static void main(String[] args) {
		
		Empregado emp1 = new Empregado("Zezinho", "Silva", 1800.00);
		Empregado emp2 = new Empregado("Mariazinha", "Silva", 4200.00);

		System.out.println(String.format("Nome: %s\n Sobrenome: %s\n Salário: %.2f\n", 
											emp1.getNome(), emp1.getSobrenome(), emp1.calcImpostoRenda(emp1.getSalario())));
				
		System.out.println(String.format("Nome: %s\n Sobrenome: %s\n Salário: %.2f\n", 
											emp2.getNome(), emp2.getSobrenome(), emp2.calcImpostoRenda(emp2.getSalario())));

	}
}
