package br.edu.ifpr.exercicio012.aplicacao;

import br.edu.ifpr.exercicio011.aplicacao.Exercicio011Main;
import br.edu.ifpr.numbers.NumUtils;

public class Exercicio012Main{

	public static void main(String[] args) {
	   int num = 123;
	   	   num = NumUtils.invert(num);
	   
	   while(num > 0) {
		   Exercicio011Main.showMorse(num%10);
		   num/=10;
	   }
	}
}