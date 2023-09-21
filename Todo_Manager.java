
import java.util.Scanner;

public class Todo_Manager {

    public static void main(String[] args) {
        System.out.println("Welcome to your Todo Manager!\n");
        System.out.println("Please Enter your Name: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine(); // Use nextLine() to capture the entire name.
        System.out.println("Hello " + name);

        String[] tasks = new String[10]; // Array to store tasks.
        int taskCount = 0; // To keep track of the number of tasks.

        Scanner input = new Scanner(System.in);
        String choice;

        do {
            // Display the Menu
            System.out.println("\nPlease choose an option\n");
            System.out.println("1. Enter a task");
            System.out.println("2. Remove a task");
            System.out.println("3. Update a task");
            System.out.println("4. List all tasks");
            System.out.println("5. Exit");
            choice = input.nextLine();

            switch (choice) {
                case "1":
                    if (taskCount < tasks.length) {
                        System.out.println("Enter a task: ");
                        tasks[taskCount++] = input.nextLine(); // Store the task and increment the count.
                    } else {
                        System.out.println("Task list is full.");
                    }
                    break;
                case "2":
                    System.out.println("Enter the task index to remove: ");
                    int indexToRemove = input.nextInt();
                    input.nextLine(); // Consume the newline character.
                    if (indexToRemove >= 0 && indexToRemove < taskCount) {
                        // Shift tasks to remove the selected one.
                        for (int i = indexToRemove; i < taskCount - 1; i++) {
                            tasks[i] = tasks[i + 1];
                        }
                        tasks[taskCount - 1] = null; // Clear the last element.
                        taskCount--;
                    } else {
                        System.out.println("Invalid task index.");
                    }
                    break;
                case "3":
                    System.out.println("Enter the task index to update: ");
                    int indexToUpdate = input.nextInt();
                    input.nextLine(); // Consume the newline character.
                    if (indexToUpdate >= 0 && indexToUpdate < taskCount) {
                        System.out.println("Enter the new task: ");
                        tasks[indexToUpdate] = input.nextLine();
                    } else {
                        System.out.println("Invalid task index.");
                    }
                    break;
                case "4":
                    System.out.println("Tasks:");
                    for (int i = 0; i < taskCount; i++) {
                        System.out.println(i + ": " + tasks[i]);
                    }
                    break;
                case "5":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("5"));
    }
}
