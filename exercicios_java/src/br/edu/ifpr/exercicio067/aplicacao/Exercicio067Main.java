package br.edu.ifpr.exercicio067.aplicacao;
import java.util.Scanner;

public class Exercicio067Main {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      String text = "pulvinar neque laoreet suspendisse interdum";
      System.out.println("texto original: "+text);
      
      char ch = in.next().charAt(0);
      in.close();
      
       System.out.println("texto modificado: " + text.replace(ch, '*'));
   }  
}