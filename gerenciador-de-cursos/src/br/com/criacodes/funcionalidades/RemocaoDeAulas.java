package br.com.criacodes.funcionalidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class RemocaoDeAulas {

	// Inicializa um BufferedReader para ler a entrada do teclado, 
	// utilizando InputStreamReader para definir o charset UTF-8, 
	// garantindo a correta interpretação de caracteres Unicode.
	private static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

	public boolean removerAula() throws IOException {
		
		if(ListaDeAulas.aulas.isEmpty()) {
			
			return false;
			
		}else {
			
			ListaDeAulas.ListarAulas();
			
			System.out.println("--------------------------------------");
			System.out.print("Digite o ID da aula que deseja remover: ");
			
			// Primeiro recebo o inteiro como String
			String id = teclado.readLine();
			
			// Depois convertemos para Int, isso previne bugs em tempo de execução.
			int aulaId = Integer.parseInt(id);
			
			// Removemos a aula da lista
			ListaDeAulas.aulas.remove(aulaId-1);
			
			// Limpa o console e retorna true
			ManipulacaoDeDados.limparConsole();
			return true;
		}
	}
}
