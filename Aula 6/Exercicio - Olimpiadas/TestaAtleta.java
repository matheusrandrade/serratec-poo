package Exercicio;

public class TestaAtleta {

	public static void main(String[] args) {
		Pais pais1 = new Pais("Brasil");
		Pais pais2 = new Pais("EUA");
		
		Atleta atleta1 = new Atleta("Daniel Cargnin", 70.0, pais1);
		Atleta atleta2 = new Atleta("Michael Phelps", 58.0, pais2);
		Atleta atleta3 = new Atleta("Rayssa Silva", 70.0, pais1);
		
		atleta1.verificaSituacao();
		atleta2.verificaSituacao();
		atleta3.verificaSituacao();
		
		System.out.println(atleta1);
		System.out.println(atleta2);
		System.out.println(atleta3);

	}

}
