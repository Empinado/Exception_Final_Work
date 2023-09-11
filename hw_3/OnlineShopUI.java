package homework_Exception.hw_3;

import java.util.Scanner;
import homework_Exception.hw_3.Exceptions.ProductNotFoundException;
import homework_Exception.hw_3.Exceptions.InsufficientQuantityException;

public class OnlineShopUI {
    public static void main(String[] args) {

        Product p1 = new Product("BottleOfWater", 10, 120);
        System.out.println(p1);

        ProductDataBase.addProduct(p1);
        System.out.println(ProductDataBase.getProduct(1));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        try {
            double totalPrice = ShopManager.purchaseProduct(productId, quantity);
            System.out.println("Total price: $" + totalPrice);
        } catch (ProductNotFoundException e) {
            System.out.println("Error: Product not found.");
        } catch (InsufficientQuantityException e) {
            System.out.println("Error: Insufficient quantity available.");
        }finally{
            scanner.close();
        }

    }
}
