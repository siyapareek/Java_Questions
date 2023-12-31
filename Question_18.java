import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int remainder=0;
        int sum=0;
        int product=1;
        int result=0;

        while(n>0){
            remainder=n%10;
            sum=sum+remainder;
            product=product*remainder;
            n=n/10;
            result=product-sum;

        }
        System.out.println(result);
    }
}
