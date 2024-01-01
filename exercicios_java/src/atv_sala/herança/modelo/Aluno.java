package atv_sala.herança.modelo;

import java.util.Objects;

public class Aluno extends Pessoa{
	private int matricula;
	
	public Aluno(){}
	public Aluno(String nome, Endereco endereco, int matricula){
		super(nome,endereco);
		this.matricula = matricula;
	}
	
	public int getMatricula() {return matricula;}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		return   "\nAluno ["  + super.getNome()     + "] " +
			   "Matricula ["  + matricula 		    + "]\n" +
				"Endereco ["  + super.getEndereco() + "]";
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