package guru.qa.hw2;

import java.util.HashMap;
import java.util.Map;

public class Storehouse {

    Map<String, Integer> storehouse = new HashMap<>();

    void addNewItem(String name, int num) {
        storehouse.put(name, num);
    }

    void printAllProduct() {
        if (storehouse.isEmpty()) {
            System.out.println("Warehouse is empty");
        } else {
            for (Map.Entry<String, Integer> pair : storehouse.entrySet()) {
                String key = pair.getKey();
                int value = pair.getValue();
                System.out.println(key + ": " + value);
            }
        }
    }

    void findProduct(String name) {
        if (storehouse.containsKey(name)) {
            System.out.println("The product \"" + name + "\" is in stock.");
        } else {
            System.out.println("Product out of stock.");
        }
    }
}
