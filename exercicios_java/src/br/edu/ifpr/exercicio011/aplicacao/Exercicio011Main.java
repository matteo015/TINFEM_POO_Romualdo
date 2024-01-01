package br.edu.ifpr.exercicio011.aplicacao;
import java.util.Scanner;

public class Exercicio011Main {
	
	public static void showMorse(int num) {
		switch (num) {
		
		case 0: System.out.print("------ ");
		break;
		case 1: System.out.print(".---- ");
		break;
		case 2: System.out.print("..--- ");
		break;
		case 3: System.out.print("...-- ");
		break;
		case 4: System.out.print("....- ");
		break;
		case 5: System.out.print("...... ");
		break;
		case 6: System.out.print("-..... ");
		break;
		case 7: System.out.print("--.... ");
		break;
		case 8: System.out.print("---.. ");
		break;
		case 9: System.out.print("----. ");
		break;
		}
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro e positivo:");
		num = sc.nextInt();
		sc.close();
		
		System.out.print("Versão morse: ");
		showMorse(num);
	}
}