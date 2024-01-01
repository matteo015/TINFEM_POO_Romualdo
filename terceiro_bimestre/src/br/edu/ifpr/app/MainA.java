package br.edu.ifpr.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import br.edu.ifpr.model.Aluno;
import br.edu.ifpr.model.Avaliacao;
import br.edu.ifpr.model.Endereco;
import br.edu.ifpr.model.Pessoa;
import br.edu.ifpr.model.Professor;
import br.edu.ifpr.model.utils.AlunoUtils;
import br.edu.ifpr.model.utils.comparators.AlunoMediaComparator;
import br.edu.ifpr.model.utils.comparators.PessoaNomeComparator;
import br.edu.ifpr.model.utils.comparators.ProfessorRegistroComparator;
import br.edu.ifpr.model.utils.search.NomeSearch;
import br.edu.ifpr.model.utils.search.Search;
import br.edu.ifpr.model.utils.search.Searcher;

public class MainA {
	public static Random r = new Random();
	
	public static List<Pessoa> popular() {
		Endereco e  = new Endereco("Capão Redondo","Cinco conjuntos",1105);
		Endereco e2 = new Endereco("Centro", "Winston Churchill", 983);
		
		Pessoa p1 = new     Aluno("Murilo"  ,e, 123456);
        Pessoa p2 = new     Aluno("Alberto",e, 654321);
        Pessoa p3 = new     Aluno("Roberto",e, 654321);
		Pessoa p4 = new Professor("Romualdo", e2, 203);
		Pessoa p5 = new Professor("Kátia", e2, 392);
		
		Avaliacao av1 = new Avaliacao(LocalDate.now() , 76);
		Avaliacao av2 = new Avaliacao(LocalDate.of(2023, 06, 15), 58);
		Avaliacao av3 = new Avaliacao(LocalDate.of(2023, 03, 01), 18);

		Avaliacao av4 = new Avaliacao(LocalDate.now() , 16.5);
		Avaliacao av5 = new Avaliacao(LocalDate.of(2023, 12, 05), 48.9);
		Avaliacao av6 = new Avaliacao(LocalDate.of(2023, 9, 20) , 75.9);
		
		Avaliacao av7 = new Avaliacao(LocalDate.now() , 96.5);
		Avaliacao av8 = new Avaliacao(LocalDate.of(2023, 10, 31), 88.9);
		Avaliacao av9 = new Avaliacao(LocalDate.of(2023, 9, 20) , 85.2);
		
		
		
		List<Avaliacao> avMurilo = new ArrayList<>();
		avMurilo = List.of(av1,av2,av3);

		List<Avaliacao> avAlberto = new ArrayList<>();
		avAlberto = List.of(av4,av5,av6);
		
		List<Avaliacao> avRoberto = new ArrayList<>();
		avRoberto = List.of(av7,av8,av9);
		
		((Aluno) p1).setAvaliacoes(avMurilo);
		((Aluno) p2).setAvaliacoes(avAlberto);
		((Aluno) p3).setAvaliacoes(avRoberto);
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		
		List<Aluno> alunos = new ArrayList<>();
		for (Pessoa p : pessoas)
			if (p instanceof Aluno)
				alunos.add((Aluno) p);
		
		List<Professor> professores = new ArrayList<>();
		for (Pessoa p : pessoas)
			if (p instanceof Professor)
				professores.add((Professor) p);
		
		
		Iterator<Aluno> it = alunos.iterator();
		int i = 0;
		while(it.hasNext()) {
			it.next().setMedia(AlunoUtils.getMedia(alunos.get(i)));
			i++;
		}

		
		return pessoas;
	}
	
	public void mostrarLista() {
		List<Pessoa> pessoas = popular();
		
		System.out.println("Lista de pessoas - ");
		pessoas.forEach(System.out::println);
		
		System.out.println("Lista de pessoas (Ordem Revertida) - ");
		Collections.reverse(pessoas);
		pessoas.forEach(System.out::println);
		
		PessoaNomeComparator nomeComparator = new PessoaNomeComparator();
		System.out.println("\nLista de pessoas (organizada por nome) - " );
		Collections.sort(pessoas,nomeComparator);
		pessoas.forEach(System.out::println);
		
		System.out.println("\nLista de pessoa (desorganizada) - ");
		Collections.shuffle(pessoas);
		pessoas.forEach(System.out::println);
		
		System.out.println("\nFrequencia com que o nome " + pessoas.get(r.nextInt(2)).getNome() + " aparece: " + 
		                     Collections.frequency(pessoas, pessoas.get(pessoas.size() - 1)));
		
		List<Aluno> alunos = new ArrayList<>();
		for (Pessoa pessoa : pessoas)
		   if (pessoa instanceof Aluno)
		      alunos.add((Aluno) pessoa);
		
	    Searcher<Aluno> searcher = new NomeSearch();
	    System.out.println();
	      
	    alunos.forEach(System.out::println);
	    List<Aluno> res = Search.search(alunos,"\\w*to",searcher);
	    System.out.println();
	    res.forEach(System.out::println);
	}
	
	public void prova() {
		List<Pessoa> pessoas = popular();
		
		List<Aluno> alunos = new ArrayList<>();
		for (Pessoa p : pessoas)
			if (p instanceof Aluno)
				alunos.add((Aluno) p);
		
		List<Professor> professores = new ArrayList<>();
		for (Pessoa p : pessoas)
			if (p instanceof Professor)
				professores.add((Professor) p);
		
		professores.forEach(System.out::println);
		alunos.forEach(System.out::println);
		
		ProfessorRegistroComparator prc = new ProfessorRegistroComparator();
		Collections.sort(professores,prc);

		AlunoMediaComparator amc = new AlunoMediaComparator();
		Collections.sort(alunos,amc);
		
		System.out.println("\n\n\nProfessores (Organizado por registros && "
										   + "Alunos (Organizado por Média)");
		professores.forEach(System.out::println);
		alunos.forEach(System.out::println);
		
	}
	
	public MainA() {
		mostrarLista();
	}
	
	public static void main(String[] args) {
		new MainA();
	}
}