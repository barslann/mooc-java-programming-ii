
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bekirarslan
 */
public class ShoppingCart {
    private Map<String,Item> map;
    

    public ShoppingCart() {
        map = new HashMap<>();
    }
    
    public void add(String product, int price){
        if (!(map.containsKey(product))) {
            this.map.put(product, new Item(product, 1,price));
        }else{
            this.map.get(product).increaseQuantity();
        }
    }
    
    public int price(){
        int total = 0;
        for (Item item : map.values()) {
            total = total + item.price();
        }
        return total;
    }
    
    public void print(){
        for (Item item : map.values()) {
            System.out.println(item);
        }
    }
    
}
