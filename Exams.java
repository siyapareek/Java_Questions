import java.util.Scanner;

public class Exams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t--!=0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if ((x*y)*0.5<z) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
