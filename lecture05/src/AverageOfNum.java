import java.util.Scanner;

public class AverageOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numbers separated by space: ");
        String input = scanner.nextLine();

        String[] inputNumbers = input.split(" ");
        double sum = 0;
        int num = inputNumbers.length;

        for (String strNum : inputNumbers) {
            double number = Double.parseDouble(strNum);
            sum += number;
        }
        double average = sum / num;
        System.out.print("Average of numbers: " + average);

    }
}
