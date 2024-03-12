package dz3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
   public SalaryComparator() {
   }

   public int compare(Employee o1, Employee o2) {
      return Double.compare(o2.calculateSalary(), o1.calculateSalary());
   }
}
