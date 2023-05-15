import java.util.Scanner;

public class UnboundedLoop {
    public static void main(String[] args) {
        //      while (true){
        //           System.out.println("Hello Everyone");
        //      }
        // System.out.println("Hi");
        // The code is invalid

        //      while (false){
        //         System.out.println("Hello Everyone");
        //   }
        //    System.out.println("Hello");
        // This code is also invalid

        //  int a =10, b =20;
        // while (a < b){
        //      System.out.println("Hello,Everyone");
        //  }
        //  System.out.println("Great!!!");
        // This is an invalid code as it will print infinite times

        //      int a = 10, b = 20;
        //     while (a < b) {
        //        System.out.println("Hello");
        //   }

        //   System.out.println("Hi");
        // This is a valid code ->

        // Write a java program using a while loop to display integers 1 to 10
        //  int a = 1;

        //  while(a <= 10){
        //     System.out.println(a);
        //      a++;
        //  }

        // write a java program that will display 0, 5, 10, 15 20 using a while loop
        // int x = 0;

        //   while (x <= 20){
        //      System.out.println(x);
        //      x+=5;
        //  }

        // write a java program that will display 20 15 10 5  using a while loop
        //  int a = 20;

        //  while (a >= 5){
        //       System.out.println(a);
        //     a-=5;
        // }

        // write a java to accept integer from user and print the factorial of the number using while loop
        // factorial
        // 3! = 3 * 2 * 1 = 6
        // 5! = 5 * 4 * 3 * 2 * 1

        // create our scanner object
        Scanner sc = new Scanner(System.in);

        // declare our variables to use
        int factorial = 1;
        int number;
        int x = 1;

        // ask the user for the number
        System.out.println("Please Enter Number to calculate its factorial: ");
        number = sc.nextInt();

        // create a while loop to help in calculating the factorial of the number
        while (x <= number){
            factorial *= x;
            x ++;
        }

        // display the results here
        System.out.println("The factorial of " + number + "is: " + factorial);

    }
}