import java.util.Scanner;

public class Exams {
    // create a banking app using java code(Object Oriented Programming)
    // classes required is not limited to: User, Account, ...
    // deposit funds
    // withdraw funds
    // transfer funds
    // check balances
    // enter their options
    // create(Current, Savings)
    public static void main(String[] args) {
        Menu();
        System.out.println(inputName());
        System.out.println(inputMoneyBalance());

        String name = inputName();
        double deposit = inputMoneyDeposited();
        double withdraw = inputMoneyWithdrew();
        double transfer = inputMoneyTransferred();
        double balance = inputMoneyBalance();
        balance = deposit -(withdraw + transfer);

    }

    static String inputName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        return (name);
    }

    static double inputMoneyDeposited() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount Deposited: ");
        double deposit = sc.nextDouble();
        return (deposit);
    }

    static double inputMoneyWithdrew() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount Withdrew: ");
        double withdraw = sc.nextDouble();
        return (withdraw);
    }

    static double inputMoneyTransferred() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount Transferred: ");
        double transfer = sc.nextDouble();
        return (transfer);
    }

    static double inputMoneyBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMoneyDeposited() - inputMoneyWithdrew() - inputMoneyTransferred());
        double balance = sc.nextDouble();
        return (balance);
    }


    static String display(String name, double deposit, double withdraw, double transfer, double balance) {
        return (display(name, deposit, withdraw, transfer, balance));
    }

    public static void Menu() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose what you want to do with your account");
            System.out.println("1.Deposit funds");
            System.out.println("2.Withdraw funds");
            System.out.println("3.Transfer funds");
            System.out.println("4.Check balance");
            System.out.println("5.Create an account");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("==============================================================================");
                    System.out.println(" Deposited money successfully" + inputMoneyDeposited());
                    break;
                case 2:
                    System.out.println("==============================================================================");
                    System.out.println("Withdrew money successfully" + inputMoneyWithdrew());
                    break;
                case 3:
                    System.out.println("==============================================================================");
                    System.out.println(" Money Transacted successfully" + inputMoneyTransferred());
                    break;
                case 4:
                    System.out.println("==============================================================================");
                    System.out.println("Your Balance is:" + inputMoneyBalance());
                    break;
                case 5:
                    System.out.println("==============================================================================");
                    System.out.println("1.Create a Current Account");
                    System.out.println("2.Create a Savings Account");
                    break;
            }
            } while (choice == 6);
        }
}
