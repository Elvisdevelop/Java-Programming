import java.util.Random;
import java.util.Scanner;

public class Ticket {
    String ticketId;
    String user;
    double price;
    String seat;
    private Scanner randomNumber;

    //Method to generate a ticket if purchase was successful
    void to_pdf(){

    }

    void generateTicketId(){
        Random randomNumber = new Random();
        int low = 1;
        int high = 6;
        int ranNumber = randomNumber.nextInt();

        Scanner sc = new Scanner(System.in);


        // create a random number guesser game between 1 and 6
//        System.out.println("Hello User, guess a number between 1 and 6");
//       int userNumber = sc.nextInt();
//
//        if (userNumber == ranNumber){
//            System.out.println("Congrats, you guessed it correctly, The number was: ");
//        } else {
//            System.out.println("Sorry, you did not guess it correctly, The number was: " + ranNumber);
//        }

    }
}
