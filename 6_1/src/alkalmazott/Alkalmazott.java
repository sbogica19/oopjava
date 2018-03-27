package alkalmazott;

public class Alkalmazott {
	private String name;
	private int age;
	private int payment;
	private static int ageLimit = 65;

	public Alkalmazott(String name, int age, int payment) {
		this.name = name;
		this.age = age;
		this.payment = payment;
	}

	public Alkalmazott(String name, int age) {
		this.name = name;
		this.age = age;
		this.payment = 10000 * age;
	}

	public int getEvekNyugdijig() {
		return ageLimit - this.age;
	}

	public String toString() {
		return "N�v: " + this.name + "Kor: " + this.age + "Fizet�s:" + this.payment + "�vek sz�ma a nyugd�jig:"
				+ getEvekNyugdijig();
	}

	public static void setNyugdijKorhatar(int ageLimitIn) {
		ageLimit = ageLimitIn;
	}

	public Alkalmazott getAlkEvekNyugdijig(Alkalmazott a1, Alkalmazott a2){
		if(a1.getEvekNyugdijig() > a2.getEvekNyugdijig())	
			return a1;
		else 
			return a2;
	}
}
