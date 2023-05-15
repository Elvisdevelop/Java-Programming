import java.util.Scanner;

public class UnboundedDoWhileLoop {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

      //  int x = 1;

      //  String myName = null;

       // do {
         //   System.out.println("Please Enter Your Name:");
        //    myName = sc.next();
        //    System.out.println("My Name Is: " + myName);
       //     x ++;
       // } while (x <= 5);

        //write a do while loop that asks the user to enter two numbers.
        //        The numbers should be added and the sum displayed.
       // After adding and printing, the loop should ask whether he or she wishes to perform the operation again.
       // if so, the loop should repeat; Otherwise it should terminate.

        int input = 0;
        do {
            // Enter The First Number
            Scanner sc = new Scanner(System.in);
            System.out.print("Please Enter The First Number: ");
            int num1 = sc.nextInt();

            // Enter The Second Number
            System.out.print("Please Enter The second Number: ");
            int num2 = sc.nextInt();

            // calculate the sum of the 2 numbers
            int sum = num1 + num2;

            // display the 2 numbers
            System.out.println("The Sum is: " + sum);

            // prompt the user to continue or quit
            System.out.println("Enter option 1 to continue and option 2 to quit");
            input = sc.nextInt();

        } while (input != 2);
    }
}
