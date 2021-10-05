package br.com.serratec.aula9;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario[] array = new Funcionario[2];
				
		array[0] = new Funcionario("José Moura", "Gerente", 2000.00);
		array[1] = new Funcionario("Juliana Moreira", "Chefe Departamento", 4000.00);
		
		for (Funcionario i : array) {
			i.abonoSalario(1000.00);
			System.out.println(i);
		}

	}

}
