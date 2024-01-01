package br.edu.ifpr.model.utils;

import java.util.Comparator;

import br.edu.ifpr.model.Aluno;

public class AlunoMatriculaComparator implements Comparator<Aluno> {
   @Override
   public int compare(Aluno a1, Aluno a2) {
      return a1.getMatricula().compareTo(a2.getMatricula());
   }
}