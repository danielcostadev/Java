package br.com.criacodes.funcionalidades;

public class Menu {

	public Menu() {
		
		/* É opcional pensar em uma classe mais genérica que associe um id aos itens do menu para que quando
		 * um item seja adicionado posteriormente automaticamente seja feita uma leitura e adição as condições
		 * isso de forma automática, e a criação de um arquivo exclusivo para resposta com a lógica de cada ação
		 * do menu*/
		System.out.println("-----------------------------------");
		System.out.println("     Gerenciador de Aulas v1.0     ");
		System.out.println("      Por Daniel Costa - 2024      ");
		System.out.println("-----------------------------------");
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("----------MENU---------");
		System.out.println("-----------------------");
		System.out.println("1 - CADASTRAR AULAS----");
		System.out.println("2 - EXCLUIR AULAS------");
		System.out.println("3 - LISTAR AULAS-------");
		System.out.println("4 - ENCERRAR APLICAÇÃO-");
		System.out.print("DIGITE A OPÇÃO DESEJADA: ");

	}
	
	
}