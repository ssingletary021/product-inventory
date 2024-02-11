package main;
import inventory.Product;
import inventory.Inventory;
import inventory.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.productId = 123456;
        product.productName = "Cereal";
        product.price = 3.5;

        Inventory inventory = new Inventory();
        inventory.product = product;
        inventory.quantity = 100;

        Warehouse warehouse = new Warehouse();
        warehouse.warehouseId = 1212;
        warehouse.warehouseName = "South-side";
        warehouse.inventories = "How many cereal boxes?";

        System.out.println("Product ID: " + inventory.product.productId + ", Name: " + inventory.product.productName + ", Price: " + inventory.product.price);
        System.out.println("Inventory quantity: " + inventory.quantity);
        System.out.println("Warehouse ID: " + warehouse.warehouseId + ", Name: " + warehouse.warehouseName);

    }
}
