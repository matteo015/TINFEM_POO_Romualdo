package atv_sala.herança.app;

import java.util.ArrayList;
import java.util.List;

import atv_sala.herança.modelo.Aluno;
import atv_sala.herança.modelo.Endereco;
import atv_sala.herança.modelo.Pessoa;
import atv_sala.herança.modelo.Professor;

public class Principal {
	public Principal() {
		Endereco endereco  = new Endereco("Capão Redondo","Winston Churchil",1105);
		Endereco endereco2 = new Endereco("Izolina Bacci Nonino","Perobinha",260);
		Endereco endereco3 = new Endereco("Cafezal" , "Juscelino Kubistheck" , 20);
		
		Pessoa p1 = new Aluno("Murilo"  ,endereco, 123456);
		Pessoa p2 = new Aluno("Canhadas",endereco2, 654321);
		Pessoa p3 = new Professor("Romualdo", endereco3, 203);
		Pessoa p4 = new Professor("Kátia", endereco3, 392);
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas = List.of(p1,p2,p3,p4);
		
		pessoas.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		new Principal();
	}
}