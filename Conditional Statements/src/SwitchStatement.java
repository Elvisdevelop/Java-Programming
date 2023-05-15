import java.util.Scanner;

class SwitchStatements {
    public static void main(String[] args) {
        // switch statements in java

        // switch statement is a statement in java that allows you to execute
        // the statement based on a certain value in a variable or expression

        // syntax
        // switch (variable/expression){
        //        case1:
        //              statement;
        //            break;
        //        case2:
        //              statement;
        //            break;
        //        default:
        //               statement;
        //
        //    }

        //example 1

        // int age = 10;

        //switch (age){
        // case 21:
        //    System.out.println("You are an Adult");
        //   break;
        // case 17:
        //      System.out.println("You are an UnderAge");
        //    break;
        //  default:
        //   System.out.println("Invalid Age, Enter Valid Age");
        //  }

        // points to remember about switch
        //1. Switch can be used to evaluate value in a variable/expression
        //2. Break is used to terminate switch once a match statement is executed
        //3. Statements in defaults will be executed if not matching statements is found

        // Rules
        //1. Variable in switch statements can only be int, short, byte, char, string,
        // enum(enumerate), Integer, Byte, Short, Character.
        //2. Case label cannot have a variable, it has to be a constant.
        //3. Case label has to be of the same datatype as of the variable or
        // expression result in switch parentheses.

        // int temp = 23;

        // switch (temp){
        //    case 23:
        //         System.out.println("Uncover Tomatoes");
        //     break;
        //    case 30:
        //     System.out.println("Cover Your tomatoes");
        //     break;
        //  default:
        //        System.out.println("Stay indoors");
        // }

        // hotel menu application
        // write a java program that lets a user choose an option from a menu.
        // then the program displays the order

        // title of menu -> Our Menu
        //1. Kebab
        //2. Mayai
        //3. Smocha
        //4. Quit

        // declare a choice variable
        int choice;

        //create a scanner object
        Scanner sc = new Scanner(System.in);

        // use a do while loop to display the menu
        do {
            System.out.println("Mukefee");
            System.out.println("Please select a meal to order");
            System.out.println("1.Starters");
            System.out.println("2. Snacks ");
            System.out.println("3. Main Course");
            System.out.println("4. Quit");

            // Capture input from the user and assign to variable choice
            choice = sc.nextInt();

            // begin selection structure using switch statement
            switch (choice) {
                case 0 :
                    System.out.println();
                    System.out.println("Cancel order");
                case 1:
                    System.out.println();
                    System.out.println("1. Starter order submitted successfully");
                    System.out.println("=======================================");
                    System.out.println("Onion rings and Honey          :Ksh.200");
                    System.out.println("Smoked Quails                  :Ksh.300");
                    System.out.println("                                 ------");
                    System.out.println("Total                           Ksh.500");
                    System.out.println("=======================================");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("2. Snacks order submitted successfully");
                    System.out.println("======================================");
                    System.out.println("1.Sausage                      :Ksh.50");
                    System.out.println("2. Coffee or Tea              :Ksh.100");
                    System.out.println("                                 ------");
                    System.out.println("Total                           Ksh.150");
                    System.out.println("=======================================");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("2. Main Course order submitted successfully");
                    System.out.println("===========================================");
                    System.out.println("1.Pilau                             :Ksh.50");
                    System.out.println("2. Ugali                           :Ksh.100");
                    System.out.println("                                     ------");
                    System.out.println("Total                               Ksh.150");
                    System.out.println("===========================================");
                    break;
                case 4:
                    System.out.println("========================================");
                    System.out.println("Good Bye");
                    System.out.println("Thanks You For Doing Business with us");
                    System.out.println("========================================");
                    break;
                default:
                    System.out.println("Unknown Choice!!");
                    System.out.println("Please select 1, 2 3 and 4 to make an order or 0 to exit");
            }
        } while (choice != 6);

//      There are two types of loops
        // bounded -> we know the number of times upfront (for)
        // unbounded -> we don't know the number of times of the iteration (while)

    }
}
