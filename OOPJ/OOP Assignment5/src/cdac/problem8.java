package cdac;

import java.lang.invoke.StringConcatFactory;
import java.util.LinkedHashSet;
import java.util.Set;

public class problem8 {
    public static void main(String[] args) {
        Set<String> courses = new LinkedHashSet<>();
        courses.add("CS101");
        courses.add("MA101");
        courses.add("CS101");
        System.out.println("Registered Courses: " + String.join(", ", courses));

    }

}
