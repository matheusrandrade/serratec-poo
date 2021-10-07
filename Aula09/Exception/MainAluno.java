package br.com.serratec.aula9;

import java.util.List;
import java.util.ArrayList;


public class MainAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Pedro", 7.0, 10.0);
		Aluno aluno2 = new Aluno("Lucas", 10.0, 9.0);
		Aluno aluno3 = new Aluno("Vitor", 6.7, 8.5); //("Vitor", 16.7, 8.5); - Exceção - Valor ultrapassa o limite permitido - Execução Suspensa.
		
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		listaAlunos.add(aluno1);
		listaAlunos.add(aluno2);
		listaAlunos.add(aluno3);
		
		try {
			
			double[] listaMedias = new double[] {

			aluno1.calcularMedia(aluno1.getNota1(), aluno1.getNota2()),
			aluno2.calcularMedia(aluno2.getNota1(), aluno2.getNota2()),
			aluno3.calcularMedia(aluno3.getNota1(), aluno3.getNota2())
			
			};
			for(int i = 0; i < listaAlunos.size(); i++) {
				System.out.println(listaAlunos.get(i)+" - Média: "+listaMedias[i]);

			}
			
		} catch (AlunoException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
