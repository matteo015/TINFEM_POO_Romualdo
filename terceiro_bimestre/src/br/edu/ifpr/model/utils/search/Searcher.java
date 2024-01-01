package br.edu.ifpr.model.utils.search;

public interface Searcher<T> {
   boolean find(T t, String busca);
}
