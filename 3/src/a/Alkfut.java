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
			System.out.println("A megadott határok közé esik a fizetése.");
		else
		System.out.println("Nem esik a megadott határok közé a fizetése.");
		
		System.out.println("Az adó értéke: " + alkalmazott1.getAdo());
		
		Alkalmazott alkalmazott2 = new Alkalmazott();

		alkalmazott2.setName("Tomi2");
		alkalmazott2.setPayment(80);
		
		if(alkalmazott1.nagyobbE(alkalmazott2)) {
			System.out.println("Az alk1 fizetése a nagyobb.");
		} else{
			System.out.println("Az alk2 fizetése a nagyobb.");
		}
	}

}
