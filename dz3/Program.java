package dz3;
import java.util.Arrays;

public class Program {
   public Program() {
   }

   public static void main(String[] args) {
      Employee[] workers = EmployeeFabric.generateEmployees(15);
      Employee[] var2 = workers;
      int var3 = workers.length;

      int var4;
      Employee worker;
      for(var4 = 0; var4 < var3; ++var4) {
         worker = var2[var4];
         System.out.println(worker);
      }

      System.out.println();
      System.out.println("***");
      System.out.println();
      Arrays.sort(workers, new PhoneComparator());
      var2 = workers;
      var3 = workers.length;

      for (Employee x : var2) {
         if (x instanceof Worker) System.out.println(x);
      }
      System.out.println("__________");
      for (Employee x : var2) {
         if (x instanceof Freelancer) System.out.println(x);
      }

      System.out.println("***");
      for (Employee x : var2) System.out.println(x);


   }
}