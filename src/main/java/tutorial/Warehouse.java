package tutorial;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
	private Map<String, Integer> productQtyMap;

	public Warehouse() {
		this.productQtyMap = new HashMap<>();
	}

	public int availableQty(String product) {
		return productQtyMap.getOrDefault(product, 0);
	}

	public int reserveProduct(String product) { 
		if (availableQty(product) > 0) {
			int currentQty = availableQty(product);
			productQtyMap.put(product, currentQty - 1); 
		}

		return availableQty(product);
	}

	/**
	 * This method should be called to fill the warehouse with products,
	 * and to make a reserved product in the cart available again
	 * 
	 * @param product
	 * @param qty
	 */
	public int addProduct(String product, int qty) {
		if (qty <= 0)
			throw new IllegalArgumentException("Qty must be positive");
		
		if (productQtyMap.containsKey(product)) {
			int currentQty = availableQty(product);
			productQtyMap.put(product, currentQty + qty);
		} else {
			productQtyMap.put(product, qty);
		}

		return availableQty(product);
	}

}
