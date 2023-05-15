public class Card {
    String database;
    String cardType;
    long cardNumber;
    int cardCvc;
    String cardHolder;
    double balance;

    // constructor
    public Card(){
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardCvc = cardCvc;
        this.cardHolder = cardHolder;
        this.balance = balance;
    }

    double validate(double price){
        if (balance > 0 ){
            return balance;
        }
        return 0;
    }
}
