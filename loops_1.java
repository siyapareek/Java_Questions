import java.util.Scanner;

public class loops_1 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);;
            int N = sc.nextInt();
            if(N>1 && N<=20)
            {
                for(int i=1 ; i<=10 ; i++)
                {
                    int mul=N*i;
                    System.out.println(N+" x "+i+" = "+mul);
                }
            }
        }
    }