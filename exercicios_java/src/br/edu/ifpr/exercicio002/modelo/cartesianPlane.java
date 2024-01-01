package br.edu.ifpr.exercicio002.modelo;

public class cartesianPlane {
	
	private int Xa;
    private int Xb;
    private int Ya;
    private int Yb;
    
    public int getXa() {return Xa;}
    public void setXa(int Xa) {
       this.Xa = Xa;
    }
    
    public int getXb() {return Xb;}
    public void setXb(int Xb) {
       this.Xb = Xb;
    }

    public int getYa() {return Ya;}
    public void setYa(int Ya) {
    	this.Ya = Ya;
    }
    
    public int getYb() {return Yb;}
    public void setYb(int Yb) {
    	this.Yb = Yb;
    }
    
    public double calculateDistance() {
    	return Math.sqrt(Math.pow(Xb - Xa,2) + 
    					 Math.pow(Yb - Ya,2));
    }
}