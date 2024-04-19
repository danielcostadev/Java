package br.com.criacodes.testes;

import java.util.ArrayList;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais sobre listas";
		String aula2 = "Modelando a classe aula"; 
		String aula3 = "Trabalhando com Cursos e Sets";
		
		
		List<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		aulas.forEach(aula -> System.out.printf("Aula: %s%n", aula));
		
		
	}

}
