class SoyutSinifOrnegi{
    public static void main(String[] args){
        ucgen u = new ucgen();
        yamuk y = new yamuk();
        daire d = new daire();
        u.bilgi(5, 8);
        y.bilgi(10, 5, 5);
        d.bilgi(3, 3);
        System.out.println(u.isimGetir());
        System.out.println(u.alanHesap() + "\n");
        System.out.println(y.isimGetir());
        System.out.println(y.alanHesap() + "\n");
        System.out.println(d.isimGetir());
        System.out.println(d.alanHesap() + "\n");
    }
}