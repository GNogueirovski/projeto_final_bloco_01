package periferico;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import periferico.util.Colors;

public class Menu {

	public static void main(String[] args) {

		int opcao;
		Scanner leia = new Scanner(System.in);

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

			try{
			opcao = leia.nextInt();
			}catch (InputMismatchException e) {
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
				keyPress();
				break;
			case 2:
				System.out.println(Colors.TEXT_BLACK_BOLD + Colors.ANSI_BLUE_BACKGROUND + "Liste todos os periféricos\n");
				keyPress();
				break;
			case 3:
				System.out.println(Colors.TEXT_BLACK_BOLD + Colors.ANSI_BLUE_BACKGROUND + "Encontre um periferico pelo ID\n");
				keyPress();
				break;
			case 4:
				System.out.println(Colors.TEXT_BLACK_BOLD + Colors.ANSI_BLUE_BACKGROUND + "Atualização de dados dos periféricos\n");
				keyPress();
				break;
			case 5:
				System.out.println(Colors.TEXT_BLACK_BOLD + Colors.ANSI_BLUE_BACKGROUND + "Delete um periférico\n");
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
