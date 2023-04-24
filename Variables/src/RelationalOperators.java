public class RelationalOperators {
    public static void main(String[] args){
        //2. relational operators -> are used to compare two operands and get a boolean
        // value. Output after using Relational Operators is always Boolean because they
        // are more of comparison type.

        // ==(equal to): This operator compares both the operands and returns to if both operands
        // are equal to each else it will return false.

        // !=(not equal to): This operator compares both the operands and returns false if both operands
        // are equal to each else it will return true.

        // <(less than): This operator compares both the operands and returns true if operand on the left
        // is less than the operand on the right hand side else it will return false.

        // >(greater than): This operator compares both the operands and returns true if operand on the left
        // is greater than the operand on the right hand side else it will return false.

        // >=(greater than or equal to): This operator compares both the operands and returns true if operand on the
        // greater is less than the operand on the right hand side else it will return false.

        // <=(less than or equal to): This operator compares both the operands and returns true if operand on the
        //left is less than the operand on the right hand side else it will return false.

        int num1 = 20;
        int num2 = 30;

        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 < num2);
        System.out.println(num1 > num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
    }
}
