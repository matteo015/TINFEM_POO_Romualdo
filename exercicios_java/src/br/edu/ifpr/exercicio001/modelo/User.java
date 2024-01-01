package br.edu.ifpr.exercicio001.modelo;

public class User {
   private int years;
   private int months;
   private int days;
   
   public User() {}
   public User (int years, int months, int days) {
      this.years = years;
      this.months = months;
      this.days = days;
   }
   
   public int getYears() {return years;}
   public void setYears(int years) {
      this.years = years;
   }
   
   public int getMonths() {return months;}
   public void setMonths(int months) {
      this.months = months;
   }
   
   public int getDays() {return years;}
   public void setDays(int days) {
      this.days = days;
   }
   
   public int calculateTimeAlive() {
      return (years * 365) +
             (months * 30) + days;
   }
}