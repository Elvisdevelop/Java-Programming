public class AssignmentOperators {
    public static void main(String[] args) {
        //4.Assignment operators in java
        // =(assignment operator) : this operator assigns the value on the RHS to the
        // variable on the LHS.
        // += : Can be used as a short form of (a = a + b); so using this operator we can
        // rewrite the above statement as(a += b)
        // -= :  Can be used as a short form of (a = a - b); so using this operator we can
        //rewrite the above statement as(a -= b)
        // *= :  Can be used as a short form of (a = a * b); so using this operator we can
        //rewrite the above statement as(a *= b)
        // /= :  Can be used as a short form of (a = a / b); so using this operator we can
        //rewrite the above statement as(a /= b)
        // %= :  Can be used as a short form of (a = a % b); so using this operator we can
        //rewrite the above statement as(a %= b)

        int a = 2;
        int b = 3;

        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);
        System.out.println();
    }
}
