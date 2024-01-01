package atv_sala.funcionario.modelo;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Funcionario {
   private String nome;
   private BigDecimal salario;
   private boolean horista;
   
   Funcionario () {}
   public Funcionario(String nome, BigDecimal salario, boolean horista){
      this.nome = nome;
      this.salario = salario;
      this.horista = horista;
   }
   
   public String getNome() {return nome;}
   public void setNome(String nome) {
      this.nome = nome;
   }
   
   public BigDecimal getSalario() {return salario;}
   public void setSalario(BigDecimal salario) {
      this.salario = salario;
   }
   
   public boolean isHorista() {return horista;}
   public void setHorista(boolean horista) {
      this.horista = horista;
      }
   
   public String toString() {
      NumberFormat nfc = NumberFormat.getCurrencyInstance();
      nfc.setMaximumFractionDigits(2);
      return "Funcionario Nome: " + nome + 
    		 "\nSalário [" + nfc.format(salario) + "]" +
    		 "\nHorista - "+ (horista ? "Sim" : "Nao");
   }  
}