import java.util.Scanner;

public class Bolme{
    public static void main(String args[]){
        Scanner oku = new Scanner(System.in);
        int a, b;
        System.out.println("Basla");
        a = oku.nextInt();
        b = oku.nextInt();
        try{
            System.out.println("Sonuc = " + (a / b));
        } catch(ArithmeticException ex){
            System.out.println("Hatali Bolme " + ex);
        }
        System.out.println("Bitti");
    }
}