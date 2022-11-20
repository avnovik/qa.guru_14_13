package guru.qa.hw2;

import java.util.ArrayList;
import java.util.List;

public class Animals {

    List<String> animals = new ArrayList<>();

    void addAnimals(String name) {
        animals.add(name);
    }

    void printAll() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
        System.out.println("---");
    }

    void whatIndex(String name) {
        if (animals.contains(name)) {
            int indexOf = animals.indexOf(name);
            System.out.println("whatIndex: " + name + " --> " + indexOf);
        } else {
            System.out.println("ALARM!!!");
        }
    }

    void removeAnimal(int index) {
        if (index >= 0 && index < animals.size()) {
            System.out.println("Delete: " + animals.get(index));
            animals.remove(index);
            System.out.println("---");
        } else {
            System.out.println("ALARM!!!");
        }
    }

    void addInto(int index, String name) {
        if (index >= 0 && index <= animals.size()) {
            animals.add(index, name);
        } else {
            System.out.println("ALARM!!!");
        }
    }

    void rename(int index, String name) {
        if (index >= 0 && index < animals.size()) {
            System.out.println("Change: " + animals.get(index) + " --> " + name);
            animals.set(index, name);
            System.out.println("---");
        } else {
            System.out.println("ALARM!!!");
        }
    }
}
