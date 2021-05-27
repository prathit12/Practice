package Workfromehome;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class main5{
    public static void main(String[] argv) throws Exception {
    	
    	System.out.println("------Writing data in file-----");
    	try {
    		FileOutputStream fout = new FileOutputStream("stdinfo.txt");
    		 String str = "Name : Sachin, Stream : Computer Engineering, Sem : 5th Sem";
             byte b[] = str.getBytes();
             fout.write(b);
             fout.close();
             System.out.println("successful write.");
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    	 System.out.println("-------Retrive Data From File-------");
         try {
             FileInputStream fin = new FileInputStream("stdinfo.txt");
             int i = 0;
             while ((i = fin.read()) != -1) {
                 System.out.print((char) i);
             }
             fin.close();
         } catch (Exception e) {
             System.out.println(e);
         }
    	
    	
        BufferedReader bufRead = new BufferedReader(new FileReader("stdinfo.txt"));
        BufferedWriter bufWrite = new BufferedWriter(new FileWriter("newstdinfo.txt"));
        int i;
       
        do {
            i = bufRead.read();
            if (i != -1) {
                if (Character.isUpperCase((char) i)) {
                    bufWrite.write(Character.toLowerCase((char) i));
                } else {
                    bufWrite.write((char) i);
                }
            }
        } while (i != -1);
        bufRead.close();
        bufWrite.close();
    }
}