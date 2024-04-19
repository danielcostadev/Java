package br.com.criacodes.classes;

public class Aula implements Comparable<Aula> {

	private String nome;
	private int duracao;

	public Aula(String nome, int duracao) throws NullPointerException {

		try {

			this.nome = nome;
			this.duracao = duracao;

		} catch (NullPointerException e) {
			System.out.println("Os campos não podem ser nulos");
		}

	}

	public String getNome() {
		return nome;
	}

	public int getDuracao() {
		return duracao;
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.nome.compareTo(outraAula.nome);
	}

}
