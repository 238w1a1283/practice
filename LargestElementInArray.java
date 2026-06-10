import java.util.Scanner;
public class LargestElementInArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int ans=fun(arr);
        System.out.println(+ans);
    }
    static int fun(int[] arr){
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
