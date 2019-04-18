class Anasinif{
    public void ekranaBas(String deger){
        System.out.println(deger);
    }
}
class B{
    public String degerDondur(){
        return "B";
    }
}
class C{
    public int topla(int a, int b){
        return a + b;
    }
}
class TuretilmeSinif extends Anasinif{
    public class BB extends B{
        public BB(){
            ekranaBas("sonuc = " + degerDondur());
        }
    
    }
    public class CC extends C{
        public CC(int a ,int b){
            ekranaBas("sonuc = " + topla(a,b));
        }
    }
    public static void main(String[] args) {
        TuretilmeSinif.BB tbb = new TuretilmeSinif().new BB();
        TuretilmeSinif.CC tcc = new TuretilmeSinif().new CC(6, 9);
    }
}
