
/****************************************************************************** 

Welcome to PrepInsta Online Compiler. This is an online compiler and debugger tool for C, C++, 
Python, Java, JavaScript, C#, Kotlin, PHP, SQL, Go, Assembly Language. 
Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
import java.util.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = fun(N);
		System.out.println(+ans);
	}

	static int fun(int N) {
		int maxCount = 0;

		for (int a = 1; a <= N - 2; a++) {

			for (int b = 1; b <= N - a - 1; b++) {

				int c = N - a - b;
				int count = 0;
				int max = Math.max(a, Math.max(b, c));
				if (max == a) {
					count++;
				}
				if (max == b) {
					count++;
				}
				if (max == c) {
					count++;
				}
				if (count == 1) {
					maxCount++;
				}
			}
		}
		return maxCount;
	}
}