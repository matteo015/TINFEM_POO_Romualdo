package br.edu.ifpr.model.utils.search;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Search {
   
   public static <T> List<T> search(List<T> lista, String busca, Searcher<T> search) {
      List<T> resultado = new ArrayList<>();
      
      ListIterator<T> nameIterator = lista.listIterator();    
      int i = 0;
      while(nameIterator.hasNext()) {
            T t = nameIterator.next();
            
            if(search.find(t,busca))
               resultado.add(lista.get(i));
            i++;
      }
      return resultado;
   }
}
