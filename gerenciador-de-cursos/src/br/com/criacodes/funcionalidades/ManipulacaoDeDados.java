package br.com.criacodes.funcionalidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;

public class ManipulacaoDeDados {

	// Método para limpar o console
	public static void limparConsole() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (Exception e) {
			System.out.println("-----------------------------------");
			System.out.println("Erro ao limpar o console: " + e.getMessage());
		}
	}

	// Inicializa um BufferedReader para ler a entrada do teclado,
	// utilizando InputStreamReader para definir o charset UTF-8,
	// garantindo a correta interpretação de caracteres Unicode.
	private static BufferedReader teclado = new BufferedReader(
			new InputStreamReader(System.in, StandardCharsets.UTF_8));
	private static CadastroDeAulas cadAulas = new CadastroDeAulas();
	private static RemocaoDeAulas remAulas = new RemocaoDeAulas();

	// Aqui trabalhamos a lógica por trás da opção selecionada
	public boolean selecionarOpcao() throws NumberFormatException, NullPointerException, NoSuchElementException,
			IndexOutOfBoundsException, IOException {

		// O scanner é tratado dentro do bloco try, também é realizado o tratamento de
		// erros relacionados a entrada de dados pelo teclado.
		new Menu();

		try {

			String opcao = teclado.readLine();

			switch (opcao) {
			case "1":
				limparConsole();
				System.out.printf((cadAulas.cadastrarAula())? "%nRegistro realizado com sucesso!%n":"%nNenhum registro realizado!%n");
				break;
			case "2":
				limparConsole();
				System.out.println((remAulas.removerAula()) ? "Registro removido com sucesso!":"A lista está vazia!");
				break;
			case "3":
				limparConsole();
				ListaDeAulas.ListarAulas();
				break;
			case "4":
				limparConsole();
				System.out.println("-----------------------------------");
				System.out.println("Aplicação encerrada com sucesso!");
				System.out.println("-----------------------------------");
				System.exit(0);
			default:
				limparConsole();
				System.out.println("-----------------------------------");
				System.out.println("Por favor Digite 1, 2, 3 ou 4");
				break;
			}

		} catch (NoSuchElementException e) {
			limparConsole();
			System.out.println("Comando não suportado pela aplicação!");
			return false;
		} catch (NullPointerException e) {
			limparConsole();
			System.out.println("Os campos não podem ser nulos");
		} catch (NumberFormatException e) {
			limparConsole();
			System.out.println("O valor digitado não é um número");
		} catch (IndexOutOfBoundsException e) {
			limparConsole();
			System.out.println("Valor fora do intervalo existente");
		}

		return true;
	}

}