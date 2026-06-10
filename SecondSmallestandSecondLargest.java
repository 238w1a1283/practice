import java.util.*;
public class SecondSmallestandSecondLargest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        fun(arr);
        
    }
    static void fun(int[] arr){
        Arrays.sort(arr);
        int secondLargest=arr[arr.length-2];
        int secondSmallest=arr[1];
        System.out.println("Second Largest:"+secondLargest);
        System.out.println("Second Smallest:"+secondSmallest);
    }
}
