public class Main {
    public static void main(String[] args) {

        // Create an object from Human Class
        // instantiate class Human

        Human elvis = new Human();

        // Accessing class states or variables and assigning values to them
        elvis.name = "Elvis";
        elvis.age = 18;

        // call/access the class behaviors/methods
       // elvis.displayUserName();
       // elvis.displayUserAge();

//        Human Fridah = new Human();
//        Fridah.name = "Fridah";
//
//        Fridah.displayUserName();

        // create an instance of car class
//        String model;
//        String color;
//        int noOfSeats;
//        int noOfWheels;
//        String silver = "Silver";
//        Car demio = new Car(model:"Mazda", color:"Silver" noOfWheels:4, noOfSeats:4);
//        // demio.gearLevel = 2;
//        // demio.shiftGear();
//
        Car probox = new Car();

        System.out.println(probox.model);
        System.out.println(probox.color);
        System.out.println(probox.noOfDoors);
        System.out.println(probox.noOfWheels);
        System.out.println(probox.noOfSeats);
    }
}