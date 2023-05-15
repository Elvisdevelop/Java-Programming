import java.util.Arrays;
import java.util.Scanner;

public class InitializingArraysInJava {


    public static void main(String[] args) {
        // === initializing arrays ===
        // initializing using assignment using subscript or using index
        // initializing in one statement during creation

        // initializing using array.fill -> you need to import the arrays package in order to use the fill method.
        int numbers[] = new int[5];
        Arrays.fill(numbers, 10);

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Value of numbers[ " + i + "] is: " + numbers[i]);
            System.out.println("======================================================================================");
        }
        // initializing using for-loop
        int ages[] = new int[20];
        for (int i = 13; i <= ages.length - 1; i++){
            ages[i] = i + 1;
            System.out.println(i);
        }

        // initializing by taking the user input
        // prompt the user to enter 5 integers
        // use a for loop to assign these integers to an array (myArray)
        // print out the array elements
        int myArray[] = new int[5];


        // Import Scanner class
        Scanner input = new Scanner(System.in);

        // prompt the user to enter 5 integers
        System.out.println("Please enter 5 Integers:");

        // use a for loop to assign these integers to an array (myArray)
        for (int i=0; i < myArray.length; i++){
            myArray[i] = input.nextInt();
        }

        for (int i = 0; i < myArray.length; i++){
            System.out.println("Value of myArray[" + i + "] is: " + myArray[i]);
        }
    }
}
