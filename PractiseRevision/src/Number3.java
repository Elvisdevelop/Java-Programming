public class Number3 {
    int numberOfSweets;

    public Number3(int sweets){
        this.numberOfSweets = sweets;
    }

    public void displayNumberOfSweets(){
        double dozen = 12;
        double totalDozen = Math.floor(numberOfSweets/dozen);
        double leftOvers = numberOfSweets - (totalDozen*12) ;
        System.out.println(numberOfSweets + "Sweets is: " + totalDozen + "dozen and " +leftOvers + "left overs");
    }
    public static void main(String[] args) {
        Number3 sweets = new Number3(40);
        sweets.displayNumberOfSweets();
    }
}
