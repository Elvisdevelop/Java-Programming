import java.util.Scanner;

public class ClassesAndObjects {
    // Conceptual Overview -> Classes and objects in java

    // What are Objects?
    // Objects are anything that you see around you e.g house, chair, table
    // bed, etc
    // Every object has a state and a behavior

    // Example:
    // If we consider a person as an example,
    // state of the person will be:-> (variable or property)
    //1. complexion
    //2. height
    //3. weight
    //4. eyes color

    // Similarly, the behavior will be:-> (actions or methods)
    //1. walking
    //2. laughing
    //3. crying
    //4. running

    // What are classes?
    // Classes are nothing but a blueprint to define an object.

    // Here is an example of user class with certain state and behavior
    // classes also contain:
    //1. variables
    //2. Methods
    //3. interfaces
    //4. member class
    //5. constructors

    // new keyword and memory allocation in java
    // What happens when you create a variable?
    // Let's say you've declared a variable "a" as an integer for using it in your
    // program. When you do so, java compiler allocate memory space corresponding
    // to 4 bytes of space. (size of integer = 4bytes) and allocates it to the
    // variable that you've just declared.

    // Now whenever you assign a value to this variable, it sits in this memory block.

    // Objects creation in java has 2 types:
    //1. Object declaration
    // syntax: class-name  object-name; Scanner sc
    // here an object is declared and a reference variable is created in
    // memory. However, memory allocation

    //2. Object creation and memory allocation
    // syntax: object-name = new -> class-name();
    // Here memory for the declared object is created using a new operator.
    // Objects can be used only after memory is allocated to them.
    // You can't use the objects without allocating the memory.
    // Compiler will throw an error

    class Car{
        // class state/variables/properties/members
        String color;
        int noOfWheels;
        int noOfDoors;
        int noOfSeats;
        int horsepower;

        //methods/behavior/actions/etc
        public void shiftGear(){

        }

        public void engageBreak(){

        }

        public void accelerate(){

        }

    }
}
