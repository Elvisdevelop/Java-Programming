import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the package in grams: ");
        double weightInGrams = scanner.nextDouble();

        double weightInKgs = weightInGrams / 1000.0;

        double charge = calculateShippingCharge(weightInKgs);
        System.out.println("The shipping charge is: Ksh" + charge);
    }

    public static double calculateShippingCharge(double weightInKgs) {
        double baseCharge = 15.0; // charge for the first 1 kg
        double additionalChargePer500g = 8.0; // charge for every 500g

        if (weightInKgs <= 1.0) {
            return baseCharge;
        } else {
            double additionalWeight = weightInKgs - 1.0;
            int additional500gUnits = (int) Math.ceil(additionalWeight * 2);
            return baseCharge + (additional500gUnits * additionalChargePer500g);
        }
    }

}
