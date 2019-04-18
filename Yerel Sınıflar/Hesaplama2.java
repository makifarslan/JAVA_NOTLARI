public class Hesaplama2{
    public static int topla(int a, final int b){
        int a_yedek = a;
        class Toplama2{
            private int x; //Doğru
            public int y; //Doğru
            //protected int z = a_yedek; //Hata!
            int p; //Doğru
            public int degerDondur(){
                //int degera = a; //Hata!
                int degerb = b;
                return b;
            }
        }
        Toplama2 t2 = new Toplama2();
        return t2.degerDondur();
    }
    public void ekranaBas(){
        /* Yerel sınıflar sadece friendly erişim belirleyicisine sahip olabilirler.
        public class toplama8{
            public void test(){}
        }*/
    }
    public void hesaplamaYap(){
        /* Statik olmayan bir metotta static sınıf tanımlanamaz.
        static class Toplama9{
            public void abcd(){}
        }*/
    }
    public static void main(String args[]){
        int sonuc = Hesaplama2.topla(5, 9);
        System.out.println("Sonuc " + sonuc);
    }
}