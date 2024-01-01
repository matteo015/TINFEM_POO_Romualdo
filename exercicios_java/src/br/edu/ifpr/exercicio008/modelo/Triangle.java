package br.edu.ifpr.exercicio008.modelo;

public class Triangle {
	
	private int sideA;
	private int sideB;
	private int sideC;
	
	public int getSideA() {return sideA;}
	public void setSideA(int sideA) {
		this.sideA = sideA;
	}
	
	public int getSideB() {return sideB;}
	public void setSideB(int sideB) {
		this.sideB = sideB;
	}
	
	public int getSideC() {return sideC;}
	public void setSideC(int sideC) {
		this.sideC = sideC;
	}
	
	public boolean existence() {return sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB;}
}