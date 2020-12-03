package tutorial;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    private Warehouse warehouse;
    private List<String> productList;

    public ShoppingCart(Warehouse warehouse) {
        this.warehouse = warehouse;
        this.productList = new ArrayList<>();
    }

    public void addOne(String product) {
	    if (warehouse.availableQty(product) > 0) {
            warehouse.reserveProduct(product);
            productList.add(product);
        } else {
	        throw new IllegalArgumentException("Not enough qty left of product: " + product);
        }
    }

    public void removeOne(String product) {
        if (productList.contains(product)) {
            productList.remove(product);
            warehouse.addProduct(product, 1);
        } else {
	        throw new IllegalArgumentException("Product not in cart: " + product);
        }
    }
}
