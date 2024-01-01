package atv_sala.herança.modelo;

import java.util.Objects;

public class Professor extends Pessoa{
	private int registro;
	
	public Professor() {}
	public Professor(String nome, Endereco endereco, int registro) {
		super(nome,endereco);
		this.registro = registro;
	}
	public int getRegistro() {return registro;}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	public String toString() {
		return "\nProfessor [" + super.getNome()      + "] " +
			      "Registro [" + registro 		      + "]\n" +
				  "Endereco [" + super.getEndereco()  + "]";
	}
	@Override
	public int hashCode() {return Objects.hash(registro);}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return registro == other.registro;
	}
}