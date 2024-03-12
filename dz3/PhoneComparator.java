package dz3;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Employee> {
   public PhoneComparator() {
   }

    public int compare(Employee o2, Employee o1){
      
        return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
    }
}

