import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter Number Of Subjects :");// Here we asked for how many subjects you have
        int s = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= s; i++)// we run a loop
        {
            System.out.println("Enter marks obtained in subject " + i + ":"); // here we asked for marks in each
                                                                              // subjects
            int marks = sc.nextInt();// we take it as input
            total += marks;// we add the each subject's marks in total
        }
        double ap = (double) total / s; // for calculating Average percentage we applied this formula of double data
                                        // type
        char Grade;
        if (ap >= 90) {
            Grade = 'O';
        } else if (ap >= 80) {   // here we applied the condition for each data 
            Grade = 'A';
        } else if (ap >= 70) {
            Grade = 'B';
        } else if (ap >= 60) {
            Grade = 'C';
        } else if (ap >= 50) {
            Grade = 'D';
        } else if (ap >= 40) {
            Grade = 'E';
        } else {
            Grade = 'F';
        }
        System.out.println("Your total marks is : " + total); // here we printed it
        System.out.println("Average percentage of Your Marks is:" + ap);
        System.out.println("Your Grade is: " + Grade);
    }
}
