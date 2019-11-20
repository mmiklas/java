public class AnimalsApp {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Filemon");
        animals[2] = new Pig("Prosiaczek");
        animals[3] = new Animal();

        for (Animal animal : animals) {
            animal.introduce();
        }
    }
}

class Animal {
    String name;

    Animal() {
        this.name = "bezimienny";
    }

    String showName() {
        return "zwierzę " + name;
    }
    String makeSound() {
        return "???";
    }

    void introduce() {
        System.out.println("Jestem " + showName() + ": " + makeSound());
    }
}

class Dog extends Animal {

    Dog(String name) {
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "hau hau";
    }

    @Override
    public String showName() {
        return "pies " + name;
    }
}

class Cat extends Animal {
    Cat(String name) {
        this.name = name;
    }
}

class Pig extends Animal {
    public Pig(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "świnka " + name;
    }

    @Override
    String makeSound() {
        return "hrum hrum";
    }
}