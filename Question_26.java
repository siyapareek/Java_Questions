import java.util.Scanner;

public class Question_26 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int ans=0;
        int x=num;

         while(num>0) {
             int rem = num % 10;
             num = num / 10;
             ans = ans * 10 + rem;
         }


             if(x==ans){
                 System.out.println("Number is Palindrome");
             }else{
                 System.out.println("Number is not Palindrome");
             }





         }
    }

