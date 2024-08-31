import java.util.HashMap;
import java.util.Map;

public class StoreInventory {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Blazer", 3);
        inventory.put("Dress", 9);
        inventory.put("Shirt", 7);
        inventory.put("Jeans", 1);
        inventory.put("Trousers", 4);
        System.out.println("Current inventory are: " + inventory);
    System.out.println("\nCheck the quantity of Shirts: " + inventory.get("Shirt") + " units.");
inventory.put("Jeans", inventory.get("Jeans") + 11);
System.out.println("Restocked Jeans, update quantity: " + inventory.get("Jeans"));
       inventory.put("Trousers", 0);
       System.out.println("Trousers is out of stoke. Updated products availability  " + inventory);
      inventory.remove("Blazer");
      System.out.println("Blazer were sold. We have new inventory list: " + inventory);
      System.out.println("Final inventory list are: " + inventory);
        }
    }
