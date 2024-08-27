public class PineTree {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n-j; k++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * j - 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
