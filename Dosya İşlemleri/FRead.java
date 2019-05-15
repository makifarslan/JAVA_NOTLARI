import java.io.*;
public class FRead{
    public static void main(String args[]){
        File f = new File("C:\\Users\\ceng00\\Desktop\\example.txt"); /*Kendi bilgisayarınıza göre ayarlayın.*/
        char veriler[] = new char[(int) f.length()];
        try
        {
            FileReader f2 = new FileReader(f);
            f2.read(veriler);
            String okunan = new String(veriler);
            System.out.println(okunan);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}