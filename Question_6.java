//Input currency in rupees and output in USD.
import java.util.Scanner;
public class Question_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The indian currency is ");
        double Indian_Currency=sc.nextDouble();
        double US_Currency=Indian_Currency/85;

        System.out.println("The US currency is "+ US_Currency);

    }

}
