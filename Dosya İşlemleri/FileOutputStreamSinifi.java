import java.io.*;
public class FileOutputStreamSinifi{
    public static void main(String args[]){
        File yol = new File("C:\\Users\\ceng00\\Desktop\\example.txt"); /*Kendi bilgisayarınıza göre ayarlayın.*/
        try
        {
            FileOutputStream yazdir = new FileOutputStream(yol);
            String metin = "FileOutputStream ile yazdirma.";
            byte veriler[] = metin.getBytes();
            yazdir.write(veriler);
            yazdir.close();
            char okunacak[] = new char[(int) yol.length()];
            FileReader f2 = new FileReader(yol);
            f2.read(okunacak);
            String okunan = new String(okunacak);
            System.out.println(okunan);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}