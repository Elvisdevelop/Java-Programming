import java.util.Scanner;

public class Number2 {
    // 0 - 1000g = 15.00
    // +500g = 8.00
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Weight: ");
//        weight = sc.nextDouble();

        double weight = 0;
        double price = 0;
        double priceRate = 15.00;

        if (weight <= 1000){
            System.out.println("You are required to pay: Ksh. " + priceRate);
        } else if (weight >1) {
            double unit = weight-1;
            double multiple = unit/0.5;
            double roundedMultiple = Math.ceil(multiple);
            double additionalCost = roundedMultiple*8;
            double totalCost = 15 + additionalCost;
            System.out.println("You are required to pay: Ksh. " + additionalCost);
        }
    }
}
