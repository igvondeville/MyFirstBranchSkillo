

import java.util.Scanner;
import java.util.Random;
public class GuessTheNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int userGuess = 0;

        System.out.println("Try to guess the number! ");
    while (userGuess != randomNumber) {
        System.out.println("Enter your assumption: ");
        userGuess = scanner.nextInt();
    }

    if (userGuess < randomNumber) {
        System.out.println("Too low! Please try again.");
    }
    else if (userGuess > randomNumber) {
        System.out.println("Too high! You have to try again");
        }
    else {
        System.out.println("Congrats!");
    }
    }
}


