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

class PetDog extends Dog { 
    void play() {
        System.out.println("Playing");
    }
}

class GuideDog extends Dog { 
    void guide() {
        System.out.println("Guiding");
    }
}

public class HybridInheritance{
    public static void main(String[] args) {
        PetDog petDog = new PetDog();
        petDog.eat(); // From Animal
        petDog.bark(); // From Dog
        petDog.play(); 

        GuideDog guideDog = new GuideDog();
        guideDog.eat(); // From Animal
        guideDog.bark(); // From Dog
        guideDog.guide(); 
    }
}