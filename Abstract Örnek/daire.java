class daire extends sekil{
    double yaricap;
    double pi;

    public void bilgi(double yaricap, double pi){
        this.yaricap = yaricap;
        this.pi = pi;
        isimBelirle("Daire");
    }

    public double alanHesap(){
        return pi * (yaricap * yaricap);
    }
}