package deneme;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class dd {
	public static void ara(HashMap<Integer, String> gelen, int numara){
		if(gelen.containsKey(numara)){
			System.out.println(numara + " numaralý öðrenci: " + gelen.get(numara) + ".");
		}
		else
			System.out.println(numara + " numaralý öðrenci yoktur.");
	}
	
	public static void main(String[] args) {
		HashMap<Integer, String> ogrenci = new HashMap<Integer, String>();
		ogrenci.put(17060788, "Mehmet Akif ARSLAN");
	    ogrenci.put(17060244, "Gökhan Veyisoðlu");
	    ogrenci.put(17067388, "Mehmet Kamil Torunoðlu");
	    System.out.println(ogrenci);
	    ara(ogrenci, 11857424);
	}

}
