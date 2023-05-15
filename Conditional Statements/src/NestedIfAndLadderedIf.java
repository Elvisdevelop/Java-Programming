import java.util.Scanner;

public class NestedIfAndLadderedIf {
    public static void main(String[] args) {
        // nested if and laddered if

        // laddered if...else...if
        // laddered if...else...if is used when there are multiple conditions to test
        // in a single if...else...is

        //syntax
        //if(condition){
            //execute code when condition1 is true
        //} else if(condition2){
            //execute code when condition2 is true(condition1 is false)
        //} else if(condition3){
            //execute code when condition3 is true(condition1 and condition2 are false)
       // } else{
            //executes when none of the above conditions is true
       // }

        int dayOfTheWeek;


        //create the scanner object
        Scanner sc = new Scanner(System.in);

        //get the age and assign the underage available
        dayOfTheWeek = sc.nextInt();

        //get is
        System.out.println("Write the day of the week: ");

        if (dayOfTheWeek == 1){
            System.out.println("Today is on Sunday");
        } else if (dayOfTheWeek == 2) {
            System.out.println("Today is on Monday");
        } else if (dayOfTheWeek == 3) {
            System.out.println("Today is on Tuesday");
        } else if (dayOfTheWeek == 4) {
            System.out.println("Today is on Wednesday");
        } else if (dayOfTheWeek == 5) {
            System.out.println("Today is on Thursday");
        } else if (dayOfTheWeek == 6) {
            System.out.println("Today is on Friday");
        } else if (dayOfTheWeek == 7) {
            System.out.println("Today is on Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
