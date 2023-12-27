//Print whether the number is even or odd, take the input from the user
import java.util.Scanner;
public class Question_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
