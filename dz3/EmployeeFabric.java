package dz3;

import java.util.Arrays;
import java.util.Random;

public class EmployeeFabric {
   private static Random random = new Random();

   public EmployeeFabric() {
   }

   public static Employee generateEmployee() {
      double profession = Math.random();
      int salary;
      String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
      String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
      String zeros = "";
      int digitsNumber = 7;

      String Number = Integer.toString(random.nextInt(0, 10000000));
      for (int i = Number.length(); i < digitsNumber; i++) zeros = zeros + "0";
      String phoneNumber = zeros + Number;

      if (profession < 0.8) {
         salary = random.nextInt(60000, 120001);
         return Worker.create(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], (double)salary, phoneNumber);
      } else {
         salary = (random.nextInt(600, 1200));
      }
      return Freelancer.create(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], (double)salary, phoneNumber);
   }

   public static Employee[] generateEmployees(int count) {
      Employee[] еmployees = new Employee[count];

      for(int i = 0; i < count; ++i) {
         еmployees[i] = generateEmployee();
      }

      return еmployees;
   }

}