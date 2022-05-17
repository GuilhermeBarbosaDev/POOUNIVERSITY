package com.grupo.gestaoAcad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Funcionario> funcionario = new ArrayList<>();
		List<Aluno> aluno = new ArrayList<>();
		List<Processo> processo = new ArrayList<>();
		List<Setor> setores = new ArrayList<>();

		setores.add(new Setor(123, "teste")); // remover depois
		setores.add(new Setor(321, "etste")); // remover depois

		Scanner sc = new Scanner(System.in);
		String nome = " ";
		String email = " ";
		String telefone = " ";
		String cpf = " ";
		String numRegistro = " ";
		String matriculaAluno = " ";
		int autoIncrement = 0;// id do processo
		int numeroMenu = menu(); // retorna opção do menu

		while (numeroMenu != 9) {

			boolean cadOk = false; // variavel para verificar a opção escolhida é valida

			switch (numeroMenu) {

			case 11:// cadastro professor
				System.out.print("Numero de Registro: ");
				numRegistro = sc.nextLine();
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Cargo: ");
				String cargo = sc.nextLine();
				System.out.print("Email: ");
				email = sc.nextLine();
				System.out.print("Telefone: ");
				telefone = sc.nextLine();
				System.out.print("CPF: ");
				cpf = sc.nextLine();
				funcionario.add(new Funcionario(nome, cpf, email, telefone, numRegistro, cargo));
				cadOk = true;
				break;

			case 12: // cadastro aluno
				System.out.print("Matricula: ");
				matriculaAluno = sc.nextLine();
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Curso: ");
				String curso = sc.nextLine();
				System.out.print("Email: ");
				email = sc.nextLine();
				System.out.print("Telefone: ");
				telefone = sc.nextLine();
				System.out.print("CPF: ");
				cpf = sc.nextLine();
				aluno.add(new Aluno(nome, cpf, email, telefone, matriculaAluno, curso));
				cadOk = true;
				break;

			case 21:// Listas de Setores

				for (Setor x : setores) {// mostra setores cadastrados
					System.out.println(x);
				}

				break;

			case 22:// Lista de Processos por Setor

				System.out.println("Digite o codigo do Setor: ");
				int condsetor = sc.nextInt();
				sc.nextLine();// Consumir resto da linha do nextInt
				List<Processo> result = processo.stream().filter(x -> x.getSetorDestino() == condsetor)
						.collect(Collectors.toList());
				if (result == null) {// não funciona
					System.out.println("Codigo de Setor Invalido");
				}
				for (Processo x : result) {
					System.out.println(x);
				}
				break;

			case 30: // Consulta e Modificação de processos
				System.out.print("Numero do Processo: ");
				int numProcesso = sc.nextInt();
				Processo selProcesso = processo.stream().filter(x -> x.getNumero() == numProcesso).findFirst()
						.orElse(null);
				System.out.println(selProcesso);
				System.out.println("1 - Alterar Status do Processo\n" + "2 - Alterar Setor do Processo");
				int altProcesso = sc.nextInt();
				if (altProcesso == 1) {
					System.out.println("1 - Em analise\n" + "2 - Concluido\n");
					int aux = sc.nextInt();
					sc.nextLine();// Consumir resto da linha do nextInt
					if (aux == 1) {
						// necessario status em classe processo
						// selProcesso.setStatus(Em analise)???
					} else if (aux == 2) {
						// necessario status em classe processo
						// selProcesso.setStatus(Em analise)???
					}
				}else if (altProcesso == 2) {
					System.out.print("Digite o Codigo do Setor: ");
					int aux = sc.nextInt();
					sc.nextLine();// Consumir resto da linha do nextInt
					selProcesso.setSetorDestino(aux);
				}

				break;
			case 404: // remover depois, usado para verificar armzenamento dos arrayslists
				for (Funcionario x : funcionario) {
					System.out.println(x);
				}
				for (Aluno x : aluno) {
					System.out.println(x);
				}
				for (Processo x : processo) {
					System.out.println(x);
				}
				break;
			default:
				System.out.println("Digite uma opção valida");
			}
			if (cadOk == true) { // caso opção seja valida, após cadastro, realizar o cadastro do processo

				int numProcesso = autoIncrement;
				System.out.print("Qual eh a Finalidade do Processo? ");
				String finalidade = sc.nextLine();
				System.out.println("Descricao do Processo: ");
				String descricao = sc.nextLine();
				System.out.println("Lista de setores:\n");
				for (Setor x : setores) {// mostra setores cadastrados
					System.out.println(x);
				}
				System.out.print("Digite o codigo do setor destino: ");
				int setorDestino = sc.nextInt();

				sc.nextLine();// Consumir resto da linha do nextInt

				processo.add(new Processo(numProcesso, finalidade, descricao, setorDestino));

				autoIncrement++; // incrementa 1 a cada processo realizado

			}

			numeroMenu = menu();
		}
		sc.close();
	}

	public static int menu() {

		Scanner sc = new Scanner(System.in);

		int retornoMenu = 0;
		int numeroCad = 0;
		System.out.println("Opções\n " + "1 - Cadastrar Processo\n " + "2 - Verificar lista de Setores e Processos\n"
				+ "3 - Consultar e Modificar processos\n" + " 9 - Sair");
		int numeroMenu = sc.nextInt();
		if (numeroMenu == 1) {
			System.out.println("1 - Sou Professor\n" + "2 - Sou aluno\n" + "9 - Sair");

			numeroCad = sc.nextInt();
			if (numeroCad == 1) {
				retornoMenu = 11;
			} else if (numeroCad == 2) {
				retornoMenu = 12;
			}
		} else if (numeroMenu == 2) {
			System.out.println("1 - Exibir Lista de Setores\n" + "2 - Consultar Lista de processo do Setor\n");
			int selecOpcoes = sc.nextInt();
			if (selecOpcoes == 1) {
				retornoMenu = 21;
			} else if (selecOpcoes == 2) {
				retornoMenu = 22;
			}
		} else if (numeroMenu == 9) {
			retornoMenu = 9;
		} else if (numeroMenu == 3) {
			retornoMenu = 30;
		}else if (numeroMenu == 404) {
			retornoMenu = 404;
		}
		return retornoMenu;
	}
}