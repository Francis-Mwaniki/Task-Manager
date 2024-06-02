// File: src/TaskManagerApp.java
import java.util.Scanner;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Task Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(description);
                    System.out.println("Task added.");
                    break;
                case 2:
                    System.out.println("Tasks:");
                    int index = 0;
                    for (Task task : taskManager.getTasks()) {
                        System.out.println((index++) + ". " + task);
                    }
                    break;
                case 3:
                    System.out.print("Enter task index to mark as completed: ");
                    int taskIndex = scanner.nextInt();
                    taskManager.markTaskAsCompleted(taskIndex);
                    System.out.println("Task marked as completed.");
                    break;
                case 4:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
