package br.edu.ifpr.exercicio005.aplicacao;

import java.util.Scanner;

public class Exercicio005Main {
	
   public static float convertDistance(float d, int m1, int m2) {
	   if(m1 < m2)
		   d *= Math.pow(10,Math.abs(m1 - m2));
	   
	   if(m1 > m2)
		   d /= Math.pow(10,Math.abs(m1 - m2));
	   
	   return d;
   }
   
   public static void main(String[] args) {
	      float distance = 0;
	      int metric1 = 0, metric2 = 0;
	      
	      Scanner sc = new Scanner(System.in);
			
			System.out.print("Insira a distancia: ");
			distance = sc.nextInt();
			
			System.out.print("Insira o tipo de medida: ");
			metric1 = sc.nextInt();
			
			System.out.print("Converter para: ");
			metric2 = sc.nextInt();
			sc.close();
	      
	      System.out.print(convertDistance(distance,metric1,metric2));
   }
}