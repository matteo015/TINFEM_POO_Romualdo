package br.edu.ifpr.exercicio014.aplicacao;

import java.util.Random;

public class Exercicio014Main {

	public static void main(String[] args) {
		Random r = new Random();
		
		int naturalNumbersQtd = r.nextInt(15) + 1;
		int multiple1 = r.nextInt(40) + 1;
		int multiple2 = r.nextInt(30) + 1;
		
		for(int i = 1; i < naturalNumbersQtd; i++) {
			System.out.print(i * multiple1 + " " + i * multiple2 + " ");
		}
	}
}