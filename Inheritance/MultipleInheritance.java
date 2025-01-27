interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable {
    public void fly() {
        System.out.println("Flying");
    }
}

class Fish implements Swimmable {
    public void swim() {
        System.out.println("Swimming");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Fish fish = new Fish();
        fish.swim();
    }
}