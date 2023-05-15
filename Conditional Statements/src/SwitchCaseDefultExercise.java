import java.util.Scanner;

public class SwitchCaseDefultExercise {
    public static void main(String[] args) {
        //Write a java program to accept the grade of the student from the console and
       // congratulate him/her.
        // Required to use Switch Case Statement

      //  if the grade is 'A', print 'Excellent'
      //  if the grade is 'B', print 'Amazing'
       // if the grade is 'C', print 'Well Done'
       // if the grade is 'D', print 'You Can Do Better Next Time'
       // if the grade is anything else apart from above, print 'Invalid Grade Entered'

        // solution

        // Don't forget to import the scanner class

        // create a scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Grade: ");

        char grade = sc.next().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Amazing");
                break;
            case 'C':
                System.out.println("Well Done");
                break;
            case 'D':
                System.out.println("You Can Do Better Next Time");
                break;
            case 'E':
                System.out.println("Umejaribu Mjengo");
                break;
            default:
                System.out.println("Invalid Grade Entered!!");
        }

    }
}
