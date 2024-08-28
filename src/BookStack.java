import java.util.Stack;
public class BookStack {
    public static void main(String[] args) {
       Stack<String> stack = new Stack<>();

       stack.push("The Great Gatsby");
       stack.push("Alice in Wonderland");
       stack.push("The Little Prince");
       System.out.println("Your top three books is: " + stack);

       System.out.println("Your last book is: " + stack.peek());

       while (!stack.isEmpty()) {
           System.out.println("Removed book: " + stack.pop());
       }

    System.out.println("All books have been read. Great job! ");

       }
    }
