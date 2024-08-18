import java.util.Scanner;

public class MultipleOf5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter some integers separated by space: ");
        while (num.hasNextInt()) {
            int num1 = num.nextInt();
            if (num1 % 5 == 0) {
                System.out.println("The first multiple of 5 is: " + num1);
                break;
            }
        }
    }
}
