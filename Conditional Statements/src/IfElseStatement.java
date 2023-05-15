import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args) {
        // if the ... else in java

        // if statement
        // You may face scenarios where you might want to execute certain block of code
        // based on certain condition, this is where if else statement comes to the picture

        // syntax for if statement
        // if (condition) {
        // code to be executed if the condition is true
        // }

        // Here, the statements within the braces are executed if the condition is true,
        // however, if the condition is false the code is skipped.

        int age = 18;
        // check if age is below 18 -> display. You are an underage

        if (age < 18) {
            System.out.println("Sorry, you are below 18 years.");
        }
        if (age < 18) {
            System.out.println("Sorry, you are below 18 years.");
        }

        int temp = 18;
        if (temp > 25) {
            System.out.println("Please uncover your tomatoes .");
        }

        // if ... else
        // There might be scenarios, where you might want to execute certain code if
        // the condition is false
        // Now in this case, you can use if with else statement

        // syntax of if statements in java
        //if(condition) {
        // code to be executed if the condition is true
        // } else{
        // code to be executed if the condition is false
        // }

        String favFruit = "Avocado";

        //if (favFruit != "Avocado") {
           // System.out.println("Your favorite fruit is Avocado.");
       // } else {
          //  System.out.println("Your favorite fruit is Apple.");
        //}

        // write a java software for banks which will allow users above 21 years of
        // age to sign up ad create an account. if the user is below 21 years of age
        // don't allow them to create an account.
        // Ineligible -> below 21
        // test it with sampleInput1 = 18 -> sampleInput2 -> 25

        // create age of user
        int userAge;

        //create the scanner object
        Scanner sc = new Scanner(System.in);

        //get the age and assign the underage available
        userAge = sc.nextInt();

        //get is
        System.out.println("Write your age: ");
        // check if the user is eligible -> Yes -> allow them to create an account
        if (userAge > 21){
            System.out.println("You are eligible!!");
        } else {
            System.out.println("Sorry, You are eligible!!");
        }
    }
}
