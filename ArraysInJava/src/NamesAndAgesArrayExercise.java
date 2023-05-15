import java.util.Scanner;

public class NamesAndAgesArrayExercise {
    // Create a java program that checks the smallest age in an array of ages
    // then prints out a nice output if that person alongside their actual age
    // create a function that to get the names of 5 persons and returns an array
    // create another function that will get the ages and return an array of ages
    // create a function that will print out the nice formatted output
    // ["Bruce", "Fridah", "Joy", "Sam", "Elvis"] -> names
    // [20,21,21,19,18] -> ages

    // function to get the names of the users
    public static String[] getUserNames(){
        Scanner sc = new Scanner(System.in);
        String userNamesArray[]= new String[5];
        System.out.println("Please Enter 5 names: ");
        for (int i = 0; i < userNamesArray.length; i++){
            userNamesArray[i] = sc.nextLine();
        }
        return userNamesArray;
    }

    // function to get the ages of the users
    public static int[] getUserAges(){
        Scanner sc = new Scanner(System.in);
        int userAgesArray []= new int[5];
        System.out.println("Please Enter Ages of the 5 People: ");
        for (int i = 0; i < userAgesArray.length; i++){
            userAgesArray[i] = sc.nextInt();
        }
        return userAgesArray;
    }

    public static void main(String[] args) {
        String names[] = getUserNames();
        int ages[] = getUserAges();
        displayYoungestUser(names, ages);
    }
    // function to output the name and age of the youngest user
    public static void displayYoungestUser(String[] names, int[] ages){
        int smallestAge = ages[0];
        int youngestAge = 0;
        for (int i = 0; i < ages.length; i++){
            if (ages[1] > smallestAge){
                youngestAge = smallestAge;
            } else if(ages[i] < smallestAge){
                smallestAge = ages[i];
            }
        }
        System.out.println(youngestAge);
        System.out.println(ages);
    }
}
