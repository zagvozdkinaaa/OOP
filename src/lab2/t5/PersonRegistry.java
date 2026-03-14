package lab2.t5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person p) { people.add(p); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Registry contents:\n");
        for (Person p : people) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
