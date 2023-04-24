public class LogicalOperators {
    public static void main(String[] args) {
        //logical operators --There are thee types of logical operators in java
        //&&(and operator) => Returns true if both operators are true
        //||(or operator) => Returns trues if any of the operands are true
        //!(not operator) => Works with one operator and reverses the boolean value

        //create two variables
        int a = 50;
        int b = 30;

        System.out.println((a > b) && (b > a));
        System.out.println((b < a) || (a > b));
        System.out.println();
    }
}

