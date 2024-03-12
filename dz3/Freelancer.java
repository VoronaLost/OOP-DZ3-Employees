package dz3;

public class Freelancer extends Employee {
   private Freelancer(String surName, String name, double salary, String phoneNumber) {
      super(surName, name, salary, phoneNumber);
   }

   public static Freelancer create(String surName, String name, double salary, String phoneNumber) {
      return new Freelancer(surName, name, salary, phoneNumber);
   }

   public double calculateSalary() {
      return this.salary * 20.8 * 8;
   }

   
   public String toString() {
      return String.format("Фрилансер - %s %s; почасовая ставка: %.2f руб.; заработная плата: %.2f руб.; мобильный телефон: %s" , this.surName, this.name, this.salary, this.calculateSalary(), phoneNumber);
   }
}