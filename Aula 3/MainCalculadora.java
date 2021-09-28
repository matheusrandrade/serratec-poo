package br.com.serratec.aula3;
import java.util.Scanner;
public class MainCalculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		int opcao = 0;
		
		do {
			System.out.println("Digite opção de cálculo: ");
			System.out.println("(1) Soma");
			System.out.println("(2) Subtração");
			System.out.println("(3) Divisão");
			System.out.println("(4) Multiplicação");
			System.out.println("(5) Sair");
			
			opcao = leia.nextInt();
			
			System.out.println("Digite um número: ");
			double num1 = leia.nextDouble();
			System.out.println("Digite outro número: ");
			double num2 = leia.nextDouble();	
		
			if (opcao!=5) {
				switch(opcao) {
				case 1: calc.soma(num1, num2); break;
				case 2: calc.sub(num1, num2); break;
				case 3: calc.div(num1, num2); break;
				case 4: calc.mult(num1, num2); break;
				default: System.out.print("Opção Inválida"); break;
				}
			}
		} while(opcao<=5);
	}
}