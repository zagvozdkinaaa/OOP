package lab1.t5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> students;

    public DragonLaunch() {
        this.students = new Vector<>();
    }

    public void kidnap(Person p) {
        students.add(p);
    }

    public boolean willDragonEatOrNot (){
        int boysWaiting = 0;

        for (Person p : students){
            if (p.getGender() == Gender.BOY){
                boysWaiting++;
            } else {
                if (boysWaiting == 0){
                    return true;
                } else {
                    boysWaiting--;
                }
            }
        }

        return boysWaiting > 0;
    }

    public static void main(String[] args) {
        DragonLaunch dragon = new DragonLaunch();

        dragon.kidnap(new Person(Gender.GIRL));
        dragon.kidnap(new Person(Gender.BOY));
        dragon.kidnap(new Person(Gender.GIRL));
        dragon.kidnap(new Person(Gender.GIRL));

        System.out.println("Line: " + dragon.students);
        if (dragon.willDragonEatOrNot()) {
            System.out.println("Dragon will have a launch!");
        } else {
            System.out.println("No one left. Dragon is hungry!");
        }
    }
}

