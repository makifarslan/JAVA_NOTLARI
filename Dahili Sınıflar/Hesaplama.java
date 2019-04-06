public class Hesaplama{
    public class Toplama{                          //Dahili sınıf...
        public int toplamaYap(int a, int b){
            return a + b;
        }
    }
    protected class Cikartma{                      //Dahili sınıf...
        public int cikartmaYap(int a, int b){
            return a - b;
        }
    }
    class Carpma{                                 //Dahili sınıf...                          
        public int carpmaYap(int a, int b){
            return a * b;
        }
    }
    private class Bolme{                         //Dahili sınıf...                
        public int bolmeYap(int a, int b){
            return a / b;
        }
    }
    public static void main(String[] args){
        Hesaplama.Toplama ht = new Hesaplama().new Toplama();
        Hesaplama.Cikartma hck = new Hesaplama().new Cikartma();
        Hesaplama.Carpma hcp = new Hesaplama().new Carpma();
        Hesaplama.Bolme hb = new Hesaplama().new Bolme();

        int sonuc1 = ht.toplamaYap(10, 5);
        int sonuc2 = hck.cikartmaYap(10, 5);
        int sonuc3 = hcp.carpmaYap(10, 5);
        int sonuc4 = hb.bolmeYap(10, 5);

        System.out.println("Toplama Sonuc = " + sonuc1);
        System.out.println("Cikartma Sonuc = " + sonuc2);
        System.out.println("Carpma Sonuc = " + sonuc3);
        System.out.println("Bolme Sonuc = " + sonuc4);
    }
}