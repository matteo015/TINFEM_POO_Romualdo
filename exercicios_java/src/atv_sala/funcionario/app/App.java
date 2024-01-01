package atv_sala.funcionario.app;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Random;

import atv_sala.funcionario.modelo.Funcionario;

public class App {
   static Random         r = new Random(); 
   static NumberFormat nfc = NumberFormat.getCurrencyInstance();
   
   static double randomFloat(double min, double max) {return min + r.nextDouble() * (max-min);}
   
   static void show_func(Funcionario func) {
      nfc.setMaximumFractionDigits(2);
      System.out.println();
      System.out.println("Funcionario : "  + func.getNome() +
                         "\nSalario:  "    + nfc.format(func.getSalario()) +
                         "\nHorista:  "    + (func.isHorista() ? "Sim" : "Não")); 
   }
   
   static String isEqual(Funcionario func, Funcionario func2) {
      boolean equal = func.equals(func2) ? true : false;
      
      return equal == true ? "Funcionario " + func.getNome() + " é igual a "     + "Funcionario " + func2.getNome():
                             "Funcionario " + func.getNome() + " não é igual a " + "Funcionario " + func2.getNome();
   }

   public static void main(String[] args) {   
      BigDecimal salario1 = new BigDecimal(randomFloat(1000, 9000));
      Funcionario func1   = new Funcionario("Romubio",salario1, true);
      
      BigDecimal salario2 = new BigDecimal(randomFloat(1000, 9000));
      Funcionario func2   = new Funcionario("Romulo",salario2, false);
      
      BigDecimal salario3 = new BigDecimal(randomFloat(1000, 9000));
      Funcionario func3   = new Funcionario("Odlamuor",salario3, true);
      
      Funcionario func4   = func1;
      
      System.out.println("\n" +func1);
      System.out.println("\n" +func2);
      System.out.println("\n" +func3);
      System.out.println("\n" +func4);
      
      System.out.println("\n" + isEqual(func1,func2));
      System.out.println("\n" + isEqual(func2,func3));
      System.out.println("\n" + isEqual(func3,func4));
      System.out.println("\n" + isEqual(func1,func4)); 
   }
}