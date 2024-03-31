import java.util.Scanner;

    public class FindSecondMax {
        static int FindMax(int[] arr) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

        return max;
    }
    static int FindSecondMax(int[] arr) {
        int max = FindMax(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }

        }
        int FindSecondMax = FindMax(arr);
        return FindSecondMax;
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter size of array: ");
            int n=sc.nextInt();
            int[] arr=new int[n];

            System.out.println("Enter "+n+" elements: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }


            System.out.println("The second maximum element is: "+FindSecondMax(arr));

        }

    }


