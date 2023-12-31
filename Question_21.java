import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String fruit=sc.next();

        switch (fruit){
            case "Mango" :
                System.out.println("King of fruits");
                break;

            case "Apple" :
                System.out.println("I am the red fruit");
                break;

            case "Strawberry" :
                System.out.println("I am found in the jungles");
                break;

            default:
                System.out.println("HEHEHEHEHEHEHEHHE");

        }
    }
}
