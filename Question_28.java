import java.util.Scanner;

//Write a Java program to take the length and
// breadth of a rectangle and print its area.
public class Question_28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int area=length*breadth;

        System.out.println(area);


    }
}
