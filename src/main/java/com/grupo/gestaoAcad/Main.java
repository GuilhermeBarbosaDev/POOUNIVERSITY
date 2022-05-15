package com.grupo.gestaoAcad;

import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	

	
	
	public static void main(String[] args) {

		
		InputStreamReader professor = new InputStreamReader(System.in);
		Funcionario fprofessor = new Funcionario();
		
		String nome = "";
		String cpf = "";
		String email = "";
		String telefone = "";
		String cargo = "";
		
		System.out.println(
				"Opções\n 1- Cadastrar aluno\n 2-Cadastrar Professor\n"
				);
		int numeroCad = 0;
		
		switch (numeroCad) {
		
		case 1:
			System.out.print("Nome do Funcionario: ");
			fprofessor.setNome(nome);
			
			System.out.print("Nome do cargo: ");
			fprofessor.setCargo(cargo);
			
			System.out.print("Email do Funcionario: ");
			fprofessor.setEmail(email);
			
			System.out.print("Numero de telefone do Funcionario: ");
			fprofessor.setTelefone(telefone);
			
			System.out.println("Cpf do funcionario: ");
			fprofessor.setCpf(cpf);
			
			Funcionario
			fprofessor = new Funcionario();
			break;
		
		}
	}
	
}
	


