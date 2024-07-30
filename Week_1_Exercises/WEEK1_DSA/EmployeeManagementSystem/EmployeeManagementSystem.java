package WEEK1_DSA.EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Employee array is full.");
        }
    }

    public Employee searchEmployee(String employeeId) {
        for (Employee emp : employees) {
            if (emp != null && emp.getEmployeeId().equals(employeeId)) {
                return emp;
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp);
            }
        }
    }

    public void deleteEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                employees[i] = employees[count - 1];
                employees[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem system = new EmployeeManagementSystem(10);

        while (true) {
            System.out.println("Choose an operation: add, search, traverse, delete, exit");
            String operation = scanner.nextLine();

            switch (operation.toLowerCase()) {
                case "add":
                    System.out.println("Enter employee ID:");
                    String id = scanner.nextLine();
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter position:");
                    String position = scanner.nextLine();
                    System.out.println("Enter salary:");
                    double salary = Double.parseDouble(scanner.nextLine());
                    system.addEmployee(new Employee(id, name, position, salary));
                    System.out.println("Employee added.");
                    break;
                case "search":
                    System.out.println("Enter employee ID to search:");
                    String searchId = scanner.nextLine();
                    Employee found = system.searchEmployee(searchId);
                    if (found != null) {
                        System.out.println("Employee found: " + found);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case "traverse":
                    system.traverseEmployees();
                    break;
                case "delete":
                    System.out.println("Enter employee ID to delete:");
                    String deleteId = scanner.nextLine();
                    system.deleteEmployee(deleteId);
                    System.out.println("Employee deleted.");
                    break;
                case "exit":
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid operation.");
            }
        }
    }
}
