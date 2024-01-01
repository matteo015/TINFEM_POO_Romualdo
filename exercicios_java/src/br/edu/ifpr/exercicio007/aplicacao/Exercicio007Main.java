package br.edu.ifpr.exercicio007.aplicacao;

public class Exercicio007Main {

   public static void main(String[] args) {
	   int t = 0;
	    
	   for(int fulano = 170, cicrano = 150 ; fulano >= cicrano; t++,fulano += 2, cicrano += 4)
	       ;
	    System.out.println("Demorara " + t + " anos para que cicrano se torne maior do que fulano.");
   }
}
