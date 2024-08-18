import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        convertMinutesToYearsDays();
    }

    public static void convertMinutesToYearsDays() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of minutes");
        int minutes = scanner.nextInt();
        int days = minutes / 1440;
        int years = minutes / 525600;

        System.out.println(days + "days");
        System.out.println(years + "years");
    }
}