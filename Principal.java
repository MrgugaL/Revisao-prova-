package revisaoProva;

import java.util.Scanner;

public class Principal {
	public static clientevet clientes;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcao;

		Scanner in = new Scanner(System.in);

		do {
			System.out.println("XXXXXXXXXXXXXXXXXXX " + "             "
					+ " xxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println("       Menu do Cliente :          ");
			System.out.println("1- Novo cliente : ");
			System.out
					.println("2- Mostrar os clientes que estão com carros locados ");
			System.out
					.println("3- Alterar o número de carros locados de um determinado cliente");
			System.out.println("0- Sair do pragrama ");
			opcao = in.nextInt();
			switch (opcao) {
			case 1:

				break;

			default:
				break;
			}
		} while (opcao != 0);
	}

	public static void CadrastraCliente() {
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		Cliente Clientes = new Cliente();
		System.out.println("Codigo: ");
		Clientes.setCodigo(in.nextLine());
		System.out.println("Nome:");
		Clinte
		System.out.println("Quantos carros alugados:");
	}
}
