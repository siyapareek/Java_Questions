//Write a program to input principal, time, and rate (P, T, R)
// from the user and find Simple Interest.

import java.util.Scanner;
public class Question_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Write the principal : ");
        int principal=sc.nextInt();
        System.out.print("Write the Time : ");
        int time=sc.nextInt();
        System.out.print("Write the Rate : ");
        int rate=sc.nextInt();

        int simple_interest=(principal*time*rate)/100;

        System.out.println("The simple interest is " +simple_interest);



    }
}
