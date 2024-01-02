import java.util.Scanner;

//If the marks of Robert in three subjects
// are entered through keyboard (each out of
//100), write a program to calculate
// his total marks and percentage marks.
public class Question_32{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Marks 1: ");
        int one=sc.nextInt();
        System.out.print("Marks 2: ");
        int two=sc.nextInt();
        System.out.print("Marks 3: ");
        int three=sc.nextInt();

        int total_marks=one+two+three;
        float percentage=total_marks/3;

        System.out.println("The total marks of the student is: "+total_marks);
        System.out.println("The percentage of the student is: "+percentage+ "%");



    }

}
