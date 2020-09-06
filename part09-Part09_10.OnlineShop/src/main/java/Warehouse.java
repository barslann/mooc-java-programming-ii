
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bekirarslan
 */
public class Warehouse {

    private Map<String, Integer> product;
    private Map<String, Integer> productStock;

    public Warehouse() {
        product = new HashMap<>();
        productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.product.put(product, price);
        this.productStock.put(product, stock);
    }

    public int price(String product) {
        return this.product.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.productStock.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (this.productStock.containsKey(product) && this.productStock.get(product) - 1 >= 0) {
            this.productStock.put(product, this.productStock.get(product) - 1);
            return true;
        }

        return false;
    }

    public Set<String> products() {
        Set<String> keys = this.product.keySet();
        
        return keys;
    }

}
