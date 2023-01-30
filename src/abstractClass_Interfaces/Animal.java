package abstractClass_Interfaces;

abstract class Animal {

    // abstract method
    public abstract String howToEat();

    public static void eat(Animal animal) {
        System.out.println(animal.howToEat());
    }

    public static void main(String[] args) {

        Animal animal = new Chicken();
        eat(animal);

        animal = new Duck();
        eat(animal);
    }
}

// define two subclasses of Animal
class Chicken extends Animal {
    @Override
    public String howToEat() {
        return "Fry it";
    }
}

class Duck extends Animal {
    @Override
    public String howToEat() {
        return "Roast it";
    }
}


