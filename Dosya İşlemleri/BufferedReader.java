import java.io.*;
public class BufferedReader{
    public static void main(String args[]){
        try
        {
            File f = new File("C:\\Users\\ceng00\\Desktop\\buffer.txt"); /*Kendi bilgisayarınıza göre ayarlayın.*/
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String satir = br.readLine();
            while(satir != null)
            {
                System.out.println(satir);
                satir = br.readLine();
            }
            br.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}