import java.io.IOException;
import java.util.*;
class EXP_1{
public static void main(String[] args) throws IOException {
  double a, b, c, d, e, f, n1, n2;
  Scanner sc = new Scanner(System.in);
  System.out.println("The program solve 2x2 linear equation"+"\nThe following are equation and diplsay" );
   System.out.print("the value for Xand Y: 3.4X+50.2Y=5.9"+"\n2.1X+55Y=5.9"+"\n a,b,c,d,e,f = 3.4,50.2,2.1,.55,44.5,5.9");

   System.out.println("Enter values a,b,c,d,e,f,X,Y\n");

   a = sc.nextDouble();
   b = sc.nextDouble(); 
   c = sc.nextDouble(); 
   d = sc.nextDouble();
   e = sc.nextDouble();
   f = sc.nextDouble();

   n2=((a*f)-(e*d))/((a*d)-(b*c));
   n1=((e*d)-(b*f))/((a*d)-(b*c));
   
   System.out.println("x is "+ n1 +"and y is "+n2);
   sc.close();
 
}    

}