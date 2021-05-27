package Workfromehome;

import java.util.Scanner;

public class main9 {

	public static void main(String[] args) {
		String s;
		Scanner sc =  new Scanner(System.in);
		s=sc.nextLine();
		char[] c = s.toCharArray();
		char[] d = s.toCharArray();
		int k = c.length-1;
		int b = k;
		int count=0;
		for(int i = 0;i<=b;i++ ) {
			if(c[i]==d[k])
				count=1;
			else
				count=0;
			k--;
		}
		if(count==1)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		sc.close();
	}

}
