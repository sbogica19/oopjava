package a;

public class Alkfut {

	public static void main(String[] args) {
		Alkalmazott[] alkok = new Alkalmazott[5];
		
		alkok[0] = new Alkalmazott();
		alkok[0].setName("Tomi1");
		alkok[0].setPayment(10);
		
		alkok[1] = new Alkalmazott();
		alkok[1].setName("Tomi2");
		alkok[1].setPayment(43);
		
		alkok[2] = new Alkalmazott();
		alkok[2].setName("Tomi3");
		alkok[2].setPayment(29);
		
		alkok[3] = new Alkalmazott();
		alkok[3].setName("Tomi4");
		alkok[3].setPayment(30);
		
		alkok[4] = new Alkalmazott();
		alkok[4].setName("Tomi5");
		alkok[4].setPayment(67);
		
		for(Alkalmazott a : alkok)
			System.out.println(a.szovegVissza());
		
		int max = alkok[0].getPayment();
		for (int i=0;i<alkok.length;i++){
			if(alkok[i].getPayment() > max)
				max=alkok[i].getPayment();
		}
		System.out.println("A legnagyobb fizetésû alkalmazott: " + max);
		
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
		
		int db=0;
		for (int i=0;i<alkok.length;i++){
			if(alkok[i].fizHatar(20, 50)) db++;
		}
		System.out.println(db + " darab alk fizetése esik az intervallumba.");
	}

}
