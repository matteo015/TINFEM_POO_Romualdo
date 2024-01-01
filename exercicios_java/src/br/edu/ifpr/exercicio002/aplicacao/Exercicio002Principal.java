package br.edu.ifpr.exercicio002.aplicacao;

import br.edu.ifpr.exercicio002.modelo.cartesianPlane;
import java.util.Random;

public class Exercicio002Principal {

   public static void main(String[] args) {
      Random r = new Random();
      cartesianPlane plane = new cartesianPlane();
      
      plane.setXa(r.nextInt(10));
      plane.setYa(r.nextInt(10));
      plane.setXb(r.nextInt(10));
      plane.setYb(r.nextInt(10));
      
      System.out.println(plane.calculateDistance());
   }
}