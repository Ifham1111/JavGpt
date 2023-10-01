public class Car {
    String color;
    int speed;

    void startEngine() {
        System.out.println("Start engine");
    }

    void stopEngine() {
        System.out.println("Stop engine");
    }

    void accelerate(int amount) {
        speed += amount;
        System.out.println("The " + color + " car is now going at " + speed + " units of speed.");
    }

    void brake(int amount) {
        speed -= amount;
        if (speed < 0) speed = 0; // Make sure speed doesn't go negative
        System.out.println("The " + color + " car slowed down to " + speed + " units of speed.");
    }
}
