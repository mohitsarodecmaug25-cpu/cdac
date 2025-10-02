package project;
import java.util.*;
public class EmployeeManagement {

    public static void main(String[] args) {
        System.out.println("=== Employee Information System ===");

        // Store employees in a Map
        Map<String, String> employees = new HashMap<>();

        employees.put("Employee 1", "Name=Amit, Salary=50000");
        employees.put("Employee 2", "Name=Priya, Salary=60000");
        employees.put("Employee 3", "Name=Rahul, Salary=55000");
        employees.put("Employee 4", "Name=Neha, Salary=45000");
        employees.put("Employee 5", "Name=Vikram, Salary=70000");
        employees.put("Employee 6", "Name=Sanya, Salary=65000");
        employees.put("Employee 7", "Name=Karan, Salary=48000");

        // Print all employees
        System.out.println("\n--- Employees List ---");
        for (Map.Entry<String, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
