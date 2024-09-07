
public class readMiddleChar {
    public static void main(String[] args) {
    displayMiddle("javaLesson");
    displayMiddle("qaAutomation");
    }
    public static void displayMiddle(String value) {
      int middle = value.length() / 2;
      if (value.length() % 2 == 1) {
          System.out.println("The middle char from odd string is: " + value.charAt(middle));
      }
      else {
          System.out.println("Two chars from even string are: " + value.charAt(middle-1) + value.charAt(middle));
      }

    }
}
