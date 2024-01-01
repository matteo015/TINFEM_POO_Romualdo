package br.edu.ifpr.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import br.edu.ifpr.model.Aluno;
import br.edu.ifpr.model.Endereco;
import br.edu.ifpr.model.Pessoa;
import br.edu.ifpr.model.Professor;

public class MainB {
	static Scanner in = new Scanner(System.in);

	public MainB() {
		mainMenu();
	}

	public void mainMenu() {
		List<Pessoa> pessoas = MainA.popular();
		List<Aluno> alunos = new ArrayList<>();
		List<Professor> professores = new ArrayList<>();

		for (Pessoa p : pessoas)
			if (p instanceof Aluno)
				alunos.add((Aluno) p);

		for (Pessoa p : pessoas)
			if (p instanceof Professor)
				professores.add((Professor) p);

		while (true) {
			System.out.print("\n\n1 - Alunos\n2 - Professor\n3 - Sair \n\n Opção: \r");
			int Option = in.nextInt();
			switch (Option) {
			case 1: showMenuAlunos(alunos); 			break;
			case 2: showMenuProfessores(professores);	break;
			case 3: return;
			}
		}
	}

	public void subMenuProfessore(List<Professor> lista) {
		System.out.print("\n\n1- Incluir\n2- Alterar\n3- Consultar\n4- Excluir \n5- Voltar \n\n Opção: \r");
		int Option = in.nextInt();
		switch	(Option) {
			case 1: incluirProfessor(lista); break;
			case 2: alterarProfessor(lista); break;
			case 3: consultar(lista);		 break;
			case 4: excluir(lista); break;
			case 5: return;
		}		
	}
	
	public void subMenuAluno(List<Aluno> lista) {
		System.out.print("1- Incluir\n2- Alterar\n3- Consultar\n4- Excluir \n5- Voltar \n\n Opção: \r");
		int Option = in.nextInt();
		switch	(Option) {
			case 1: incluirAluno(lista); break;
			case 2: alterarAluno(lista); break;
			case 3: consultar(lista);		 break;
			case 4: excluir(lista); break;
			case 5: return;
		}		
	}

	public void showMenuProfessores(List<Professor> professores) {
		System.out.println("\n\t #Professores\n");
		subMenuProfessore(professores);
	}

	public void showMenuAlunos(List<Aluno> alunos) {
		System.out.println("\n\t #Alunos");
		subMenuAluno(alunos);
	}

	public List<Aluno> incluirAluno(List<Aluno> lista) {
		Endereco ed = incluirEndereco();
		System.out.print("Insira o Nome e a Matricula do aluno: \r");
		lista.add(new Aluno(in.next(), ed, in.nextInt()));
		return lista;
	}

	public List<Aluno> alterarAluno(List<Aluno> lista) {
		consultar(lista);
		System.out.print("\nSelecione um ID para alterar: ");
									 int ID = in.nextInt();
		Endereco ed = incluirEndereco();
		
		System.out.print("\nInsira o Nome e a Matricula do aluno: ");
		lista.set((ID == 0 ? 0 : ID - 1), new Aluno(in.next(), ed,in.nextInt()));
		return lista;
	}
	
	public List<Professor> incluirProfessor(List<Professor> lista) {
		Endereco ed = incluirEndereco();
		System.out.print("Insira o Nome e o Registro do professor: \r");
		lista.add(new Professor(in.next(), ed, in.nextInt()));
		return lista;
	}
	
	public List<Professor> alterarProfessor(List<Professor> lista) {
		consultar(lista);
		System.out.print("\nSelecione um ID para alterar: ");
									 int ID = in.nextInt();
		Endereco ed = incluirEndereco();
		
		System.out.print("\nInsira o Nome e o Registro do professor: ");
		lista.set((ID == 0 ? 0 : ID - 1), new Professor(in.next(), ed,in.nextInt()));
		return lista;
	}

	public <T> List<T> excluir(List<T> lista)	{
		consultar(lista);
		System.out.print("\nSelecione um ID para excluir: ");
		int ID = in.nextInt();
		lista.remove((ID == 0 ? 0 : ID - 1));
		return lista;
	}
	
	public <T> void consultar(List<T> lista) {
		Iterator<T> it = lista.iterator();
		int index = 0;
		
		while(it.hasNext()) {
			System.out.println("\nID: " + (index + 1) + lista.get(index));
			index++;
			it.next();
		}
	}
	
	public Endereco incluirEndereco() {
		System.out.print("\nInsira o Endereço (Bairro, Rua, Número) - \r");
		Endereco ed = new Endereco(in.next(), in.next(), in.nextInt());
		return ed;
	}
	
	public static void main(String[] args) {
		new MainB();
	}
}