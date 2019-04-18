interface Toplayici{
    public int hesaplamaYap();
}

public class Hesaplama3{
    public Toplayici topla(final int a, final int b){
        return new Toplayici(){
            public int hesaplamaYap(){
                //Final olan yerel değişkenlere ulaşabilir.
                return a + b;
            }
        }; //Noktalı virgül şart.
    }
    public static void main(String args[]){
        Hesaplama3 h3 = new Hesaplama3();
        Toplayici t = h3.topla(5, 9);
        int sonuc = t.hesaplamaYap();
        System.out.println("5 + 9 = " + sonuc);
    }
}

//İsimsiz sınıflar