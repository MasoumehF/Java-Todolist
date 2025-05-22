import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void displayMenu(){
        System.out.println("Menu");
        System.out.println("1. View Tasks");
        System.out.println("2. Add Task");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        System.out.println("Enter your choice");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String choice;
            ArrayList <String> toDoList = new ArrayList<>();

            do {
                displayMenu();
                choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("Printing list:");
                        for (int i = 0; i<toDoList.size(); i++){
                            System.out.println(toDoList.get(i));
                        }
                        break;
                    case "2":
                        System.out.println("Enter task");
                        String item = scanner.nextLine();
                        toDoList.add((toDoList.size() + 1) + ". [ ] " + item);
                        break;
                    case "3":
                        System.out.println("Enter the task number to mark as complete");
                        String index1 = scanner.nextLine();
                        String task = toDoList.get(Integer.parseInt(index1) - 1);
                        String completedTask = task.replace("[ ]" ,"[✔]");
                        toDoList.set(Integer.parseInt(index1) - 1 , completedTask);
                        break;
                    case "4":
                        System.out.println("Enter the task number to delete");
                        String index = scanner.nextLine();
                        toDoList.remove(Integer.parseInt(index) - 1);
                        break;
                    case "5":
                        System.out.println("exit");
                        break;
                    default:
                        System.out.println("incorrect choice");
                }


            } while (!choice.equals("5"));
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
