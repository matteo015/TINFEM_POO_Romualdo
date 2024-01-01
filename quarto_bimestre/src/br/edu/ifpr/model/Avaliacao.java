package br.edu.ifpr.model;

import java.time.LocalDate;
import java.util.Objects;

public class Avaliacao {
   private LocalDate data;
   private double nota;
   
   public Avaliacao() {}
   public Avaliacao(LocalDate data, double nota) {
      this.data = data;
      this.nota = nota;
   }
   
   public LocalDate getData() {return data;}
   public void setData(LocalDate data) {
      this.data = data;
   }
   public double getNota() {return nota;}
   public void setNota(double nota) {
      this.nota = nota;
   }

   public String toString() {
      return data + " - Nota [" + nota + "]";
   }

   @Override
   public int hashCode() {return Objects.hash(data, nota);}
   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null) return false;
      if (getClass() != obj.getClass())return false;
      Avaliacao other = (Avaliacao) obj;
      return Objects.equals(data, other.data) && Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
   }  
}