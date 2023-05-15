import java.util.Scanner;

public class Exercises {

    // 0-39 E
    // 40 - 49 - D
    // 50 - 59 -C
    // 60 - 69 - B
    // 70 - 100 A
    public static void main(String[] args) {
        System.out.println("Please Enter Student's marks: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >69 && num <= 100){
            System.out.println("A");
        } else if (num >59 && num <= 69) {
            System.out.println("B");
        } else if (num >49 && num <= 59) {
            System.out.println("C");
        } else if (num >39 && num <= 49) {
            System.out.println("D");
        } else if (num >=0 && num <= 39) {
            System.out.println("E");
        } else {
            System.out.println("Invalid Data!!");
        }
//        int studentMarks[] = new int []{100, 90, 80, 90, 100};
//        String studentGrades[] = new String[]{"A", "B", "C", "D", "E"};
//        String grade = null;
//
//        for (int i = 0; i < studentMarks.length; i++) {
//            if (studentMarks[i] >= 70 && studentMarks[i] <= 100) {
//                grade = studentGrades[i];
//            } else if (studentMarks[i] >= 60 && studentMarks[i] <= 69) {
//                grade = studentGrades[i];
//            }  else if (studentMarks[i] >= 50 && studentMarks[i] <= 59) {
//                grade = studentGrades[i];
//            } else if (studentMarks[i] >= 40 && studentMarks[i] <= 49) {
//                grade = studentGrades[i];
//            } else if (studentMarks[i] >= 0 && studentMarks[i] <= 39) {
//                grade = studentGrades[i];
//            }
//            System.out.println((i + 1) + "Student:" + (i + 1) + "Scored:" + grade);
//        }
    }
}
