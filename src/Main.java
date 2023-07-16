import tema10.ex1.Basket;
import tema10.ex2.BuquetOfFlowers;
import tema10.ex3.Company;
import tema10.ex3.Person;

public class Main {
    public static void main(String[] args) {
        //ex1
        Basket cos = new Basket();
        System.out.println(cos.find("mar"));
        cos.add("mar");
        System.out.println(cos.find("mar"));
        cos.add("portocala");
        cos.remove("mar");
        cos.add("banana");
        System.out.println(cos.positin("portocala"));
        System.out.println(cos.distinct());
        cos.add("cirese");
        cos.add("zmeura");
        cos.add("zmeura");
        cos.add("zmeura");
        cos.add("zmeura");
        System.out.println(cos.count());
        System.out.println(cos.uniqueFruitsCount());
        //ex2
        BuquetOfFlowers buchet = new BuquetOfFlowers();
        buchet.add("lalele");
        buchet.add("narcise");
        buchet.add("trandafiri");
        buchet.add("crini");
        System.out.println(buchet.getAll());
        buchet.remove("crini");
        System.out.println(buchet.getAll());
        //ex3
        Person cosmin = new Person("Cosmin", 32, "manager");
        Person marcel = new Person("Marcel", 22, "sudor");
        Person laur = new Person("Laur", 33, "dulgher");
        Person andrei = new Person("Andrei", 45, "plumbar");
        Company greenTech = new Company();
        greenTech.employ(cosmin);
        greenTech.employ(laur);
        greenTech.employ(andrei);
        System.out.println(greenTech.getManager().getName());
        System.out.println(greenTech.getPersons("plumbar"));
        System.out.println(greenTech.getPersonsOlder(15));
        System.out.println(greenTech.getPerson("o"));

    }

}