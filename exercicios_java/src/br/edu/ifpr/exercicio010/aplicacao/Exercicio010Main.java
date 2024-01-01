package br.edu.ifpr.exercicio010.aplicacao;
import java.util.Random;

public class Exercicio010Main {
	
   public static void showDivisibles(int i,int n,int m) {
	   
	   while(i < 500) {
		   if(i % n == 0 && i % m != 0)
			   System.out.println(i);
		   i++;
	   }  
   }
   
   public static void main(String[] args) {
	   Random rand = new Random();
	    
	    int n = rand.nextInt(100);
	    int m = rand.nextInt(100);
	    
	    int i = 1;
	    
	    System.out.printf("Os números diviseis por %d e não por %d no intervalo de 1...500 são: ",n,m);
	    showDivisibles(i,n,m); 
   }
}