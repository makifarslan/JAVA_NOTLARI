abstract class sekil{
    String isim;

    public void isimBelirle(String isim){
        this.isim = isim;
    }

    public String isimGetir(){
        return isim;
    }

    public abstract double alanHesap();
}