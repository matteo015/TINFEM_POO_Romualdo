package br.edu.ifpr.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa{
   private String matricula;
   private List<Avaliacao> avaliacoes;
   private double media;
   
   public Aluno(){ }
   public Aluno(String nome, Endereco endereco, String matricula){
      super(nome,endereco);
      this.matricula = matricula;
      this.avaliacoes = new ArrayList<>();
   }
   
   public String getMatricula() {return matricula;}
   public void setMatricula(String matricula) {
      this.matricula = matricula;
   }
   
   public List<Avaliacao> getAvaliacoes() {return avaliacoes;}
   public void setAvaliacoes(List<Avaliacao> avaliacoes) {
      this.avaliacoes = avaliacoes;
   }
   
   public void addAvaliacao(Avaliacao avaliacao) {
      this.avaliacoes.add(avaliacao);
   }
   
   public double getMedia() { return media;}
   public void setMedia(double media) {
      this.media = media;
   }
   
   public String toString() {
      return "\nAluno ("      + super.getNome()      + ")\t"  +
             "Matricula ["    + matricula            + "]\n"  +
                                super.getEndereco()  + "\n"   +
             "Avaliações : \n" + (avaliacoes.isEmpty() ? " " : avaliacoes);
   }
   @Override
   public int hashCode() {return Objects.hash(matricula);}
   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null) return false;
      if (getClass() != obj.getClass())
         return false;
      Aluno other = (Aluno) obj;
      return matricula == other.matricula;
   }
}
