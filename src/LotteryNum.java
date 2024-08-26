import java.util.Scanner;

public class LotteryNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number seperated by space: ");
        String number = input.nextLine();

        System.out.println("Your lottery numbers are: " + number);
        System.out.println("This is your last chance to add more numbers, please separate them by space: ");
        String lastChance = input.nextLine();
        String allNumbers = number + " " + lastChance;

        int[] congrats = {44, 36, 14, 7, 21};
        int matchCount = countWinNum(congrats, allNumbers);

        if (matchCount > 0) {
            System.out.println("Congratulations! You have " + matchCount + " winning numbers!");
        } else {
            System.out.println("Sorry, no winning numbers.");
        }
    }

    public static int countWinNum(int[] congrats, String userNumbers) {
        int matches = 0;
        String[] userNumArray = userNumbers.split(" ");

        for (String userNum : userNumArray) {
            int num = Integer.parseInt(userNum.trim());
            for (int winNum : congrats) {
                if (num == winNum) {
                    matches++;
                }
            }
        }
        return matches;
    }
}