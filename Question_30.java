import java.util.Scanner;

//Input name, roll number and field of interest
// from user and print in the format below :
// Name: xyz, Roll number: xyz, Field of interest: xyz
public class Question_30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String Name =sc.next();
        System.out.println("Enter the roll number");
        int Roll_number=sc.nextInt();
        System.out.println("Enter the field of interest");
        String Field_of_interest=sc.next();

        System.out.println("Name: "+Name);
        System.out.println("Roll Number: "+Roll_number);
        System.out.println("Field of Interest: "+Field_of_interest);
    }
}
