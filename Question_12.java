//Print the largest number using the math function
import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number 1: ");
        int a=sc.nextInt();
        System.out.println("Number 2: ");
        int b=sc.nextInt();
        System.out.println("Number 3: ");
        int c=sc.nextInt();

        int max=Math.max(c,Math.max(a,b));
        System.out.println("The largest number is: "+max);
    }
}
