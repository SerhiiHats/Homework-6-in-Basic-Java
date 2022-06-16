package animalAge;

public enum Animals {
    Dog(15),
    Cat(10),
    Horse(35),
    Lion(25),
    Tiger(30),
    Wolf(21),
    ;
    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals: " + this.name() +
                ", age: " + age;
    }
}
