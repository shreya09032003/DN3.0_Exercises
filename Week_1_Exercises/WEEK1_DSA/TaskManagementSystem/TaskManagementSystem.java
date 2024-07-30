package WEEK1_DSA.TaskManagementSystem;

import java.util.Scanner;

public class TaskManagementSystem {
    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public TaskManagementSystem() {
        head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void deleteTask(String taskId) {
        if (head == null) return;

        if (head.task.getTaskId().equals(taskId)) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && !temp.next.task.getTaskId().equals(taskId)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public Task searchTask(String taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.getTaskId().equals(taskId)) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose operation: add, delete, search, traverse, exit");
            String operation = scanner.nextLine();

            switch (operation) {
                case "add":
                    System.out.println("Enter task ID:");
                    String addId = scanner.nextLine();
                    System.out.println("Enter task name:");
                    String addName = scanner.nextLine();
                    System.out.println("Enter task status:");
                    String addStatus = scanner.nextLine();
                    tms.addTask(new Task(addId, addName, addStatus));
                    System.out.println("Task added.");
                    break;
                case "delete":
                    System.out.println("Enter task ID:");
                    String deleteId = scanner.nextLine();
                    tms.deleteTask(deleteId);
                    System.out.println("Task deleted.");
                    break;
                case "search":
                    System.out.println("Enter task ID:");
                    String searchId = scanner.nextLine();
                    Task task = tms.searchTask(searchId);
                    if (task != null) {
                        System.out.println("Task found: " + task);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case "traverse":
                    tms.traverseTasks();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }
    }
}
