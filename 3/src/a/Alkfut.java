package a;

public class Alkfut {

	public static void main(String[] args) {

		Alkalmazott alkalmazott1 = new Alkalmazott();

		alkalmazott1.setName("Tomi");
		alkalmazott1.setPayment(8);

		System.out.println(alkalmazott1.szovegVissza());

		alkalmazott1.fizNov(3);
		System.out.println(alkalmazott1.szovegVissza());
		
		boolean isTrue = alkalmazott1.fizHatar(10, 20);
		if (isTrue)
			System.out.println("A megadott hat�rok k�z� esik a fizet�se.");
		else
		System.out.println("Nem esik a megadott hat�rok k�z� a fizet�se.");
		
		System.out.println("Az ad� �rt�ke: " + alkalmazott1.getAdo());
		
		Alkalmazott alkalmazott2 = new Alkalmazott();

		alkalmazott2.setName("Tomi2");
		alkalmazott2.setPayment(80);
		
		if(alkalmazott1.nagyobbE(alkalmazott2)) {
			System.out.println("Az alk1 fizet�se a nagyobb.");
		} else{
			System.out.println("Az alk2 fizet�se a nagyobb.");
		}
	}

}
