package br.com.criacodes.funcionalidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import br.com.criacodes.classes.Aula;

public class CadastroDeAulas {

	// Inicializa um BufferedReader para ler a entrada do teclado,
	// utilizando InputStreamReader para definir o charset UTF-8,
	// garantindo a correta interpretação de caracteres Unicode.
	private static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

	public void cadastrarAula() throws IOException {

		System.out.println("-----------------------------------");
		System.out.print("Quantas aulas você deseja adicionar? ");

		// Primeiro recebemos o inteiro como String
		String qtd = teclado.readLine();

		// Depois convertemos para Int, isso previne bugs em tempo de execução.
		int quantidade = Integer.parseInt(qtd);

		for (int i = 0; i < quantidade; i++) {

			// variavel de controle do laço do whilhe abaixo, caso o usuárião não digite um
			// número o valor permance falso, e caso o usuário digite um número o valor muda
			// para true
			// e atende aos critérios para encerrar o laço
			boolean addAula = false;

			do {

				try {

					System.out.println("-----------------------------------");
					System.out.print("Digite o titulo da Aula: ");
					String tituloDaAula = teclado.readLine();
					System.out.print("Digite a duração da Aula: ");
					String duracao = teclado.readLine();

					// Tratamento para evitar que sejam passados valores vazios
					if (tituloDaAula.equals("") || duracao.equals("")) {
						System.out.println("-----------------------------------");
						System.out.println("Os campos não podem ser vazios");

					} else {

						// Primeiro recebo o inteiro como String e depois convertemos para Int, isso
						// previne bugs em tempo de execução. O bloco try é para tratar o
						// NumberFormatException caso o usuário não digite um número
						try {

							// Essa linha recebe pega o String e converte em Inteiro
							int duracaoDaAula = Integer.parseInt(duracao);

							// Aqui criamos uma nova referência do objeto Aula
							Aula a = new Aula(tituloDaAula, duracaoDaAula);

							// Adiciona nova aula a lista
							ListaDeAulas.aulas.add(a);

							// como o objetivo de adicionar uma aula a lista foi atingido a variável de
							// controle recebe "true"
							addAula = true;

						} catch (NumberFormatException e) {
							System.out.println("-----------------------------------");
							System.out.println("O valor digitado não é um número");
						}
					}

				} catch (NullPointerException e) {
					System.out.println("-----------------------------------");
					System.out.println("Os campos não podem ser nulos");
				}
			} while (addAula == false);

		}

	}
}
