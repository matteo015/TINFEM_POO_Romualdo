package br.edu.ifpr.model.utils;

import java.util.Comparator;

import br.edu.ifpr.model.Aluno;

public class AlunoMediaComparator implements Comparator<Aluno> {

   public int  compare(Aluno p1, Aluno p2) {
      return AlunoUtils.getMedia(p1) < AlunoUtils.getMedia(p2) ? 0 : 1;
   }
}
