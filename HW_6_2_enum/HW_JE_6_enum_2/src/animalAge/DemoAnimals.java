package animalAge;

public class DemoAnimals {
    public static void main(String[] args) {
        for (Animals a : Animals.values()) {
            System.out.println(a.toString());
        }
    }
}
