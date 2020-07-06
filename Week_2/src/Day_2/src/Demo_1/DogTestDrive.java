package Demo_1;

public class DogTestDrive {
    public static void main(String[] args) {
        AnimalList animalLists = new AnimalList();
        Dog dog = new Dog();
        animalLists.add(dog);
        Animal animal = animalLists.get(0);
        if (animal instanceof Dog) {
            Dog dog1 = (Dog) animal;
            dog1.speak();
        }

    }
}
