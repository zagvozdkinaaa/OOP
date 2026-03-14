package lab2.t5;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Zhuzha", 3);
        Cat cat = new Cat("Musya", 5);
        Bird bird = new Bird("Kesha", 2);
        Fish fish = new Fish("Nemo", 4);

        Employee emp1 = new Employee("John", 30, "Software Engineer");
        Student stu = new Student("Nastya", 19, "Information Systems", 3.7);
        PhDStudent phd = new PhDStudent("Alice", 26, "AI");
        Employee emp2 = new Employee("Daenerys", 25, "Data Scientist");

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(emp1);
        registry.addPerson(stu);
        registry.addPerson(phd);
        registry.addPerson(emp2);

        emp1.assignPet(dog);
        stu.assignPet(bird);
        phd.assignPet(dog);
        phd.assignPet(cat);
        emp2.assignPet(fish);

        System.out.println(registry);

        emp1.leavePetWith(phd);
        emp1.leavePetWith(stu);
        emp2.leavePetWith(emp1);

        System.out.println(registry);

        emp1.retrievePetFrom(stu);
        stu.retrievePetFrom(emp1);

        System.out.println(registry);

        System.out.println(dog.getSound());
        System.out.println(cat.getSound());
        System.out.println(bird.getSound());
        System.out.println(fish.getSound());

    }
}
