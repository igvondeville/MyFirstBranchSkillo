public class ReverseDigits {
    public static void main(String[] args) {
        int[] digits = {10, 20, 30, 40, 50};
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.println(digits[i]);
        }
    }
}
