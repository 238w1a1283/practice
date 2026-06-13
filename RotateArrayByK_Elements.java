import java.util.Scanner;
import java.util.*;

public class RotateArrayByK_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[arr.length];
        rotate(arr, k, ans);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static void rotate(int[] arr, int k, int[] ans) {
        int n = arr.length;
        k %= n;

        for (int i = 0; i < n; i++) {
            ans[(i + k) % n] = arr[i];
        }
    }
}
