package WEEK1_DSA.InventoryManagementSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManagementSystem {
    private Map<String, Product> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product not found!");
        }
    }

    public void deleteProduct(String productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found!");
        }
    }

    public Product getProduct(String productId) {
        return inventory.get(productId);
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation: add, update, delete, get, exit");
            String operation = scanner.nextLine();

            switch (operation) {
                case "add":
                    System.out.println("Enter product ID:");
                    String addId = scanner.nextLine();
                    System.out.println("Enter product name:");
                    String addName = scanner.nextLine();
                    System.out.println("Enter product quantity:");
                    int addQuantity;
                    try {
                        addQuantity = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid quantity. Please enter a number.");
                        continue;
                    }
                    System.out.println("Enter product price:");
                    double addPrice;
                    try {
                        addPrice = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid price. Please enter a number.");
                        continue;
                    }
                    ims.addProduct(new Product(addId, addName, addQuantity, addPrice));
                    System.out.println("Product added.");
                    break;
                case "update":
                    System.out.println("Enter product ID:");
                    String updateId = scanner.nextLine();
                    System.out.println("Enter product name:");
                    String updateName = scanner.nextLine();
                    System.out.println("Enter product quantity:");
                    int updateQuantity;
                    try {
                        updateQuantity = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid quantity. Please enter a number.");
                        continue;
                    }
                    System.out.println("Enter product price:");
                    double updatePrice;
                    try {
                        updatePrice = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid price. Please enter a number.");
                        continue;
                    }
                    ims.updateProduct(new Product(updateId, updateName, updateQuantity, updatePrice));
                    System.out.println("Product updated.");
                    break;
                case "delete":
                    System.out.println("Enter product ID:");
                    String deleteId = scanner.nextLine();
                    ims.deleteProduct(deleteId);
                    break;
                case "get":
                    System.out.println("Enter product ID:");
                    String getId = scanner.nextLine();
                    Product product = ims.getProduct(getId);
                    if (product != null) {
                        System.out.println("Product found: " + product);
                    } else {
                        System.out.println("Product not found.");
                    }
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
