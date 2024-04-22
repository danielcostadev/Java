package br.com.criacodes.testes;

import java.io.IOException;
import java.util.NoSuchElementException;

import br.com.criacodes.funcionalidades.ManipulacaoDeDados;

public class Main {

	private static ManipulacaoDeDados manipulacao = new ManipulacaoDeDados();

	public static void main(String[] args) throws NumberFormatException, NullPointerException, NoSuchElementException, IndexOutOfBoundsException, IOException {

		do {
			manipulacao.selecionarOpcao();
		} while (manipulacao.selecionarOpcao());
	}
}
