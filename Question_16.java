import java.util.Scanner;


public class Question_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write the number: ");
        int n =sc.nextInt() ;

        int ans=0;

        while(n>0){
            int reminder=n%10;
            n=n/10;
            ans = ans*10+reminder;
        }
        System.out.println(ans);

    }
}
