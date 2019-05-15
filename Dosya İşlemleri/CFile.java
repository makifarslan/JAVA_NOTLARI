import java.io.*;
public class CFile{
    public static void main(String args[]){
        File f = new File("C:\\Users\\ceng00\\Desktop\\example.txt"); /*Kendi bilgisayarınıza göre ayarlayın.*/
        try
        {
            f.createNewFile();
            f.getAbsolutePath();
            System.out.println("Dosya olusturuldu.");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}