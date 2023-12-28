//print numbers 1 to n using for loop
import java.util.Scanner;
public class Question_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int i;

        for(i=1;i<=num;i++){
            System.out.println(i);
        }
    }
}
