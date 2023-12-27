import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary=sc.nextInt();

        if(salary>1000) {
            salary = salary + 1000;
        }else{
                salary=salary+500;
            }
        System.out.println(salary);
        }
    }
