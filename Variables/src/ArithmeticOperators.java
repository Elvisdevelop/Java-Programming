public class ArithmeticOperators {
    //Arithmetic Operators in Java
    //types of operators
    //1. arithmetic operators ->
    // + (Addition) - used to perform addition on two or more operands
    // - (Subtraction)- used to perform subtraction on two operands
    // * (Multiplication) - used to perform multiplication on two or more operands
    // / (division)- used to perform division on two operands
    // % (modulus)- return the reminder of the operation after division
    // ++(increment) - increments value by 1
    // -- (decrement) - decrements value by 1

    //increment and decrement operators in Java
    //increment operators are of 2 types
    //1. Pre increment -> value is incremented first and then assigned/used in an expression.
    //1. Post increment -> value is assigned/used first then incremented in an expression.

    //decrement operators are of 2 types
    //1. Pre decrement -> value is decremented first and then assigned/used in an expression.
    //1. Post decrement -> value is assigned/used first then decremented in an expression.



    //5. Conditional Operators
    // ?:
    public static void main(String[] args){
        //create two variables
        int x = 20;
        int y = 30;

        // Addition
        System.out.println(x + " + " + y +" = " + (x + y));
        //Subtraction
        System.out.println(x + " - " + y + " = " + (x - y));
        //Multiplication
        System.out.println(x + " X " + y + " = " + (x * y));
        //Division
        System.out.println(x + " / " + y + " = " + (x / y));
        //Modulus
        System.out.println(x + " % " + y + " = " + (x % y));
        //Increment
        System.out.println("x++ is: " + (x++) + " and y++ is:" + (y++));
        //Decrement
        System.out.println("x-- is: " + (x--) + " and y-- is:" + (y--));
        System.out.println(y);
    }


}