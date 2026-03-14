package lab2.t5;

class PhDStudent extends Person {
    private String researchTopic;

    public PhDStudent(String name, int age, String topic) {
        super(name, age);
        this.researchTopic = topic;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("PhD Student can't have a dog!");
        } else {
            super.assignPet(pet);
        }
    }

    @Override public String getOccupation() { return "PhD Student researching " + researchTopic; }
}
