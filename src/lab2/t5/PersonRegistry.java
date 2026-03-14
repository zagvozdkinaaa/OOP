package lab2.t5;

import java.util.Vector;

public class PersonRegistry {
    private Vector <Person> people = new Vector<>();

    public void addPerson(Person p) { people.add(p); }

    public void deletePerson(Person p) { people.remove(p); }

    public void findPeopleWithPets() {
        for (Person p : people) {
            if (p.hasPet()) {
                System.out.println(p);
            }
        }
    }

    public void findPeopleWithoutPets() {
        for (Person p : people) {
            if (!p.hasPet()) {
                System.out.println(p);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Registry:\n");
        for (Person p : people) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
