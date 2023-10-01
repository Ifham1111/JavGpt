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


        //The second example shows the use of Encapsulation -------------------------------

        /*
        The Treasure Chest

        In this example:

        The Treasure Chest is like a class. It contains something valuable (like gold, jewels, etc.), and it has a way to interact with it (open, close).

        The Lock is like encapsulation. It protects the contents of the treasure chest. Only those who have the key can open it.
        */

        Encasulation chest = new Encasulation();

        chest.putItem("Gold");
        chest.lock();
        chest.putItem("Silver");

        System.out.println("The chest contains " + chest.getItem());

        chest.unlock();
        chest.putItem("Silver");

        System.out.println("The chest contains " + chest.getItem());


    }
}