package br.edu.ifpr.exercicio004.aplicacao;

public class Exercicio004Main {

	public static int calculate(int n, int s) {
	for(  ; n >= 1; n--) {
		if(n %2==0)
				s += n*n;
		else
			s -= n*n;
		}
	return s;
	}

	public static void main(String[] args) {     
		System.out.print(calculate(50,0));
		}
}