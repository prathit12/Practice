import java.util.Scanner;

public class exp9 {

	public static void main(String[] args) {
		String s,r= " ";
		Scanner sc =  new Scanner(System.in);
		s=sc.nextLine();
		int n = s.length();
    
		for(int i =n-1;i>=0;i--){
			r=r+s.charAt(i);
		}
		if(s.equalsIgnoreCase(r)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
		sc.close();
	}

}
