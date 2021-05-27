package Workfromehome;

import java.util.Scanner;

public class main10 {

	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	String s;
	String r;
	s=sc.nextLine();
	r=sc.nextLine();
	int x,y,z;
	try {
		x=Integer.parseInt(s);
		y=Integer.parseInt(r);
		z=1;
		for(int i=0;i<y;i++) {
			z=z*x;
		}
		System.out.println(x+"^"+y+":"+z);
	}catch(NumberFormatException n) {
		System.out.println("Number format error"+n);
	}
	finally {
		System.out.println("Executes  Every time");
	}
	sc.close();
	}

}
