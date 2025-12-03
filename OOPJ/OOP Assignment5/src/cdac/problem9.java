package cdac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class problem9 {
   public static void main(String[] args) {
       String[] attendees = {"Amit", "Rohan", "Ammit", "Priya"};
       Set<String> unique = new HashSet<>(Arrays.asList(attendees));
       System.out.println("Total unique attendees: " + unique.size());
   }
}
