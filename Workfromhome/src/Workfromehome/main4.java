package Workfromehome;
class alphabets implements Runnable{
	public void run() {
		for(char i = 'a'; i<='z';i++) {
			main4.output.print(i+' ');
		}
	}
}

class number implements Runnable{
	public void run() {
		for(int i=0;i<=100;i++) {
			main4.output.print(i+' ');
		}
	}
}

public class main4 {
	public static main4 output  = new main4();
	public static void main(String[] args) {
		alphabets r1 = new alphabets();
		Thread t1 = new Thread(r1);
		number r2 = new number();
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
	 private Object syncher = new Object ();  
	 private int state = 0;

	 public void print (char pChar) {
		 synchronized (syncher) {      
			 while (true) {
				 if (state == 0) {     
					 System.out.print(pChar + ","); 
					 state = 1;        
					 syncher.notify(); 
					 return;
				 } else {              
					 try {
						 syncher.wait();  
					 } catch (InterruptedException e) {
					 }
				 }
			 }
		 }
	 }

	 public void print (int pInt) {
		 synchronized (syncher) {
			 while (true) {
				 if (state == 1) {
					 System.out.print(pInt + ",");
					 state = 0;
					 syncher.notify();
					 return;
				 } else {
					 try {
						 syncher.wait();
					 } catch (InterruptedException e) {
					 }
				 }
			 }
		 }
	 }
}


