package br.edu.ifpr.exercicio009.modelo;

public class Student {
	private float grade1;
	private float grade2;
	private float grade3;
	private float grade4;
	
	
	public float getGrade1() {return grade1;}
	public void setGrade1(float grade1) {
		this.grade1 = grade1;
	}
	
	public float getGrade2() {return grade2;}
	public void setGrade2(float grade2) {
		this.grade2 = grade2;
	}
	
	public float getGrade3() {return grade3;}
	public void setGrade3(float grade3) {
		this.grade3 = grade3;
	}
	
	public float getGrade4() {return grade4;}
	public void setGrade4(float grade4) {
		this.grade4 = grade4;
	}
	
	public float average() {
		return (grade1 +
			    grade2 +
			    grade3 +
			    grade4) / 4;
	}
}