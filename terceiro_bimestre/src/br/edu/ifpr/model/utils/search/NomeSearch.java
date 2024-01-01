package br.edu.ifpr.model.utils.search;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.edu.ifpr.model.Aluno;

public class NomeSearch implements Searcher<Aluno> {

   @Override
   public boolean find(Aluno t, String busca) {
      Pattern pattern = Pattern.compile(busca);
      Matcher matcher = pattern.matcher(t.getNome());

      return matcher.find();
   }
}
