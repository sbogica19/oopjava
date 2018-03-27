package alkalmazott;

import java.util.Scanner;

public class AlkalmazottFut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfEmp = sc.nextInt();
		
		Alkalmazott[] alkArray = new Alkalmazott[numberOfEmp];
		
		for(int i = 0; i <alkArray.length; i++){
			System.out.println("K�rem az " + i + ". alkalmazott nev�t!");
			String name = sc.next();
			
			System.out.println("K�rem az " + i + ". alkalmazott kor�t!");
			int age = sc.nextInt();
			
			System.out.println("K�rem az " + i + ". alkalmazott fizet�s�t!");
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
