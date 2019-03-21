import java.util.Scanner;

public class depo{
    public static void main(String[] args){
        double h1, h2;
        Scanner oku = new Scanner(System.in);
        kutu k = new kutu();
        System.out.println("3 tane sayi giriniz:");
        k.x = oku.nextDouble();
        k.y = oku.nextDouble();
        k.z = oku.nextDouble();
        h1 = hesap1.hacim1(k.x, k.y, k.z);
        hesap2 n = new hesap2();
        h2 = n.hacim2(k);
        System.out.printf("hesap1 = %f\nhesap2 = %f\n", h1, h2);
    }
}