package dz3;

public class Worker extends Employee {
   private Worker(String surName, String name, double salary, String phoneNumber) {
      super(surName, name, salary, phoneNumber);
   }

   public static Worker create(String surName, String name, double salary, String phoneNumber) {
      return new Worker(surName, name, salary, phoneNumber);
   }

   public double calculateSalary() {
      return this.salary;
   }

   public String toString() {
      return String.format("штатный работник - %s %s; ставка: %.2f руб.; заработная плата: %.2f руб.; мобильный телефон: %s" , this.surName, this.name, this.salary, this.calculateSalary(), phoneNumber);
   }
}
