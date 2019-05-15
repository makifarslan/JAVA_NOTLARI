public class DiziErisim{
    public void calis(){
        int sayilar[] = {1, 2, 3, 4};
        for(int i = 0; i < 5; i++){
            try{
                System.out.println("--> " + sayilar[i]);
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Hata olustu " + ex);
            }
        }
    }
    public static void main(String args[]){
        System.out.println("Basla");
        DiziErisim de = new DiziErisim();
        de.calis();
        System.out.println("Bitti");
    }
}