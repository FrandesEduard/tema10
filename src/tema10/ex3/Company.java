package tema10.ex3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Person> persons;

    public Company() {
        persons = new ArrayList<>();
    }

    public Person getManager() {
        for (Person person : persons) {
            if (person.getPosition().equals("manager")) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPersons(String profession) {
        List<Person> matchingPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getPosition().equalsIgnoreCase(profession)) {
                matchingPersons.add(person);
            }
        }
        return matchingPersons;
    }
    public List<Person> getPersonsOlder(int age) {
        List<Person> olderPersons = new ArrayList<>();
        for (Person person : persons) {
            if (age < person.getAge()) {
                olderPersons.add(person);
            }
        }
        return olderPersons;
    }

    public List<Person> getPerson(String filterName) {
        List<Person> filter = new ArrayList<>();
        for (Person person : persons) {
            if (person.getName().contains(filterName)) {
                filter.add(person);
            }
        }
        return filter;
    }
    public void employ(Person person) {
        persons.add(person);
    }
}
