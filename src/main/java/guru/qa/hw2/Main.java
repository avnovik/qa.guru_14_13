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


        TvBrands tvBrands = new TvBrands();
        tvBrands.printAll();
        tvBrands.addBrands("Sony");
        tvBrands.addBrands("LG");
        tvBrands.addBrands("Samsung");
        tvBrands.addBrands("LG");
        tvBrands.printAll();
        tvBrands.findBrand("TCL");
        tvBrands.findBrand("LG");
        tvBrands.deleteBrand("Samsung");
        tvBrands.printAll();

        Animals animals = new Animals();
        animals.addAnimals("Cat");
        animals.addAnimals("Rat");
        animals.addAnimals("Bat");
        animals.printAll();
        animals.removeAnimal(2);
        animals.printAll();
        animals.addInto(1,"fish");
        animals.printAll();
        animals.rename(2,"Dog");
        animals.printAll();
    }
}
