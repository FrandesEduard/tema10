package tema10.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Basket {
    private List<String> fruits;

    public Basket() {
        fruits = new ArrayList<>();
    }

    public boolean find(String fruit) {
        return fruits.contains(fruit);
    }

    public boolean remove(String fruit) {
        return fruits.remove(fruit);
    }

    public int positin(String fruit) {
        return fruits.indexOf(fruit);
    }

    public Collection<String> distinct() {
        return new ArrayList<>(new HashSet<>(fruits));
    }

    public void add(String fruit) {
        fruits.add(fruit);
    }

    public int count() {
        return fruits.size();
    }

    public int uniqueFruitsCount() {
        int counter = 0;
        List<String> uniqueFruits = new ArrayList<>();

        for (String fruit : fruits) {
            if (!uniqueFruits.contains(fruit)) {
                uniqueFruits.add(fruit);
                counter++;
            }
        }
        return counter;

    }
}
