import java.util.Scanner;

//Liquid Volume Calculator
    // Please write a function that calculates the liquid volume in a sphere using the following formula
    // The Radius r is always 10, so consider making it a defult parameter
    // You can then test the solution by passing 2 for h and you should get 4071.5040790523717
    // volume = ((4 * pi * r ** 3) / 3) - (pi * h**2 * (3*r -h)/3)
public class LiquidVolumeCalculator {
        public static void main(String args[]){
        double height;
        double radius ;
        double pi = Math.PI;
        double volume ;

        // create the scanner object
        Scanner sc = new Scanner(System.in);
        // prompt the user to get the height and radius
            System.out.println("Please enter the radius of the sphere: ");
        // get the radius of the sphere
            radius = sc.nextDouble();
            System.out.println("Please enter the height of the sphere: ");
        // get the height of the sphere
        height = sc.nextDouble();

        // calculate the volume of the sphere
            volume =((4 * pi * (radius * radius * radius) / 3) - (pi * height) * (3 * radius - height)/3);
        // display the volume of the sphere
        System.out.println("The liquid volume of a sphere with a radius and height of: " + radius + "radius" + height + "resp. is " + volume);
    }
}
