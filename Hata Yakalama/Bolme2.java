import java.util.Scanner;

public class Bolme2{
    public static void main(String args[]){
        Scanner oku = new Scanner(System.in);
        int a, b;
        System.out.println("Basla");
        a = oku.nextInt();
        b = oku.nextInt();
        if(b <= 0){
            throw new IllegalArgumentException("Girilen sayi pozitif degil!" + b);
        }
        System.out.println("Sonuc = " + (a / b));
        System.out.println("Bitti");
    }
}