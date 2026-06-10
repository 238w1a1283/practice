import java.util.Scanner;
public class CountFrequencyEachElement {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr=new int[n];
    boolean [] visited=new boolean[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    fun(arr,visited);
    
    
  } 
  static void fun(int[] arr,boolean[] visited){
    for(int i=0;i<arr.length;i++){
        if(visited[i]){
            continue;
        }
        int count=1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
                visited[j]=true;
            }
        }
        System.out.println(arr[i]+":"+count);
    }
  } 

}
