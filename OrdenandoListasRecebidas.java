import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenandoListasRecebidas {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		try (Scanner input = new Scanner(System.in)) {
			String escolha;
			do {
				System.out.println("======================================");
				System.out.print("Digite 1 para ADICIONAR ou 2 para SAIR: ");
				escolha = input.nextLine();
				switch (escolha) {
				case "1":
					System.out.println("======================================");
					System.out.print("Digite apenas o primeiro nome: ");
					String nomeDigitado = input.nextLine();
					nomes.add(nomeDigitado);
					break;
					
				case "2":
					if (!nomes.isEmpty()) {
						System.out.println("======================================");
						System.out.println("Obrigado por usar nosso sistema!");
						Collections.sort(nomes);
						nomes.forEach(nome -> System.out.printf("Nome: %s%n", nome));
					} else {
						System.out.println("======================================");
						System.out.println("Obrigado por usar nosso sistema!");
						System.out.println("Nenhum nome foi adicionado a lista!");
					}
					break;

				default:
					System.out.println("Escolha incorreta!");
				}

			} while (!escolha.equals("2"));
		}
	}
}
