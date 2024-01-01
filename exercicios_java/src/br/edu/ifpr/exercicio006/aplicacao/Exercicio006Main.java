package br.edu.ifpr.exercicio006.aplicacao;
import java.util.Scanner;

public class Exercicio006Main {
	
   public static void showWeekDay(int d) {
	   switch(d) {
       case 0:
       case 6:System.out.println("Fim de semana!!!!!!!!!!!!!!!");
       break;
       
       case 1:
       case 2:
       case 3:
       case 4:
       case 5:System.out.println("Dia de semana.");
	   }
   }
   
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in); 
	     
	     System.out.print("Insira o dia da semana: ");
	     int day = sc.nextInt();
	     sc.close();
	     
	     showWeekDay(day);
   }
}