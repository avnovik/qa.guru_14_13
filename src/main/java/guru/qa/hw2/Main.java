package guru.qa.hw2;

public class Main {
    public static void main(String[] args) {
        Storehouse storehouse = new Storehouse();
        storehouse.printAllProduct();
        storehouse.addNewItem("Bread", 10);
        storehouse.addNewItem("Tomato", 3);
        storehouse.printAllProduct();
        storehouse.findProduct("Tomato");
        storehouse.findProduct("Snickers");


    }
}
