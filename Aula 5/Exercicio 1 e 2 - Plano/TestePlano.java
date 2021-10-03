package Exercicios;

import br.com.serratec.aula4.Funcionario;

public class TestePlano {

	public static void main(String[] args) {
		
		Clinica clinica = new Clinica("Unimed", "Labs", "00.123.456/0001-01");
		 
		Medico medico = new Medico("Hapvida", "Carolina Nogueira", 85296312);
		
		Anestesista anestesista = new Anestesista("Amil", "Felipe Moreira", 96374156, "Geral");
		
		ControlePagamento controle = new ControlePagamento();

		CalcularPagamento(clinica);
		CalcularPagamento(medico);
		CalcularPagamento(anestesista);
		
		controle.calcularTotalPago(clinica);
		controle.calcularTotalPago(medico);
		controle.calcularTotalPago(anestesista);

		System.out.printf("Valor Total: %.2f", controle.getTotalPago());
		
	}
	
	public static void CalcularPagamento(Plano plano) {
		plano.calcularPagamento();
		System.out.println(plano);
	}

}
