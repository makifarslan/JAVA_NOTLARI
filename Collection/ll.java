package deneme;
import java.util.LinkedList;

public class dd {
	
	public static int ara(LinkedList<String> gelen, String s){
		int konum = -1;
		for (int i = 0; i < gelen.size(); i++){
			if (gelen.get(i).equals(s)){
				konum = i;
			}
		}
		return konum;
		
	}

	public static void main(String[] args) {
			LinkedList <String> ll = new LinkedList<String>();
			ll.add("Elma");
			ll.add("Kiraz");
			ll.add("Armut");
			ll.add("Elma");
			ll.add("Ayva");
			for(int i = 0; i < ll.size(); i++)
			{
				System.out.println(ll.get(i));
			}
			for(int i = 0; i < ll.size(); i++)
			{
				if (ll.get(i).length() >= 5){
					ll.set(i, "kivi");
				}
			}
			
			System.out.println(ll);
			
			String lol = "Ayva";			
			if (ara(ll, lol) >= 0){
				System.out.println(ara(ll, lol));
			}
			else
				System.out.println("Böyle bir eleman yok!");
			
	}

}
