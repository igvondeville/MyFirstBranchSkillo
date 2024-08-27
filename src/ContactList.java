import java.util.LinkedList;
import java.util.Scanner;

public class ContactList {
    public static void main(String[] args) {
        LinkedList<String> contacts = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n1. Add Contact  2. View Contacts  3. Remove Contact  4. Exit");
            choice = sc.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter contact names (separated by space): ");
                String[] names = sc.nextLine().split(" ");
                for (String name : names) {
                    contacts.add(name);
                }
            } else if (choice.equals("2")) {
                System.out.println("Contacts: " + (contacts.isEmpty() ? "No contacts." : contacts));
            } else if (choice.equals("3")) {
                System.out.print("Enter contact name to remove: ");
                String nameToRemove = sc.nextLine();
                System.out.println(contacts.remove(nameToRemove) ? "Contact removed." : "Contact not found.");
            }
        } while (!choice.equals("4"));

        sc.close();
    }
}
