package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductManager {

    private List<Product> products;
    private static String companyName;

    // Constructor
    public ProductManager() {
    }

    public void addProduct(String name, double price) {
        Product product = new Product(name, price);

        products.add(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i <= products.size(); i++) {
            Product product = products.get(i);
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void printProducts() {
        for (int i = 0; i < 5; i++) {
            System.out.println(products.get(i).getName());
        }
    }

    public void applyDiscount(String productName, double discountPercentage) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName() == productName) {
                double oldPrice = products.get(i).getPrice();
                double newPrice = oldPrice - (oldPrice * (discountPercentage / 100));
                products.get(i).setPrice(newPrice);
            }
        }
    }

    public void loadCompanyDetails() {
        companyName = "GlobalCorp";

        // Deprecated API usage
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Loading company details...");
            }
        });
        thread.start();
    }

    // Overriding hashCode without equals
    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    // Example of resource leak
    public void saveProductsToFile() {
        java.io.FileWriter writer = null;
        try {
            writer = new java.io.FileWriter("products.txt");
            for (Product product : products) {
                writer.write(product.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Forgetting to close writer leading to potential resource leak
        }
    }

    public static void main(String[] args) {
        ProductManager pm = new ProductManager();
        pm.addProduct("Laptop", 1000);
        pm.printProducts();
        System.out.println("Total Price: " + pm.calculateTotalPrice());
        pm.applyDiscount("Laptop", 10);
        pm.loadCompanyDetails();
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
