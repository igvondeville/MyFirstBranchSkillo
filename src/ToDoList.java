import java.util.ArrayList;

public class ToDoList {
    private static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("Homework");
        list.add("Lectures");
        list.add("Work");
        list.add("Cook");
        list.add("Clean");
        list.add("Sleep");

        addTask("Eat");
        removeTask("Clean");
        removeTask("Sleep");
        removeTask("Cook");

        for (String task : list) {
            System.out.println(task);
        }
    }
    public static void addTask(String task) {
        list.add(task);
        System.out.println("New task added: " + task);
    }

    public static void removeTask(String task) {

        if(list.remove(task)) {
            System.out.println("Task was done: " + task);
        }
        else {
            System.out.println(task);
        }
    }
}