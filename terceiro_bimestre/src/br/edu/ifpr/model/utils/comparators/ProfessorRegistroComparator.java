package br.edu.ifpr.model.utils.comparators;

import java.util.Comparator;

import br.edu.ifpr.model.Professor;

public class ProfessorRegistroComparator implements Comparator<Professor> {
	@Override
	public int compare(Professor o1, Professor o2) {
		return o1.getRegistro() - o2.getRegistro();
	}

}
