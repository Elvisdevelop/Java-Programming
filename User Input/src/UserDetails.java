import java.util.Scanner;
public class UserDetails {
    // Write me a Java Program that prompts the user to enter their name, gender and age. Then display a nice output.
    // Hello Elvis. You are a male student, and you are 18 years old.
    public static void main(String[] args) {
        // create your variables
        String userName;
        String userGender = null;
        int userAge;
        // instantiate the scanner object
        Scanner sc = new Scanner(System.in);

        // prompt the user to enter their name
        System.out.print("Please enter your name: ");
        // get the name of the user and assign it to username variable
        userName = sc.next();

        // prompt the user to enter their gender
        System.out.print("Enter your Gender too: ");
        // get the gender of the user and assign it to the userGender available

        // prompt the user to enter their age
        System.out.print("Enter your Age too: ");
        // get the gender of the user and assign it to the userAge available
        userAge = sc.nextInt();

        // display the output in a nice format
        System.out.println("Hello " + userName + ",Elvis. You are a " + userGender + "student and you are " + userAge + " years old.");

    }
}
