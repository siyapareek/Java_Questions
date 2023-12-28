//find the largest of the three numbers
import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num_1=sc.nextInt();
        System.out.println("Enter number 2: ");
        int num_2=sc.nextInt();
        System.out.println("Enter number 3: ");
        int num_3=sc.nextInt();

        int maximum=num_1;

        if(num_2>maximum) {

            maximum = num_2;
        }
        if(num_3>maximum) {

            maximum = num_3;
        }
        System.out.println("The largest number is : "+maximum);


    }
}
