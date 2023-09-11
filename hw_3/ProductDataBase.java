package homework_Exception.hw_3;

import java.util.HashMap;
import java.util.Map;

public class ProductDataBase {
    private static Map<Integer, Product> products = new HashMap<>();
    private static int nextProductId = 1;

    public static void addProduct(Product product) {
        int productId = nextProductId++;
        products.put(productId, product);
    }

    public static Product getProduct(int productId) {
        return products.get(productId);
    }
}
