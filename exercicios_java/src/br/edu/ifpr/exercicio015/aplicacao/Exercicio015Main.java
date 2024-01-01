package br.edu.ifpr.exercicio015.aplicacao;

import java.util.Scanner;
import br.edu.ifpr.numbers.NumUtils;

public class Exercicio015Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		System.out.println("O número possui " + NumUtils.numLenght(num) + " digitos.");
	}
}