//Calculate Average Of N Numbers

import java.util.Scanner;

public class Question_36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int sum=0;
       // int average=0;

        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum/n);
    }

}
