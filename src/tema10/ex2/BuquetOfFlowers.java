package tema10.ex2;

import java.util.*;

public class BuquetOfFlowers {
    private Set<String> flowers;

    public BuquetOfFlowers(){
        flowers = new HashSet<>();
    }
    public Collection<String> getAll() {
        return new ArrayList<>(new HashSet<>(flowers));
    }

    public void add(String flower){
        flowers.add(flower);
    }

    public void remove(String flower){
        flowers.remove(flower);
    }
}
