package masodfoku;

import java.util.Scanner;

public class masodfoku {
	public static void main(String[] args){
	int egyutt[]=new int[3];
	double discriminant=0;
	double x1 = 0, x2=0;
	Scanner sc=new Scanner(System.in);
	int a=0;
	int b=0;
	int c=0;
	
	System.out.println("K�rem az 1. egy�tthat�t: ");
	egyutt[0]=sc.nextInt();
	
	System.out.println("K�rem az 2. egy�tthat�t: ");
	egyutt[1]=sc.nextInt();
	
	System.out.println("K�rem az 3. egy�tthat�t: ");
	egyutt[2]=sc.nextInt();
	
	sc.close();
	
	a=egyutt[0];
	b=egyutt[1];
	c=egyutt[2];
	
	discriminant=(b*b)- (4*a*c);
	if (discriminant <0){
	 System.out.println("nincs val�s megold�s!");
	} else {
		x1=(b*(-1)+Math.sqrt(discriminant))/ (2*a);
		x2=(b*(-1)-Math.sqrt(discriminant))/ (2*a);
		System.out.println(x1+" "+x2);
	}
	
	}

}
