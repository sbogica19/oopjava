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
		
		System.out.println("K�rem az 1. sz�mot!");
		number1=sc.nextInt();
		
		System.out.println("K�rem az operandust!");
		op=sc.next();
		
		System.out.println("K�rem a 2. sz�mot!");
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
		System.out.println("Az eredm�ny: " + res);
	}

}
