import java.util.Scanner;
import java.util.*;

public class RearrangeArrayIncORDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseinInc(arr);
        reverseinDec(arr);

    }

    static void reverseinInc(int[] arr) {
        Arrays.sort(arr);
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[i];
        }
        System.out.println("Increasing order:");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    static void reverseinDec(int[] arr) {
        Arrays.sort(arr);
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Decreasing order:");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

}
