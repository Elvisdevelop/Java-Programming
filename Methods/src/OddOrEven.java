import java.util.Scanner;

public class OddOrEven {
    // write a java program that checks if a number is even or odd
    // (The number is passed to the method as a parameter)

    // create the method here
    static void OddOrEven(int num){
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        }else
        System.out.println(num + " is odd");

        return ;
    }
    // create the main method here and call the method inside it
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
    }
}
