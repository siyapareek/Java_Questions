import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num_1=sc.nextInt();

        System.out.println("Enter the second number: ");
        int num_2=sc.nextInt();

        System.out.println("Enter the operation: ");
        char operator=sc.next().charAt(0);

        if(operator=='+'){
            int sum=num_1+num_2;
            System.out.println(sum);
        }
        else if(operator=='-'){
            if(num_1>=num_2) {
                System.out.println(num_1 - num_2);
            }else {
                System.out.println(num_2 - num_1);
            }
        }
        else if(operator=='*'){
            System.out.println(num_1*num_2);
        }
        else if(operator=='/'){
            if(num_1>=num_2){
                System.out.println(num_1/num_2);
            }else{
                System.out.println(num_2/num_1);

            }
        }




    }
}
