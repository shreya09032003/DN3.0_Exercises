package WEEK1_DSA.EcommercePlatform;

import java.util.Arrays;

public class ECommerceSearch {

    public static int linearSearch(Product[] products, String searchTerm) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId().equals(searchTerm) ||
                products[i].getProductName().equals(searchTerm) ||
                products[i].getCategory().equals(searchTerm)) {
                return i;
            }
        }
        return -1; // Not found
    }

    public static int binarySearch(Product[] products, String searchTerm) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId().equals(searchTerm) ||
                products[mid].getProductName().equals(searchTerm) ||
                products[mid].getCategory().equals(searchTerm)) {
                return mid;
            }
            if (searchTerm.compareTo(products[mid].getProductId()) < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Coffee Maker", "Appliances")
        };

        // Linear Search Test
        System.out.println("Linear Search:");
        int indexLinear = linearSearch(products, "Smartphone");
        System.out.println(indexLinear != -1 ? products[indexLinear] : "Product not found");

        // Binary Search Test
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));
        System.out.println("Binary Search:");
        int indexBinary = binarySearch(products, "Coffee Maker");
        System.out.println(indexBinary != -1 ? products[indexBinary] : "Product not found");
    }
}
