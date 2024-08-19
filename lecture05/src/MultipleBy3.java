import java.util.Scanner;

public class MultipleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an array of digits separated by a space: ");
        String input = scanner.nextLine();
        String[] inputNumbers = input.split(" ");
        System.out.println("Numbers that are not multiple by 3: ");
        for (String strNum : inputNumbers) {
            int num = Integer.parseInt(strNum);

            if (num % 3 == 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}