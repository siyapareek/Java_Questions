//electric bill
import java.util.Scanner;

public class Question_35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int electric_bill=sc.nextInt();

        if (electric_bill>=1 && electric_bill<=100){
            System.out.println(electric_bill*10);
        }
        else if(electric_bill>100 && electric_bill<=200){
            System.out.println(electric_bill*15);
        }
        else if(electric_bill>200 && electric_bill<=300){
            System.out.println(electric_bill*20);
        }

    }
}
