package Demo_1;

public class AnimalList {
    private Animal[] animals = new Animal[3];
    private int nextIndex = 0;

    public Animal get(int n) {
        return this.animals[n];
    }

    public void add (Animal animal) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = animal;
            System.out.println("Animal added at " + nextIndex);
            nextIndex++;
        }
    }
}
 class Animal {
    public void getSpeak() {
        System.out.println("ABC");
    }
}
class Dog extends Animal {
    public void speak() {
        System.out.println("gau");
    }
}