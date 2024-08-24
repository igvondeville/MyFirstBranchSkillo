import java.util.ArrayList;

public class biggestElement {
    public static int main(int[] args) {
        ArrayList<Integer> listNum = new ArrayList<Integer>();
        listNum.add(101);
        listNum.add(25);
        listNum.add(31);
        listNum.add(45);
        listNum.add(60);
        listNum.add(75);

        int biggest = listNum.get(0);

        for (int i = 1; i < listNum.size(); i++) {
            if (listNum.get(i) > listNum.get(biggest)) {
                biggest = listNum.get(i);
            }
        }
        return biggest;
    }
}
