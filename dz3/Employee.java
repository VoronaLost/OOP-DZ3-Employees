package dz3;

public abstract class Employee implements Comparable<Employee> {
   protected String name;
   protected String surName;
   protected double salary;
   protected String phoneNumber;

   public int compareTo(Employee o) {
      int surNameRes = this.surName.compareTo(o.surName);
      return surNameRes == 0 ? this.name.compareTo(o.name) : surNameRes;
   }

   public abstract double calculateSalary();

   public String getPhoneNumber() {
       return phoneNumber;
   }

   public Employee(String surName, String name, double salary, String phoneNumber) {
      this.surName = surName;
      this.name = name;
      this.salary = salary;
      this.phoneNumber = phoneNumber;
   }
}
