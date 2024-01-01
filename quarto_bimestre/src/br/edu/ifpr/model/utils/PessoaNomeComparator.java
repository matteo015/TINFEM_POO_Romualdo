package br.edu.ifpr.model.utils;

import java.util.Comparator;

import br.edu.ifpr.model.Pessoa;

public class PessoaNomeComparator implements Comparator<Pessoa> {
   @Override
   public int compare(Pessoa p1, Pessoa p2) {
      return p1.getNome().compareTo(p2.getNome());
   }
}