package com.grupo.gestaoAcad;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	static Sistema sistema = new Sistema();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		sistema.adicionaSetor(new Setor(123, "teste")); // remover depois
		sistema.adicionaSetor(new Setor(321, "etste")); // remover depois
		
			menu();
			
		sc.close();
	}
	public static void menu() {

		int numeroCad = 0;
		System.out.println("Opcoes\n " + "1 - Cadastrar Processo\n " + "2 - Verificar lista de Setores e Processos\n"
				+ " 3 - Consultar e Modificar processos\n" + " 9 - Sair");
		int numeroMenu = sc.nextInt();
		if (numeroMenu == 1) {
			System.out.println("1 - Sou Professor\n" + "2 - Sou aluno\n" + "9 - Sair");
			numeroCad = sc.nextInt();
			if (numeroCad == 1) {// Cadastro professor
				System.out.println("\n1 - Realizar Cadastro\n" + "2 - Tenho Cadastro\n" + "9 - Sair");
				int opcaocad = sc.nextInt();
				sc.nextLine();// Consumir resto da linha do nextInt
				if (opcaocad == 1) {
					cadastroprof();
				} else if (opcaocad == 2) {
					checkprof();
				}

			} else if (numeroCad == 2) {// Cadastro aluno
				System.out.println("\n1 - Realizar Cadastro\n" + "2 - Tenho Cadastro\n" + "9 - Sair");
				int opcaocad = sc.nextInt();
				sc.nextLine();// Consumir resto da linha do nextInt
				if (opcaocad == 1) {
					cadastroaluno();
				} else if (opcaocad == 2) {
					checkaluno();
				}
			} else if (numeroCad == 9) {
				return;
			}
		} else if (numeroMenu == 2) {
			System.out.println(
					"1 - Exibir Lista de Setores\n" + "2 - Consultar Lista de processo do Setor\n" + "9 - Sair\n");
			int selecOpcoes = sc.nextInt();
			sc.nextLine();// Consumir resto da linha do nextInt
			if (selecOpcoes == 1) {
				for (Setor x : sistema.getListSetores()) {// mostra setores cadastrados
					System.out.println(x);
				}
				menu();
			} else if (selecOpcoes == 2) {
				processosetor();
			} else if (selecOpcoes == 9) {
				menu();
			}
		}else if (numeroMenu == 3) {
			consprocesso();
		} else if (numeroMenu == 9) {
			return;
		} else if (numeroMenu == 404) {// testar
			teste();
		} else {
			System.out.println("Digite uma Opcao valida");
			menu();
		}

	}

	public static void processo() {
		
			////// NOVO PROCESSO/////
			int numProcesso = sistema.getListProcessos().size();
			System.out.print("Qual a Finalidade do Processo? ");
			String finalidade = sc.nextLine();
			System.out.println("Descricao do Processo: ");
			String descricao = sc.nextLine();
			System.out.println("Lista de setores:\n");
			for (Setor x : sistema.getListSetores()) {// mostra setores cadastrados
				System.out.println(x);
			}
			System.out.print("Digite o codigo do setor destino: ");
			int setorDestino = sc.nextInt();
			sistema.adicionaProcesso(new Processo(numProcesso, finalidade, descricao, setorDestino));
			System.out.println("Processo cadastrado com sucesso\n");
			
		sc.nextLine();// Consumir resto da linha do nextInt
		menu();
	}
	public static void consprocesso() {
		
			//////// CONSULTA E MODIFICACAO DE PROCESSOS///////////////////////////
			System.out.print("Numero do Processo: ");
			int numProc = sc.nextInt();
			Processo selProcesso = sistema.getListProcessos().stream().filter(x -> x.getNumero() == numProc).findFirst()
					.orElse(null);
			if(selProcesso == null) {
				System.out.println("Processo não encontrado");
			}else {
				System.out.println(selProcesso);
			System.out.println("1 - Alterar Status do Processo\n" + "2 - Alterar Setor do Processo\n" + "9 - Sair");
			int altProcesso = sc.nextInt();
			if (altProcesso == 1) {
				System.out.println("1 - Em analise\n" + "2 - Concluido\n");
				int aux = sc.nextInt();
				if (aux == 1) {
					selProcesso.setStatus(false);
				} else if (aux == 2) {
					selProcesso.setStatus(true);
				}
			} else if (altProcesso == 2) {
				System.out.print("Digite o Codigo do Setor: ");
				int aux = sc.nextInt();
				selProcesso.setSetorDestino(aux);
			}else if (altProcesso == 9) {
				menu();
			}
		}
		sc.nextLine();// Consumir resto da linha do nextInt
		menu();
	}
	public static void cadastroprof() {
		String nome = " ";
		String email = " ";
		String telefone = " ";
		String cpf = " ";
		String numRegistro = " ";
		
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
			sistema.adicionaFuncionario(new Funcionario(nome, cpf, email, telefone, numRegistro, cargo));
			// passar os dados do solicitante para o processo
			processo();
		sc.nextLine();// Consumir resto da linha do nextInt
		menu();
	}
	public static void cadastroaluno() {
		String nome = " ";
		String email = " ";
		String telefone = " ";
		String cpf = " ";
		String matriculaAluno = " ";

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
			sistema.adicionaAluno(new Aluno(nome, cpf, email, telefone, matriculaAluno, curso));
			// passar os dados do solicitante para o processo
			processo();
		
		sc.nextLine();// Consumir resto da linha do nextInt
		menu();
	}
	public static void checkprof() {
		// verifica se o professor esta cadastrado
		String checkCpf = "";

			System.out.print("Numero de Registro: ");
			String numReg = sc.nextLine();
			System.out.print("Digite o CPF cadastrado: ");
			checkCpf = sc.nextLine();
			Funcionario selFun = sistema.getListFuncionarios().stream()
					.filter(x -> numReg.equals(x.getNumeroRegistro())).findFirst().orElse(null);
			if (selFun != null && checkCpf.equals(selFun.getCpf())) {
				// enviar selFun como parametro
				processo();
			} else {
				System.out.println("Numero de Registro e/ou CPF incorreto ou nao cadastrado");
			}
			
		menu();
	}
	public static void checkaluno() {
		// verifica se o aluno esta cadastrado
		String checkCpf = "";
		
			System.out.print("Numero da Matricula: ");
			String numMat = sc.nextLine();
			System.out.print("Digite o CPF cadastrado: ");
			checkCpf = sc.nextLine();
			Aluno selAluno = sistema.getListAlunos().stream().filter(x -> numMat.equals(x.getMatricula())).findFirst()
					.orElse(null);
			if (selAluno != null && checkCpf.equals(selAluno.getCpf())) {
				// enviar selFun como parametro
				processo();
			} else {
				System.out.println("Numero de Registro e/ou CPF incorreto ou nao cadastrado");
			}
		
		menu();
	}
	public static void processosetor() {

			///////// LISTA DE PROCESSO POR SETOR///////////
			System.out.println("Digite o codigo do Setor: ");
			int condsetor = sc.nextInt();
			sc.nextLine();// Consumir resto da linha do nextInt
			List<Processo> result = sistema.getListProcessos().stream().filter(x -> x.getSetorDestino() == condsetor)
					.collect(Collectors.toList());
			if (result == null) {// nao funciona
				System.out.println("Codigo de Setor Invalido");
			} else {
				for (Processo x : result) {
					System.out.println(x);
				}
			}
		
		menu();
	}
	public static void teste() {
		// remover depois, usado para verificar armzenamento dos arrayslists
		for (Funcionario x : sistema.getListFuncionarios()) {
			System.out.println(x);
		}
		for (Aluno x : sistema.getListAlunos()) {
			System.out.println(x);
		}
		for (Processo x : sistema.getListProcessos()) {
			System.out.println(x);
		}
		for (Setor x : sistema.getListSetores()) {// mostra setores cadastrados
			System.out.println(x);
		}
		menu();
	}

}