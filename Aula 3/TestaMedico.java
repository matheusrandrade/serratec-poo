package br.com.serratec.aula3;

public class TestaMedico {

	public static void main(String[] args) {
		Medico medico1 = new Medico(12345, "Ana Maria", 0, 250);
		Medico medico2 = new Medico(456789, "Antônio", 0, 300);

		
		medico1.pagDinheiro();
		medico2.pagDinheiro();
		
		medico1.pagPlano();
		medico2.pagPlano();
		
		System.out.printf(String.format("Medico - CRM: %d\n Nome: %s\n Salario: %.2f\n Consulta: %f\n",
				medico1.getCrm(),medico1.getNome(), medico1.getSalario(), medico1.getConsulta()));
		System.out.printf(String.format("Medico - CRM: %d\n Nome: %s\n Salario: %.2f\n Consulta: %f\n",
				medico2.getCrm(),medico2.getNome(), medico2.getSalario(), medico2.getConsulta()));
		
		
		System.out.println("Número de Médicos: "+Medico.TotalDeMedicos);
	}
	

}
