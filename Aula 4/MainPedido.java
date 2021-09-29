package br.com.serratec.aula4;

import java.time.LocalDate;

import br.com.serratec.aula3.Medico;

public class MainPedido {

	public static void main(String[] args) {

		Pedido pedido1 = new Pedido(0001, LocalDate.now(), 2, 15, 30);
		Pedido pedido2 = new Pedido(0002, LocalDate.of(2021, 10, 3), 4, 8, 36);
		Pedido pedido3 = new Pedido(0003, LocalDate.now(), 6, 3, 18);
		
		pedido1.finalizarPedido();
		pedido2.finalizarPedido();
		
		
		// %tF format date with “%tY-%tm-%td“.
		System.out.println(String.format("Codigo: %d\n Data: %tF\n Quantidade: %.2f\n Preço: %.2f\n Total: %.2f\n", 
				pedido1.getNumero(), pedido1.getDataPedido(), pedido1.getQuantidade(), pedido1.getValor(), pedido1.getTotal()));
		System.out.println(String.format("Codigo: %d\n Data: %tF\n Quantidade: %.2f\n Preço: %.2f\n Total: %.2f\n", 
				pedido2.getNumero(), pedido2.getDataPedido(), pedido2.getQuantidade(), pedido2.getValor(), pedido2.getTotal()));
		System.out.println(String.format("Codigo: %d\n Data: %tF\n Quantidade: %.2f\n Preço: %.2f\n Total: %.2f\n", 
				pedido3.getNumero(), pedido3.getDataPedido(), pedido3.getQuantidade(), pedido3.getValor(), pedido3.getTotal()));
		
	
		System.out.println("Total de Pedidos: "+Pedido.TotalDePedidos);

	}

}
