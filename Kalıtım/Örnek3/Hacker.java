class Hacker extends ZekiInsan{
    public Hacker(int par){
        super(par+1); //dikkat
        System.out.println("Hacker yapılandırıcısı." + par);
    }

    public static void main(String[] args){
        Hacker hck = new Hacker(3);
    }
}