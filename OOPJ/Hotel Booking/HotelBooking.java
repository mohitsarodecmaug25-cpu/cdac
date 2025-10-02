package Project;

import java.util.*;

public class HotelBooking {
    public static void main(String[] args) {
        System.out.println("=== Hotel Booking System ===");

        // Create list of customers
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(101, "Bhaghesh", "bhaghesh@gmail.com", 1, false));
        customers.add(new Customer(102, "Dhiraj", "dhiraj@gmail.com", 2, false));
        customers.add(new Customer(103, "Chinmay", "chinmay@gmail.com", 3, false));
        customers.add(new Customer(104, "Shantanu", "shantanu@gmail.com", 4, false));

        // Print customers
        System.out.println("\n--- Customer List ---");
        for (Customer c : customers) {
            System.out.println(c);
        }

        // Map Customer → Room
        Map<String, Integer> customerRooms = new HashMap<>();
        customerRooms.put("Bhaghesh", 1);
        customerRooms.put("Dhiraj", 2);
        customerRooms.put("Chinmay", 3);
        customerRooms.put("Shantanu", 4);

        System.out.println("\n--- Customer Room Mapping ---");
        for (Map.Entry<String, Integer> entry : customerRooms.entrySet()) {
            System.out.println(entry.getKey() + " booked Room No: " + entry.getValue());
        }

        // Queue for room cleaning schedule
        Queue<String> cleaningSchedule = new LinkedList<>();
        cleaningSchedule.add("2am");
        cleaningSchedule.add("3am");
        cleaningSchedule.add("4am");
        cleaningSchedule.add("5am");

        System.out.println("\n--- Room Cleaning Schedule ---");
        for (String time : cleaningSchedule) {
            System.out.println("Cleaning at " + time);
        }
    }
}

// Separate Customer class
class Customer {
    int id;
    String name;
    String email;
    int roomNo;
    boolean cancelBooking;

    public Customer(int id, String name, String email, int roomNo, boolean cancelBooking) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.roomNo = roomNo;
        this.cancelBooking = cancelBooking;
    }

    @Override
    public String toString() {
        return "ID=" + id + ", Name=" + name + ", Email=" + email + ", Room=" + roomNo + ", Cancelled=" + cancelBooking;
    }
}
