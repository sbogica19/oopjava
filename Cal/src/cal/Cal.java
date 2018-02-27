package cal;
import java.util.Scanner;
public class Cal {
	public static void main(String[] args){
		//TODO Auto-generated method stub
		int number1=0;
		int number2=0;
		String op="";
		Scanner sc= new Scanner(System.in);
		int res = 0;
		
		System.out.println("Kérem az 1. számot!");
		number1=sc.nextInt();
		
		System.out.println("Kérem az operandust!");
		op=sc.next();
		
		System.out.println("Kérem a 2. számot!");
		number2=sc.nextInt();
		
		sc.close();
		
		//System.out.println(number1 + " " + op + " " + number2 );
		
		switch (op){
			case "+" : res = number1 + number2;
				break;
		
			case "-" : res = number1 - number2;
				break;
		
			case "*" : res = number1 * number2;
				break;
		
			case "/" : 
				if(number2 == 0)
					System.out.println("0-val nem lehet osztani!");
				else
					res = number1 / number2;
				break;
				
		}
		System.out.println("Az eredmény: " + res);
	}

}
