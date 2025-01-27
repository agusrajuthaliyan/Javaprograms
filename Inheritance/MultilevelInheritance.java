class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class GermanShepherd extends Dog {
    void guard() {
        System.out.println("Guarding");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        GermanShepherd germanShepherd = new GermanShepherd();
        germanShepherd.eat(); // Inherited from Animal
        germanShepherd.bark(); // Inherited from Dog
        germanShepherd.guard();
    }
}