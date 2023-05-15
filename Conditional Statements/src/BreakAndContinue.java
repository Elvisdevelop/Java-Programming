public class BreakAndContinue {
    public static void main(String[] args) {
        // Break statement -> terminate code execution if sth is met
        for (int x = 1; x <= 10; x++){
            // check if x is = 5
            // if its =5, then stop the program
            if (x ==5){
                break;
            }
            System.out.println(x);
        }

        System.out.println("____________________________________________________________________________________");

        // continue
        for (int x = 1; x <= 10; x++){
            // check if x is = 5
            // if its =5, then stop the program
            if (x ==5){
                continue;
            }
            System.out.println(x);
        }

    }
}
