interface Arayuz1{
    public void a1();
}

interface Arayuz2{
    public void a2();
}

abstract class Soyut1{
    public abstract void s1();
}

class A extends Soyut1 implements Arayuz1, Arayuz2{
    public void s1(){
        System.out.println("A.s1()");
    }
    public void a1(){
        System.out.println("A.a1()");
    }
    public void a2(){
        System.out.println("A.a2()");
    }
}

public class ArayuzGenelBakis{
    public static void main(String args[]){
        Soyut1 soyut_1 = new A();
        Arayuz1 arayuz_1 = (Arayuz1) soyut_1;
        //Arayuz1 arayuz_1 = new A(); //Bu şekilde de yazılabilir.
        Arayuz2 arayuz_2 = (Arayuz2) soyut_1;
        //Arayuz2 arayuz_2 = new A(); //Bu şekilde de yazılabilir.
        soyut_1.s1();
        //soyut_1.a1(); //HATA!!
        //soyut_1.a2(); //HATA!!
        arayuz_1.a1();
        //arayuz_1.a2(); //HATA!!
        //arayuz_1.s1(); //HATA!!
        arayuz_2.a2();
        //arayuz_2.a1(); //HATA!!
        //arayuz_2.s1(); //HATA!!
    }
}