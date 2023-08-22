package SRP;

import java.util.Date;


// Исходный код не отвечающий принципу единственной ответственности

//public class Emploee {
//      private String name;
//      private Date dob;
//      private int baseSalary;
//
//      public Emploee(String name, Date dob, int baseSalary) {
//          this.name = name;
//          this.dob = dob;
//          this.baseSalary = baseSalary;
//      }
//
//      public String getEmpInfo() {
//          return "name - " + name + " , dob - " + dob.toString();
//      }
//
//      public int calculateNetSalary() {
//          int tax = (int) (baseSalary * 0.25);   //calculate in otherway
//          return baseSalary - tax;
//      }
//}


// Разбиваем код по классам Emploee и EmploeeSalaryCalculator

public class Emploee {
    private String name;
    private Date dob;
    public Emploee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
