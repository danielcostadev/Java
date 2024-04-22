package br.com.criacodes.classes;

public class Aula implements Comparable<Aula> {
	
	private static int proximoId = 1;

	private int id;
	private String nome;
	private int duracao;

	public Aula(String nome, int duracao) throws NullPointerException {

		try {
			this.id = proximoId++;
			this.nome = nome;
			this.duracao = duracao;

		} catch (NullPointerException e) {
			System.out.println("Os campos não podem ser nulos");
		}

	}

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public int getDuracao() {
		return this.duracao;
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.nome.compareTo(outraAula.nome);
	}

}
