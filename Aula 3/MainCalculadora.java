package br.com.serratec.aula3;
import java.util.Scanner;
public class MainCalculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		int opcao = 0;
		
		do {
			System.out.println("Digite op��o de c�lculo: ");
			System.out.println("(1) Soma");
			System.out.println("(2) Subtra��o");
			System.out.println("(3) Divis�o");
			System.out.println("(4) Multiplica��o");
			System.out.println("(5) Sair");
			
			opcao = leia.nextInt();
			
			System.out.println("Digite um n�mero: ");
			double num1 = leia.nextDouble();
			System.out.println("Digite outro n�mero: ");
			double num2 = leia.nextDouble();	
		
			if (opcao!=5) {
				switch(opcao) {
				case 1: calc.soma(num1, num2); break;
				case 2: calc.sub(num1, num2); break;
				case 3: calc.div(num1, num2); break;
				case 4: calc.mult(num1, num2); break;
				default: System.out.print("Op��o Inv�lida"); break;
				}
			}
		} while(opcao<=5);
	}
}