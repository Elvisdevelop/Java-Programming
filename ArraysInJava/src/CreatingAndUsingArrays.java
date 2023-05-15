public class CreatingAndUsingArrays {
    public static void main(String[] args) {
        // Using an array is a three-step process
        // 1. Declare the array
        // 2. Allocate the memory
        // 3. Initialise the array

        //1. Declare a new array
        // data-type array-name[];
        // data-type[] array-name;

        int ages[];
        int[] rollNumbers;

        // 2. Allocate memory
        // array-name = new data-type[size];

        ages = new int[5];
        rollNumbers = new int[10];

        // 3. Initialize the array
        // array-name[index] = value;

        // To access each element in teh array, the concept of subscript, index or position comes in.
        // The first element is at index 0, the second at index 1, the third in index 2 and the forth at index 3,
        // and the fifth at index 4.

        int numbers[];
        numbers = new int[5];
        // assigning and assessing elements of an array
        // array-name[index] = value;
        numbers[0] = 5;
        numbers[1] = 4;
        numbers[2] = 3;
        numbers[3] = 2;
        numbers[4] = 1;

        // display elements in an array
        for (int x = 0; x < numbers.length; x++) {
            System.out.println("Value of x is numbers[" + x + "] is: " + numbers[x]);
        }

        System.out.println("==========================================================================================");
        System.out.println(numbers[2]);

        // combining declaration and memory allocation
        int y[] = new int[5];
        // combining declaration + memory allocation + initialization
        double salary[] = new double[]{25, 30, 45, 55, 60};
        System.out.println("==========================================================================================");

        // display the length of an array
        System.out.println(salary.length);
        System.out.println("==========================================================================================");
        for (int i = 0; i< salary.length - 1; i++){
            System.out.println(i + 1 + ". Salary: " + salary[i]);
        }
    }
}
