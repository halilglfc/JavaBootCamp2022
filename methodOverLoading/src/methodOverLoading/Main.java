package methodOverLoading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.topla(5, 7);
		System.out.println(sonuc);
		
		System.out.println(dortIslem.topla(1, 3,4));
		
	}

}
