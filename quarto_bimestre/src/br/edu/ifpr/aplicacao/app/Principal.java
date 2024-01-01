package br.edu.ifpr.aplicacao.app;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.edu.ifpr.model.Aluno;
import br.edu.ifpr.model.Avaliacao;
import br.edu.ifpr.model.Endereco;
import br.edu.ifpr.model.Professor;
import br.edu.ifpr.model.utils.AlunoUtils;

public class Principal {
   public Principal () {
      Endereco e  = new Endereco("Capão Redondo","Cinco conjuntos",1105);
      Endereco e2 = new Endereco("Centro", "Winston Churchill", 983);
      
      Aluno a1 = new     Aluno("Murilo"  , e, "123456");
      Aluno a2 = new     Aluno("Alberto" , e, "654321");
      Aluno a3 = new     Aluno("Roberto" , e, "815287");
      List<Aluno> listAlunos = List.of(a1, a2, a3);

      Professor p4 = new Professor("Romualdo",  e2, "203");
      Professor p5 = new Professor("Kátia",     e2, "392");
      Professor p6 = new Professor("Guilherme", e2, "892");
      List<Professor> listProfessores = List.of(p4, p5, p6);
      
      Avaliacao av1   = new Avaliacao(LocalDate.now()           , 56.5);
      Avaliacao av2   = new Avaliacao(LocalDate.of(2023, 06, 15), 88.9);
      Avaliacao av3   = new Avaliacao(LocalDate.of(2023, 03, 01), 98.9);
      Avaliacao av4   = new Avaliacao(LocalDate.now()           , 36.5);
      Avaliacao av5   = new Avaliacao(LocalDate.of(2023, 12, 05), 48.9);
      Avaliacao av6   = new Avaliacao(LocalDate.of(2023, 9, 20) , 25.9);
      Avaliacao av7   = new Avaliacao(LocalDate.now()           , 66.5);
      Avaliacao av8   = new Avaliacao(LocalDate.of(2023, 12, 05), 68.0);
      Avaliacao av9   = new Avaliacao(LocalDate.of(2023, 9, 20) , 65.9);
      
      a1.addAvaliacao(av1);
      a1.addAvaliacao(av2);
      a1.addAvaliacao(av3);
      
      a2.addAvaliacao(av4);
      a2.addAvaliacao(av5);
      a2.addAvaliacao(av6);
      
      a3.addAvaliacao(av7);
      a3.addAvaliacao(av8);
      a3.addAvaliacao(av9);
      
      //Declaração dos mapas
      Map<String, Aluno>          alunos = new HashMap<>();
      Map<String, Professor> professores = new HashMap<>();
     
      //Populando os mapas usando listas.
     for (Aluno a : listAlunos)
         alunos.put(a.getMatricula(), a);
     
      for (Professor p : listProfessores)
         professores.put(p.getRegistro(), p); 
      
      
      /* Exibir alunos usando for-each
      for (String key : alunos.keySet())
            System.out.println(alunos.get(key));
      
      Exibir aluno usando Stream (Todos os valores)
      alunos.values().stream()
                     .forEach(System.out::println);
      
      Exibir aluno usando Stream (keyset)
      alunos.keySet().stream()
                     .forEach(System.out::println);*/
      
      
      /* a) Recolha todos os alunos do mapa junto de suas avaliações
       * b) calcule e mostre as médias dos alunos. */
      for (String key : alunos.keySet()) {
         Aluno aluno = alunos.get(key);
         
         NumberFormat nf = NumberFormat.getNumberInstance();
         nf.setMaximumFractionDigits(2);
         nf.setMinimumFractionDigits(2);
         String media = nf.format(AlunoUtils.getMedia(aluno));
         
         System.out.println(aluno.getNome()       + 
                              " "                 + 
                            aluno.getAvaliacoes() +
                              "\nMedia - "        + 
                            media + "\n");
      }
   }
   
   public static void main(String[] args) {
      new Principal();
   }
}