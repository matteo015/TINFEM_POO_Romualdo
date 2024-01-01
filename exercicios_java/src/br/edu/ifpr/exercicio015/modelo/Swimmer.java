package br.edu.ifpr.exercicio015.modelo;

public class Swimmer {
	private int age;

	public int getAge() {return age;}
	public void setAge(int age) {
		this.age = age;
	}
	
	void category(int age) {
		if(age >= 5 && age <= 7)
			System.out.println("Infantil A");
	}
}
