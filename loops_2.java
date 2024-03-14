import java.util.Scanner;

public class loops_2 {

        public static void main(String []argh){
            Scanner sc=new Scanner(System.in);
            int sum = 0;
            int t=sc.nextInt();
            for(int i=0;i<t;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int n = sc.nextInt();
                if( (n>=1&&n<=15) && (a>=0&&a<=50) && (b>=0&&b<=50) ){
                    int j=0;
                    while(j<n){
                        int s = (int)Math.pow(2,j)*b;
                        sum = sum+s;
                        int ss = sum+a;
                        System.out.print(ss + " ");
                        j++;
                    }
                    sum = 0;
                    int ss = 0;
                }
                System.out.println("");
            }
        }
    }
