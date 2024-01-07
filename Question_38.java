import java.util.Scanner;

//Power In Java
public class Question_38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int power=1;
        for(int i=0;i<b;i++){
           power=power*a;
        }
        System.out.println(power);
    }


}
