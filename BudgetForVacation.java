
import java.util.Scanner;

public class BudgetForVacation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String vacationType;
        double budget;
        double dailyBudget;
        int days;
        int people;
        String bulgariaDestination = "According to your budget you can go to Bulgaria";
        String italyDestination = "According to your budget you can go to Italy";

        System.out.print("Enter the vacation type: ");
        vacationType = input.nextLine();
        System.out.print("Enter the budget: ");
        budget = input.nextDouble();
        System.out.print("Enter the days: ");
        days = input.nextInt();
        System.out.print("Enter the people: ");
        people = input.nextInt();

        dailyBudget = budget / (days * people);

        switch (vacationType) {
            case "Mountain":
                if (dailyBudget < 30) {
                    System.out.println(bulgariaDestination);
                }
                else {
                    System.out.println(italyDestination);
                }
                break;
                case "Beach":
                    if (dailyBudget < 50) {
                        System.out.println(bulgariaDestination);
                    }
                    else {
                        System.out.println(italyDestination);
                    }
                    break;
            default:
                System.out.println("We can't offer something for that type of vacation");
        }

    }
}
