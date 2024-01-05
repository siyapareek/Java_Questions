import java.util.Scanner;

//Calculate Discount Of Product
public class Question_37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price: ");
        int price=sc.nextInt();
        System.out.println("Enter the discount you want: ");
        int discount=sc.nextInt();

        discount=price/100*discount;
        price=price-discount;

        System.out.println("The discounted price is : "+price);

    }

}
