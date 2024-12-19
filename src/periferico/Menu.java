package periferico;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import periferico.controller.PerifericoController;
import periferico.model.PerifericoTeclado;
import periferico.util.Colors;

public class Menu {

	public static void main(String[] args) {
		PerifericoController periferico = new PerifericoController();
		Scanner leia = new Scanner(System.in);

		int opcao, idproduto, tipo, estoque, numero;
		String nomeproduto, marcaproduto, rgbteclado, construcaoteclado;
		float preco;

		// LISTA DE PRODUTOS COMENTADA PARA FACILIDADE

		/*
		 * Perifericos de TESTE PerifericoTeclado teclado1 = new
		 * PerifericoTeclado(periferico.criarNumero(), 1, "80HE", "Woothing", 2000.00F,
		 * 5, "SIM", "SIM"); periferico.adicionarPeriferico(teclado1);
		 * 
		 * PerifericoTeclado teclado2 = new PerifericoTeclado(periferico.criarNumero(),
		 * 1, "G715 TKL", "Logitech", 800.00F, 5, "SIM", "SIM");
		 * periferico.adicionarPeriferico(teclado2);
		 * 
		 * PerifericoTeclado teclado3 = new PerifericoTeclado(periferico.criarNumero(),
		 * 1, "Alloy Origins", "HyperX", 499.00F, 5, "SIM", "SIM");
		 * periferico.adicionarPeriferico(teclado3);
		 * 
		 * PerifericoTeclado teclado4 = new PerifericoTeclado(periferico.criarNumero(),
		 * 1, "Alloy Core", "HyperX", 279.00F, 5, "NÃO", "SIM");
		 * periferico.adicionarPeriferico(teclado4);
		 */

		while (true) {
			System.out.println(Colors.TEXT_BLACK_BOLD + Colors.ANSI_RED_BACKGROUND);
			System.out.println("------------------------------------------");
			System.out.println("|        ------------------------        |");
			System.out.println("|        |    SKILL EFIGÊNIA    |        |");
			System.out.println("|        ------------------------        |");
			System.out.println("|----------------------------------------|");
			System.out.println("|----------------------------------------|");
			System.out.println("|                 |MENU|                 |");
			System.out.println("|                                        |");
			System.out.println("|   1 - Adicione um periférico           |");
			System.out.println("|   2 - Liste todos os periféricos       |");
			System.out.println("|   3 - Encontre um periferico pelo ID   |");
			System.out.println("|   4 - Atualize um periférico           |");
			System.out.println("|   5 - Delete um periférico             |");
			System.out.println("|                                        |");
			System.out.println("|   0 - Sair do programa                 |");
			System.out.println("|                                        |");
			System.out.println("|----------------------------------------|");
			System.out.println("|Digite a opção escolhida:               |");
			System.out.println("                                          ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite um valor inteiro!");
				leia.nextLine();
				opcao = 10;
				keyPress();
			}

			if (opcao == 0) {
				System.out.println(Colors.TEXT_BLACK_BOLD + Colors.ANSI_BLUE_BACKGROUND
						+ "\nObrigado por escolher a Skill Efigênia!\nVocê saiu mais skillado do que quando entrou!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Colors.TEXT_BLACK_BOLD + Colors.ANSI_BLUE_BACKGROUND + "Adicione um periférico\n");

				System.out.println("Digite a marca do periferico:");
				marcaproduto = leia.next();

				do {
					System.out.println("Digite o código do tipo do produto: ");
					tipo = leia.nextInt();
				} while (tipo != 1);

				System.out.println("Digite o nome do periférico");
				leia.skip("\\R?");
				nomeproduto = leia.nextLine();

				System.out.println("Digite o preço do produto (R$):");
				preco = leia.nextInt();

				System.out.println("Digite a quantidade disponível no estoque:");
				estoque = leia.nextInt();

				switch (tipo) {
				case 1 -> {
					System.out.println("O teclado é mecânico? (SIM/NÃO): ");
					construcaoteclado = leia.next();

					System.out.println("O teclado possui RGB? (SIM/NÃO): ");
					rgbteclado = leia.next();
					periferico.adicionarPeriferico(new PerifericoTeclado(periferico.criarNumero(), tipo, marcaproduto, nomeproduto, preco, estoque, construcaoteclado, construcaoteclado));
				}

				}

				keyPress();
				break;
			case 2:
				System.out.println(Colors.TEXT_BLACK_BOLD + Colors.ANSI_BLUE_BACKGROUND + "Liste todos os periféricos\n");

				periferico.listarPerifericos();

				keyPress();
				break;
			case 3:
				System.out.println(
						Colors.TEXT_BLACK_BOLD + Colors.ANSI_BLUE_BACKGROUND + "Encontre um periferico pelo ID\n");
				System.out.println("Entre com o ID do periférico");
				idproduto = leia.nextInt();

				periferico.encontrarPorID(idproduto);

				keyPress();
				break;
			case 4:
				System.out.println(Colors.TEXT_BLACK_BOLD + Colors.ANSI_BLUE_BACKGROUND + "Atualização de dados dos periféricos\n");

				System.out.println("Digite o ID do produto");
				numero = leia.nextInt();

				var procuraColecao = periferico.procurarNaCollection(numero);

				if (procuraColecao != null) {
					tipo = procuraColecao.getTipo();
					System.out.println("Digite o nome do periférico");
					leia.skip("\\R?");
					nomeproduto = leia.nextLine();

					do {
						System.out.println("Digite o código do tipo do produto: ");
						tipo = leia.nextInt();
					} while (tipo != 1);

					System.out.println("Digite a marca do periferico:");
					marcaproduto = leia.next();

					System.out.println("Digite o preço do produto (R$):");
					preco = leia.nextInt();

					System.out.println("Digite a quantidade disponível no estoque:");
					estoque = leia.nextInt();

					switch (tipo) {
					case 1 -> {
						System.out.println("O teclado é mecânico? (SIM/NÃO): ");
						construcaoteclado = leia.next();

						System.out.println("O teclado possui RGB? (SIM/NÃO): ");
						rgbteclado = leia.next();
						periferico.atualizarPeriferico(new PerifericoTeclado(numero, tipo, marcaproduto, nomeproduto,preco, estoque, construcaoteclado, rgbteclado));
					}

					}

				}

				keyPress();
				break;
			case 5:
				System.out.println(Colors.TEXT_BLACK_BOLD + Colors.ANSI_BLUE_BACKGROUND + "Delete um periférico\n");

				System.out.println("Digite o ID do produto que deseja deletar");
				numero = leia.nextInt();

				periferico.removerPeriferico(numero);
				keyPress();
				break;

			default:
				System.out.println(Colors.TEXT_BLUE_BOLD + Colors.ANSI_YELLOW_BACKGROUND + "\nInvalid Option!\n");
				break;

			}
		}

	}

	// Método para acrescentar a espera da resposta do usuario
	public static void keyPress() {
		try {
			System.out.println(Colors.TEXT_RESET + "\n\n Pressione Enter para continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferenter de Enter!");

		}
	}

}
