package br.edu.ifpr.exercicio003.aplicacao;

import br.edu.ifpr.numbers.NumUtils;
import java.util.Scanner;

public class Exercicio003Main {
   static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      int num = sc.nextInt();
      sc.close();
      
      if(NumUtils.pairOrOdd(num))
         System.out.println("O numero � par");
      else
         System.out.println("O numero n�o par");
   }
}