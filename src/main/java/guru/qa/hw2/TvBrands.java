package guru.qa.hw2;

import java.util.HashSet;
import java.util.Set;

public class TvBrands {

    Set<String> tvBrands = new HashSet<>();

    void addBrands(String name) {
        tvBrands.add(name);
    }

    void printAll(){
        if(tvBrands.isEmpty()){
            System.out.println("The list is empty.");
        } else {
            for (String text : tvBrands) {
                System.out.println(text);
            }
        }
    }

    void findBrand(String name){
        if (tvBrands.contains(name)){
            System.out.println(name + ", in list");
        } else {
            System.out.println(name + " not found");
        }
    }

    void deleteBrand(String name) {
        if (tvBrands.contains(name)){
            tvBrands.remove(name);
            System.out.println(name + " delete");
        } else {
            System.out.println(name + " not found");
        }

    }
}
