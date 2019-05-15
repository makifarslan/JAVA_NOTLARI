import java.io.*;
public class FWrite{
    public static void main(String args[]){
        File f = new File("C:\\Users\\ceng00\\Desktop\\example.txt"); /*Kendi bilgisayarınıza göre ayarlayın.*/
        try
        {
            FileWriter yazdir = new FileWriter(f);
            String yazilacak = "Bu bir deneme yazisidir.";
            yazdir.write(yazilacak);
            yazdir.close();
            char veriler[] = new char[(int) f.length()];
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