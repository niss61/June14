abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    void fly() {
        System.out.println("Eagle soars high in the sky!");
    }
}

class Penguin extends Bird {
    void fly() {
        System.out.println("Penguin cannot fly, but it swims!");
    }
}

public class BirdDemo {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();
        eagle.fly();
        penguin.fly();
    }
}