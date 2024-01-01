package br.edu.ifpr.model.utils.comparators;

import java.util.Comparator;

import br.edu.ifpr.model.Aluno;
import br.edu.ifpr.model.Pessoa;

public class AlunoMatriculaComparator implements Comparator<Pessoa> {
   @Override
   public int compare(Pessoa o1, Pessoa o2) {
      Aluno a1 = (Aluno)o1;
      Aluno a2 = (Aluno)o2;
      
      return a1.getMatricula() - a2.getMatricula();
   }
}