import java.util.Scanner;

public class ConvertSecondExample {
    public static void main(String[] args) {
      convertMinutesToYearsDays();
    }

    public static void convertMinutesToYearsDays() {
        byte minutesInHour = 60;
        byte hourInDay = 24;
        short daysInYear = 365;

        int minutesInYear = minutesInHour * hourInDay * daysInYear;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the number of minutes: ");

        long min = scanner.nextLong();

        long years = (min / minutesInYear);
        long days = (min / minutesInYear / hourInDay) % daysInYear;

        System.out.println(min + " minutes is approximately " + years  + " years and " + days + " days ");
    }
}
