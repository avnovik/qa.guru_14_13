package guru.qa.hw2;

import java.util.Arrays;
import java.util.LinkedList;

public class Planets {

    LinkedList<String> planetList = new LinkedList<>();

    void addPlanets(String name) {
        planetList.add(name);
    }

    void addPlanetsArr(String[] name) {
        planetList.addAll(Arrays.asList(name));
    }

    void addFirst(String name) {
        planetList.addFirst(name);
    }

    void addLast(String name) {
        planetList.addLast(name);
    }

    void peekFirst() {
        planetList.peekFirst();
    }

    void peekLast() {
        planetList.peekLast();
    }

    void peekAndDeleteFirst() {
        System.out.println("Retrieves and removes the first element of this list: " + planetList.getFirst());
        planetList.pollFirst();
    }

    void peekAndDeleteLast() {
        System.out.println("Retrieves and removes the last element of this list: " + planetList.getLast());
        planetList.pollLast();
    }

    void printAll() {
        for (String text : planetList) {
            System.out.println(text);
        }
        System.out.println("---|---");
    }

}
