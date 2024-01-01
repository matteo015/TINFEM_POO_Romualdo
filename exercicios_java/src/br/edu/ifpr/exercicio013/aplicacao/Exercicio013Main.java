package br.edu.ifpr.exercicio013.aplicacao;
import br.edu.ifpr.numbers.NumUtils;

public class Exercicio013Main {
	
	static void showOdds(int num) {
		while(num >= 1) {
			if(!NumUtils.pairOrOdd(num))
				System.out.print(num + " ");
			num--;
		}
	}
	
	static void showPairs(int num, int max) {
		while(num <= max) {
			if(NumUtils.pairOrOdd(num))
				System.out.print(num + " ");
			num++;
		}
	}

	public static void main(String[] args) {
		int num = 10;
		
		showOdds(num);
		System.out.println();
		showPairs(num, num*2);
	}
}