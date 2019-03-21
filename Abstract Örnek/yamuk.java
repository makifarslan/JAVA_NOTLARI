class yamuk extends sekil{
    double alt;
    double ust;
    double h;

    public void bilgi(double alt, double ust, double h){
        this.alt = alt;
        this.ust = ust;
        this.h = h;
        isimBelirle("Yamuk");
    }

    public double alanHesap(){
        return ((alt + ust) * h) / 2;
    }
}