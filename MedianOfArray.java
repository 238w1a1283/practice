import java.util.Scanner;
import java.util.*;

public class MedianOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (n % 2 == 0) {
            int mid1 = arr[n / 2];
            int mid2 = arr[n / 2 - 1];
            int median = (mid1 + mid2) / 2;
            System.out.println(median);
        } else {
            int mid = arr[n / 2];
            System.out.println(mid);
        }

    }
}
