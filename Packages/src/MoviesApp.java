import java.util.Scanner;

public class MoviesApp {

    // Title: Movies application using Java Care
    // This app will allow a user to create a new movie , view all movies they already have, modify , update , edit a
    // movie , and they can delete a movie

    public static void main(String[] args) {
        // You'll need 3 arrays
        String movies[] = new String[10];
        String directors[] = new String[10];
        int releaseYear[] = new int[10];


        Menu(movies, directors, releaseYear);
    }

    public static void Menu(String[] movies, String[] directors, int releaseYear[]){
        Scanner sc = new Scanner(System.in);
        int choice = 6;
        boolean isRunning;
        do {
            System.out.println("======================================================================================");
            System.out.println("\t\t\t\t\t CPL Movies Shop");
            System.out.println("======================================================================================");
            System.out.println("Welcome To My Movies Collection App, Choose an option from the menu");
            System.out.println("1. Add A Movie");
            System.out.println("2. Show My Movies");
            System.out.println("3. Update A Movie");
            System.out.println("4. Search A Movie By Its Title");
            System.out.println("5. Delete A Movie");
            System.out.println("6. To Quit");
            System.out.println("======================================================================================");
            System.out.print("Your Choice:");
            choice = sc.nextInt();
            // check for users choice
            if (choice == 1){
                // create a movie
                System.out.print("Enter The Movie Title:");
                String movieTitle = sc.next();
                System.out.print("Enter The Movie Director: ");
                String movieDirector = sc.next();
                System.out.print("Enter The Movie Release Year:");
                int movieReleaseYear = sc.nextInt();

                // add the movie title into the movies array
//                for (int i = 0; i < movies.length; i++){
//                    movies[i] = movieTitle;
//                }
                int i = 0;
                movies [i] = movieTitle;
                i++;
//                // add the movie director into the movies array
//                for (int i = 0; i < movies.length; i++){
//                    movies[i] = movieDirector;
//                }
//                // add the movie releaseYear into the movies array
//                for (int i = 0; i < movies.length; i++){
//
//                }
            } else if (choice == 2) {
                // show movies
                for (String movie : movies){
                    System.out.println("Movie Title: " + movie);
                }
            } else if (choice == 3) {
               // update a movie
            } else if (choice == 4) {
                // search a movie
            } else if (choice == 5) {
                // Delete a movie
            } else {
                System.out.println("Invalid choice!!");
            }


            isRunning = false;
        } while (choice != 6);
    }
}
