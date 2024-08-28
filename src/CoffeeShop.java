import java.util.LinkedList;
import java.util.Queue;

public class CoffeeShop {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);

        int numCustomers = queue.size();

        System.out.println("Number of the customers is: " + numCustomers);
        for (int i = 0; i < numCustomers; i++) {
System.out.println("Served customers: " + queue.poll());
        if (queue.isEmpty()) {
            System.out.println("All customers have been served. No one is waiting!");
        }
        }
    }
}
