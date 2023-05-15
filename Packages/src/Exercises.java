import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("A Java Program to check the largest number out of the three numbers");
        Scanner sc = new Scanner(System.in);

        // prompt the user for the three numbers
        System.out.println("Please Enter Three Numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("The Greatest NUmber is: " + findGreatestNumber(num1, num2, num3));
    }
        // check which number is the greatest amongst the three
        public static int findGreatestNumber(int num1, int num2, int num3 ){
        int greatest = 0;
        if(num2 > num1 && num1 > num3){
            greatest =num1;
        } else if(num3 > num1 && num2 > num3){
            greatest = num2;
        } else if(num3 > num1 && num3 > num2){
             greatest = num3;
        }
        return greatest;

    }

}
