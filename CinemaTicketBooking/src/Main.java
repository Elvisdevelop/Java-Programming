import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = null;
        String FullName = null;
        User user = new User(FullName);
        Seat seat = new Seat();
        seat.is_free();
        seat.occupy(card);
        Ticket ticket = new Ticket();
        ticket.generateTicketId();


//        System.out.print(" Your full name : ");
//        name = input.next();
//
//        System.out.print("Preferred seat number : ");
//        String seatNumber = input.next();
//
//        System.out.print("Your Card type : ");
//        String cardType = input.next();
//
//        System.out.print("Your card Number : ");
//        long cardNumber = input.nextLong();
//
//        System.out.print("Your card CVC : ");
//        int cardCvc = input.nextInt();
//
//        System.out.print("Your card holder name : ");
//        String cardHolder = input.next();
//
//        System.out.print("Your card Amount : ");
//        double Price = input.nextDouble();
//
//        if (Price < 1000) {
//            System.out.print("Insufficient Amount !  " +
//                    "Cannot get seat");
//        } else {
//            System.out.print("Purchase successful!!!!!!");
//        }

    }
}