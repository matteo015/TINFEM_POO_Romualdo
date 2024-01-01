package br.edu.ifpr.exercicio008.aplicacao;

import br.edu.ifpr.exercicio008.modelo.Triangle;
import java.util.Random;

public class Exercicio008Main {
   
   static void showTriangleType(int lA, int lB, int lC) {
	   if(lA == lB && lA == lC)
		   System.out.println("Triangulo equilátero.");
	   else 
		   if(lA == lB || lA == lC)
			   System.out.println("Triangulo isóceles.");
		   else 
			   System.out.println("Triangulo escaleno");
   }

   public static void main(String[] args) {
      Random r = new Random();
      Triangle t = new Triangle();
      
      t.setSideA(r.nextInt(10) + 1);
      t.setSideB(r.nextInt(10) + 1);
      t.setSideC(r.nextInt(10) + 1);
      
      
      if(t.existence())
      	showTriangleType(t.getSideA(),t.getSideB(),t.getSideC());
      else
    	System.out.println("Não é um triangulo.");
   }
}