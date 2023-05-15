public class Seat {
    String database;
    String seat_id = "B5";
    double price = 1000;
    boolean availability = true;
    String card;

    //Seat method to check if a seat is free or taken
       String is_free(){
//        if (availability == true)
//            System.out.println("Seat No: " + seat_id + " is Available.");
//        System.out.println("You can now proceed to book it");
           String seatStatus = null;
           if (availability ==true){
               seatStatus = "free";
           } else{
               seatStatus = "taken";
           }

           return seatStatus;
    }
    //Seat method to occupy a seat if it is not taken
    void occupy(Card card){
//        System.out.println("Seat No: " + seat_id + "is Not Available.");
        if (is_free() == "free"){
            System.out.println("Check if you have money to purchase the seat");
            if (card.validate() >= price){
                double balance = card.validate();
                availability = false;
                card.balance = balance - price;
                System.out.println("Purchase of Seat: " + seat_id + " was successful");
                System.out.println("Your new Balance is: " + card.balance);
                System.out.println("==================================================================================");
            } else{
                // if no money in account , Tell the user they have no funds to purchase the seat
                System.out.println("There was a problem with your card.");
            }
        } else{
            System.out.println("Seat is Taken");
        }
    }
}
