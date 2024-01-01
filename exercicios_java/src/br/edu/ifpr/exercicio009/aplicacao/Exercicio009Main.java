package br.edu.ifpr.exercicio009.aplicacao;

import br.edu.ifpr.exercicio009.modelo.Student;
import java.util.Random;

public class Exercicio009Main {
	
   static void showUserStatus(float m) {
	   if(m >= 7)
	       System.out.println("Aprovado");
	    else 
	       if(m >= 4 && m < 7)
	          System.out.println("Exame");
	       else
	          System.out.println("Reprovado");
   }
   
   public static void main(String[] args) {
	   Random r = new Random();
	   Student st = new Student();
	   
	   st.setGrade1(r.nextFloat(10));
	   st.setGrade2(r.nextFloat(10));
	   st.setGrade3(r.nextFloat(10));
	   st.setGrade4(r.nextFloat(10));
	   
	    showUserStatus(st.average());
   }
}