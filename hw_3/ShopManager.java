package homework_Exception.hw_3;

import homework_Exception.hw_3.Exceptions.ProductNotFoundException;
import homework_Exception.hw_3.Exceptions.InsufficientQuantityException;

public class ShopManager{

    public static double purchaseProduct(int productId, int quantity)
            throws ProductNotFoundException, InsufficientQuantityException {
        Product product = ProductDataBase.getProduct(productId);

        if (product == null) {
            System.out.println("Error: Product not found.");
        }

        if (product.getAvailableQuantity() < quantity) {
            System.out.println("Error: Insufficient quantity available.");
        }

        double totalPrice = product.getPrice() * quantity;
        return totalPrice;
    }
}
