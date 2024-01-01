package br.edu.ifpr.model.utils.comparators;

import java.util.Comparator;

import br.edu.ifpr.model.Aluno;
import br.edu.ifpr.model.utils.AlunoUtils;

public class AlunoMediaComparator implements Comparator<Aluno> {

   public int  compare(Aluno p1, Aluno p2) {
	   return Double.compare(AlunoUtils.getMedia(p1), AlunoUtils.getMedia(p2));
   }
}