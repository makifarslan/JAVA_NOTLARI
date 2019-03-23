package deneme;
import java.util.LinkedList;
import java.util.Queue;

public class dd {

	public static void main(String[] args) {
		Queue<String> krk = new LinkedList<String>();
		krk.offer("Bade");
		krk.offer("Zehra");
		krk.offer("Fatih");
		krk.offer("Hakan");
		System.out.println("Kuyruk Boþaltýlýyor");
		for (int i = 0; i < 6; i++){
			System.out.println(krk.poll() + " ");
		}
		System.out.println("-------------");
		krk.offer("Mehmet");
		while (!krk.isEmpty()){
			System.out.println(krk.remove() + " ");
		}
	}

}
