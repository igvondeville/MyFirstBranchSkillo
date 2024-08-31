import java.util.HashSet;

public class GuestList {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("John");
        names.add("Peter");
        names.add("Mary");
        names.add("Jane");
        names.add("Bob");
        System.out.println("Guests in the party is: " + names);

        boolean isAdded = names.contains("Peter");
        System.out.println("Guests in the party contains Peter: " + isAdded);

        names.remove("Bob");
        System.out.println("Bob got a flu and can't come in the party. Updated list are: " + names);

        boolean isOnList = names.contains("Peter");
        System.out.println("\nIs Peter is on the guest list? " + (isOnList ? "Yes" : "No"));
    }
}