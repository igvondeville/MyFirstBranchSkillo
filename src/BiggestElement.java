public class BiggestElement {
    public static void main(String[] args) {
        int[] num = {77, 98, 0, 24, 177, 77};

        int biggest = findBiggest(num);
        System.out.println("The biggest element in the array is: " + biggest);

    }

    public static int findBiggest(int[] array) {
        int biggest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > biggest) {
                biggest = array[i];
            }
        }
        return biggest;
    }
}