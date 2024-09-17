import java.util.Scanner;
public class countWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter insert few words separated by a space: ");
        String words = sc.nextLine();
        String[] wordsArr = words.trim().split("\\s+");
        int count = wordsArr.length;
        System.out.println("The number of all words in the string are: " + count);
    }
}