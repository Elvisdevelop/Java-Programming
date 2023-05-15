//2. Write the java program that calculates the area and circumference and the user should provide the radius of our program.
import java.util.Scanner;

class AreaOfACiricle  {
    //Declare the variables
    public static void main(String[] args) {
        double radius;
        double circumference;
        double area;
        // create scanner object
        Scanner in = new Scanner(System.in);

        //get the radius from the user
        System.out.println("Enter Radius of Circle:");

        // assign the radius to the radius variable
        radius = in.nextDouble();

        // compute the area and circumference
        area =radius * radius * Math.PI;

        // circumfrence = Pi D
        circumference = (radius+radius) * Math.PI;

        // Display the area and circumfrence in a nice format
        System.out.println("The Circumference of the circle is: "+ circumference);
        System.out.println("Area of Circle : " + area);
    }

}