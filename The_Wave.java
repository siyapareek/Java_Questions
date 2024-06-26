import java.util.*;

public class The_Wave {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int x=sc.nextInt();
        int[] arr=new int[t];
        for(int i=0;i<t;i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        while(x-->0){
            int a=sc.nextInt();
            if(binSearch(arr,t,a)==-1) System.out.println("0");
            else if(t%2==0 && binSearch(arr,t,a)%2==0) System.out.println("POSITIVE");
            else System.out.println("NEGATIVE");
        }
    }
    static int binSearch(int[] arr,int n,int k){
        int start=0;
        int end=arr.length-1;
        int ans=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k) return -1;
            else if(arr[mid]>k){
                ans=mid;
                end=mid-1;
            }
            else start=mid+1;
        }
        return ans;
    }
}
