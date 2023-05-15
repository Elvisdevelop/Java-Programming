import java.util.ArrayList;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();

        // Create some sample users and accounts
        User user1 = new User("John", "Doe", "johndoe@example.com", "password123");
        user1.createAccount(AccountType.CURRENT);
        user1.createAccount(AccountType.SAVINGS);

        User user2 = new User("Jane", "Doe", "janedoe@example.com", "password456");
        user2.createAccount(AccountType.CURRENT);

        users.add(user1);
        users.add(user2);

        // Login
        System.out.println("Welcome to the banking app!");

        User currentUser = null;

        while (currentUser == null) {
            System.out.print("Enter your email address: ");
            String email = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            for (User user : users) {
                if (user.login(email, password)) {
                    currentUser = user;
                    System.out.println("Login successful.");
                    break;
                }
            }

            if (currentUser == null) {
                System.out.println("Invalid email or password. Please try again.");
            }
        }

        // Main menu
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Deposit funds");
            System.out.println("2. Withdraw funds");
            System.out.println("3. Transfer funds");
            System.out.println("4. Check balances");
            System.out.println("5. Create account");
            System.out.println("6. Logout");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter account ID: ");
                    int accountId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter amount to deposit: ");
                    double amount = Double.parseDouble(scanner.nextLine());

                    currentUser.deposit(accountId, amount);
                    break;
                case 2:
                    System.out.print("Enter account ID: ");
                    accountId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter amount to withdraw: ");
                    amount = Double.parseDouble(scanner.nextLine());

                    currentUser.withdraw(accountId, amount);
                    break;
                case 3:
                    System.out.print("Enter recipient's email address: ");
                    String recipientEmail = scanner.nextLine();

                    System.out.print("Enter account ID to transfer from: ");
                    int sourceAccountId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter account ID to transfer to: ");
                    int destinationAccountId = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter amount to transfer: ");
                    amount = Double.parseDouble(scanner.nextLine());

                    currentUser.transfer(recipientEmail, sourceAccountId, destinationAccountId, amount, users);
                    break;
                case 4:
                    currentUser.checkBalances();
                    break;
                case 5:
                    System.out.println("Which type of account would you like to create? (1. Current, 2. Savings)");
                    int accountChoice = Integer.parseInt(scanner.nextLine());

                    AccountType accountType;

                    switch (accountChoice) {
                        case 1:
                            accountType = AccountType.CURRENT;
                            break;
                        case 2:
                            accountType = AccountType.SAVINGS;
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            continue;
                    }

                    currentUser.createAccount(accountType);
                    break;
                case 6:
                    System.out.println("Logging out...");
                    return;
                default:
