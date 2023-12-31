public class Main {
    public static void main(String[] args) {

        //The first examples shows basic understanding of the Class, object and methods ----
        Car myCar = new Car();
        myCar.color = "Blue";
        myCar.speed = 60;

        Car yourCar = new Car();
        yourCar.color = "Red";
        yourCar.speed = 70;

        myCar.startEngine();
        myCar.accelerate(20);
        myCar.brake(10);
        myCar.stopEngine();

        yourCar.startEngine();
        yourCar.accelerate(30);
        yourCar.brake(15);
        yourCar.stopEngine();

        //End of first example -----------------------------------------------------------
    }
}