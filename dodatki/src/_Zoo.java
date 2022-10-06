public class _Zoo {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
    }
}

class Animal {
}

interface Voice {
}

class Cat extends Animal implements Voice {
}

class Dog extends Animal implements Voice {
}
