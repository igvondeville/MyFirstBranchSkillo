import java.util.HashMap;

public class StoreInventory {
    public static void main(String[] args) {
        HashMap<Integer, String> inventory = new HashMap<>();

        inventory.put(3, "Blazer");
        inventory.put(9, "Dress");
        inventory.put(7, "Shirt");
        inventory.put(1, "Jeans");
        inventory.put(4, "Trousers");
        System.out.println(inventory);

    }
}
