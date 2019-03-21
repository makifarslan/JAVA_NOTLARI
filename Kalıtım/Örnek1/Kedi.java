class Kedi {
	protected int ayakSayisi = 4;
	public void yakalaAv(){
		System.out.println("Kedi sınıfı av yakaladı.");
	}
	
	public static void main(String[] args){
		Kedi kd = new Kedi();
		kd.yakalaAv();
	}
}