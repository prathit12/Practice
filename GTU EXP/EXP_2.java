import java.util.Scanner;
class Meter{
    int m;
    Meter(int x){
        m=x;
    }
}
class convert{
    float conv(int x){
       float feet;
       feet = (float) (3.280 * x);
       return feet;
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Meter ob = new Meter(sc.nextInt());
        convert ob1 = new convert();
        System.out.println( ob1.conv(ob.m));
        sc.close();
    }
}
