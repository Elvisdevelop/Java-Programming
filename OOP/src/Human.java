public class Human {
    // state
    String name;
    String complexion;
    double weight;
    double height;
    int age;

    // behaviors
    public void displayUserName(){
        System.out.println("My Name is: " + name);
    }

    public void displayUserAge(){
        System.out.println("I am: " + age + "years old");
    }

    public void laugh(){
        System.out.println(name + "is laughing...HaHaHa!!");
    }
}
