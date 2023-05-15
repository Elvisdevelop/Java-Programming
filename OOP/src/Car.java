public class Car {
    // class state/variables/properties/members
    String color;
    String model;
    int noOfWheels;
    int noOfDoors;
    int noOfSeats;
    int horsepower;
    int gearLevel = 0;

    // class constructor
    public Car(){
        this.model = "Toyota";
        this.color = "White";
        this.noOfDoors = 4;
        this.noOfWheels = 4;
        this.noOfSeats = 5;
    }

    //methods/behavior/actions/etc
    public void shiftGear(){
        gearLevel++;
        System.out.println("You are on Gear: "+ gearLevel);
    }

    public void engageBreak(){

    }

    public void accelerate(){

    }
    public Car(String model, String color, int noOfWheels, int noOfSeats){
        this.model = model;
        this.color = color;
        this.noOfWheels = noOfWheels;
        this.noOfSeats = noOfSeats;
    }
}
