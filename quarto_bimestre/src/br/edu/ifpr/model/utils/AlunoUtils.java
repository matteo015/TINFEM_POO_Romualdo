package br.edu.ifpr.model.utils;

import java.util.Iterator;
import java.util.List;

import br.edu.ifpr.model.Aluno;
import br.edu.ifpr.model.Avaliacao;

public class AlunoUtils {
   
   public static double getMedia(Aluno al) {
      double media = 0;
      List<Avaliacao> avaliacoes = al.getAvaliacoes();
      Iterator<Avaliacao> ita = avaliacoes.iterator();
      
      while (ita.hasNext())
      media += ita.next().getNota();  
      
      return media / avaliacoes.size();
      }
}