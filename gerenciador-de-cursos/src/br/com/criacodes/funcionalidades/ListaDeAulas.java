package br.com.criacodes.funcionalidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.criacodes.classes.Aula;

public class ListaDeAulas {

	protected static List<Aula> aulas = new ArrayList<>();
	
	public static void ListarAulas() {
		// verifica se alguma aula foi adicinada a lista
		if (!aulas.isEmpty()) {
			
			// Lambda para exibir a lista de aulas cadastradas
			System.out.println("----------------------------------");
			System.out.println("LISTA DE AULAS CADASTRADAS");
			Collections.sort(aulas);
			aulas.forEach(aula -> System.out.printf("=======================%nID: %d%nAula: %s%nDuração: %dmin%n",
					aula.getId(), aula.getNome(), aula.getDuracao()));
		} else {
			System.out.println("----------------------------------------------");
			System.out.println("Que pena. Nenhuma aula foi adicionada a lista!");
			System.out.println("----------------------------------------------");
		}
	}
}
