import java.util.Scanner;

public class DynamicRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int[][] matrix = {
        // {1, 2, 3}, First row
        // {4, 5, 6}, Second row
        // {7, 8, 9}, Third row
        // }

        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
