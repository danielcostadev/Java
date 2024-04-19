package br.com.criacodes.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.criacodes.classes.Aula;

public class TesteListaAulas2 {

	public static void main(String[] args) throws NumberFormatException, NullPointerException {

		// É criado uma lista de Aulas
		List<Aula> aulas = new ArrayList<>();

		// O scanner é tratado dentro do bloco try, para que o java realize o fechamento
		// automaticamente
		try (Scanner teclado = new Scanner(System.in)) {
			// A variável resposta é declarada antes do laço do, para que possa ser
			// utilizado dentro e fora do bloco
			String resposta;
			do {
				System.out.println("----------------------------------");
				System.out.print("+ Gostaria de Cadastrar uma aula? ");
				resposta = teclado.nextLine();

				switch (resposta) {
				case "S":
				case "s":

					// variavel de controle do laço do whilhe abaixo, caso o usuárião não digite um
					// número o valor permance falso, e caso o usuário digite um número o valor muda
					// para true
					// e atende aos critérios para encerrar o laço
					boolean addAula = false;

					do {
						// Tratamento para evitar que sejam passados valores nulos
						try {

							System.out.println("=======================");
							System.out.print("Digite o titulo da Aula: ");
							String tituloDaAula = teclado.nextLine();
							System.out.print("Digite a duração da Aula: ");
							String duracao = teclado.nextLine();

							// Tratamento para evitar que sejam passados valores vazios
							if (tituloDaAula.equals("") || duracao.equals("")) {

								System.out.println("Os campos não podem ser vazios");

							} else {

								// Primeiro recebo o inteiro como String e depois convertemos para Int, isso
								// previne bugs em tempo de execução
								// O try é para tratar o NumberFormatException caso o usuário não digiite um
								// número
								try {
									// Essa linha recebe pega o String e converte em Inteiro
									int duracaoDaAula = Integer.parseInt(duracao);

									// Aqui criamos uma nova referência do objeto Aula
									Aula a = new Aula(tituloDaAula, duracaoDaAula);
									// Adiciona nova aula a lista
									aulas.add(a);
									// como o objetivo de adicionar uma aula a lista foi atingido a variável de
									// controle recebe "true"

									addAula = true;

								} catch (NumberFormatException e) {
									System.out.println("O valor digitado não é um número");
								}

							}

						} catch (NullPointerException e) {

							System.out.println("Os campos não podem ser nulos");

						}

					} while (addAula == false);

					break;
				case "N":
				case "n":
					// verifica se alguma aula foi adicinada a lista
					if (!aulas.isEmpty()) {

						System.out.println("----------------------------------");
						System.out.println("Obrigado por usar nosso sistema! Até Breve!");

						// Lambda para exibir a lista de aulas cadastradas
						System.out.println("----------------------------------");
						System.out.println("LISTA DE AULAS CADASTRADAS");
						Collections.sort(aulas);
						aulas.forEach(aula -> System.out.printf("=======================%nAula: %s%nDuração: %dmin%n",
								aula.getNome(), aula.getDuracao()));
					} else {
						System.out.println("----------------------------------");
						System.out.println("Que pena. Nenhuma aula foi adicionada a lista!");
					}
					break;
				default:
					System.out.println("Por favor Digite [S] ou [N]!");
				}

			} while (resposta.equals("s") || resposta.contains("S"));

		}

	}

}
