package br.edu.ifpr.model;

public class Endereco {
	private String bairro;
	private String rua;
	private int	   numero;
	
	public Endereco(){}
	public Endereco(String bairro, String rua, int numero){
		this.bairro = bairro;
		this.rua 	= rua;
		this.numero = numero;
	}
	
	public String getBairro() {return bairro;}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getRua() {return rua;}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public int getNumero() {return numero;}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString () {
		return " Bairro - " + bairro + ", Rua - " + rua + ", Número - " + numero;
	}
}