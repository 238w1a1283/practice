
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
		String s = sc.nextLine();
		int ans = fun(s);
		System.out.println(+ans);

	}

	static int fun(String s) {
		String num = "";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				num += ch;
			} else {
				if (!num.equals("")) {
					sum += Integer.parseInt(num);
					num = "";
				}
			}
		}
		if (!num.equals("")) {
			sum += Integer.parseInt(num);
		}
		return sum;
	}

}
