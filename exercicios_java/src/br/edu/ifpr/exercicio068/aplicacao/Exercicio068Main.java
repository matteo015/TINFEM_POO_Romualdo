package br.edu.ifpr.exercicio068.aplicacao;

public class Exercicio068Main {

	public static void main(String[] args) {
		String text = "Lorem dolor Lorem sed risus ultricies. "+
					  "Lorem Vitae Lorem tellus mauris Loten. ";
		System.out.println("Texto: " + text);
		
		String substring = text.substring(12,17);
		System.out.println("Substring: " + substring);
		
		int ocurrences = 0;
		int start = 0;
		int i = 0;
		do {
			if( text.indexOf(substring, start + i) != -1) {
				ocurrences++;
				start = text.indexOf(substring, start + i);
				i = 2;
				System.out.printf("Ocorrencia[%d] de '%s' - index[%d]\n",ocurrences,substring,start);
			}
			else start++;
		}while(start < text.length());
	}
}