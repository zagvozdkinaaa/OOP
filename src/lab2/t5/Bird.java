package lab2.t5;

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }
    @Override public String getSound() {
        return "Tweet";
    }
}