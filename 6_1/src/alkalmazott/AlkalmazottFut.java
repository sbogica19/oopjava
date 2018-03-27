package alkalmazott;

import java.util.Scanner;

public class AlkalmazottFut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfEmp = sc.nextInt();
		
		Alkalmazott[] alkArray = new Alkalmazott[numberOfEmp];
		
		for(int i = 0; i <alkArray.length; i++){
			System.out.println("Kérem az " + i + ". alkalmazott nevét!");
			String name = sc.next();
			
			System.out.println("Kérem az " + i + ". alkalmazott korát!");
			int age = sc.nextInt();
			
			System.out.println("Kérem az " + i + ". alkalmazott fizetését!");
			int payment = sc.nextInt();
			
			alkArray[i] = new Alkalmazott(name, age, payment);
		}
		sc.close();
		
		for(Alkalmazott a : alkArray)
			System.out.println(a.toString());
		
		Alkalmazott.setNyugdijKorhatar(30);
		
		for(Alkalmazott a : alkArray)
			System.out.println(a.toString());
		
	}

}
