package br.edu.ifpr.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno extends Pessoa{
	private int matricula;
	private List<Avaliacao> avaliacoes = new ArrayList<>();
	private double media;
	
	public Aluno(){ }
	public Aluno(String nome, Endereco endereco, int matricula){
		super(nome,endereco);
		this.matricula = matricula;
	}
	
	public int getMatricula() {return matricula;}
	public void setMatricula(int matricula) {
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
	   return "\nAluno ("       + super.getNome() 	  + ")\t" +
			   	"Matricula ["   + matricula 	  	  + "]\n" +
			   	"Endereco - "   + super.getEndereco() + "]\n" +
				"Avaliações : " + (avaliacoes.isEmpty() ? "Sem avaliações" : avaliacoes) +"\n" +
			    "Média : " + (getMedia() == 0 ? "Sem média" : getMedia());
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