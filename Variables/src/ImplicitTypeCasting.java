public class ImplicitTypeCasting {
    public static void main(String[] args){
        //let's start with an example
        byte b = 100;
        int x = b;
        System.out.println("Value of x:" + x);

        // Do you think this is a valid Java Program?
        // Ans: Yes it is a valid Java program
        // what happened here is internally byte type of value was automatically
        // promoted to int type sinced we assigned it to int.

        // Byte here has a smaller size than that of int. byte is of 1 byte and
        // int is for 4 bytes.
        // Since the size of target datatype is large, we did not get any error on
        // assignment.
        // This is known as implicit type cating in java where the value of the smaller
        // datatype is assigned and converted to the value of the bigger datatype.
        // implicit casting is done by the compiler.
        // since the range of the smaller datatype is within the range of the
        // larger datatype.
        // This is also known as widening or upcasting

        // possible conversions where implicit casting is performed:-
        // byte -> short -> int -> long -> float -> double
        // char -> int

        int i = 100;
        double d = i;
        System.out.println("Value of d is: " + d);

        char c = 'a';
        int r = c;
        System.out.println("Value of r is: " + r);
    }
}
