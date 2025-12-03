package cdac;

import java.util.LinkedList;
import java.util.Queue;

public class problem2 {
    public static void main(String[] args) {

    Queue<String> q = new LinkedList<>();
    q.add("Dhiraj");
    q.add("Bhaghyesh");
    q.add("Rohan");
    q.poll();
    System.out.println("Queue: "+String.join(", ",q));
}

}
