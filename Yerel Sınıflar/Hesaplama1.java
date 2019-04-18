interface Toplayici{
    public int hesaplamaYap();
}

public class Hesaplama1{
    public int topla(int a, int b){
        class Toplama1 implements Toplayici{
            private int deger1;
            private int deger2;
            public Toplama1(int deger1, int deger2){ //Yapılandırıcı
                this.deger1 = deger1;
                this.deger2 = deger2;
            }
            public int hesaplamaYap(){ //Override
                return deger1 + deger2;
            }
        }
        Toplama1 t1 = new Toplama1(a,b);
        return t1.hesaplamaYap();
    }
    public void ekranaBas(){
        //Toplama1 t1 = new Toplama1(2, 6); //Hata! Kapsama alanının dışı.
    }
    public static void main(String args[]){
        Hesaplama1 h1 = new Hesaplama1();
        int sonuc = h1.topla(6, 9);
        System.out.println("Sonuc = 6 + 9 = " + sonuc);
    }
}