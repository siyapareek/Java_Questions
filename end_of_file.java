import java.util.Scanner;

public class end_of_file {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc = new Scanner(System.in);
            int c =1;
            while(sc.hasNext()){
                String s = sc.nextLine();
                System.out.println(c+" "+s);
                c++;
            }
        }
    }