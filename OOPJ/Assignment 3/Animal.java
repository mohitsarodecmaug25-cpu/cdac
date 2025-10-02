class Animal {
    public void makeSound() { System.out.println("Some sound"); }
}

class Dog extends Animal {
    @Override public void makeSound() { System.out.println("Dog -> Bark"); }
}

class Cat extends Animal {
    @Override public void makeSound() { System.out.println("Cat -> Meow"); }
}

public class Assignment9_AnimalSound {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();
        d.makeSound();
        c.makeSound();
    }
}
