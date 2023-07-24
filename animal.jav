// Step 1: Animal class as an abstract class
abstract class Animal {
    public abstract void sound(); // Every animal can make some noises
}

// Step 2: Flyable interface with fly() and glide() methods
interface Flyable {
    void fly();
    void glide();
}

// Step 3: Implementing Flyable in the Duck and Owl classes
class Duck extends Animal implements Flyable {
    @Override
    public void sound() {
        System.out.println("Duck says quack!");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying!");
    }

    @Override
    public void glide() {
        System.out.println("Duck is gliding!");
    }

    // Step 4: Adding the clean() method to the Duck class
    public void clean(Animal animal) {
        System.out.println(this.getClass().getSimpleName() + " is cleaning " + animal.getClass().getSimpleName());
    }
}

class Owl extends Animal implements Flyable {
    @Override
    public void sound() {
        System.out.println("Owl says hoot!");
    }

    @Override
    public void fly() {
        System.out.println("Owl is flying silently!");
    }

    @Override
    public void glide() {
        System.out.println("Owl is gliding!");
    }
}

// Step 5: Cow and Pig classes as subclasses of Animal
class Cow extends Animal {
    @Override
    public void sound() {
        System.out.println("Cow says moo!");
    }
}

class Pig extends Animal {
    @Override
    public void sound() {
        System.out.println("Pig says oink!");
    }
}

// Step 6: PekingDuck class that extends Duck and overrides the clean() method
class PekingDuck extends Duck {
    @Override
    public void clean(Animal animal) {
        System.out.println("I cannot clean. I died already.");
    }
}

public class Main {
    public static void main(String[] args) {
        Duck donald = new Duck();
        donald.clean(new Cow()); // Output: Duck is cleaning Cow

        PekingDuck daisy = new PekingDuck();
        daisy.clean(donald); // Output: I cannot clean. I died already.
    }
}
