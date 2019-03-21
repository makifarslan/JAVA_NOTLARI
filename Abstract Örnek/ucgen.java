class ucgen extends sekil{
    double yukseklik;
    double taban;

    public void bilgi(double yukseklik, double taban){
        this.yukseklik = yukseklik;
        this.taban = taban;
        isimBelirle("Ucgen");
    }

    public  double alanHesap(){
        return (taban * yukseklik) / 2;
    }
}