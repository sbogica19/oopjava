package sikidomfut;

import S�kidom.*;

public class sikidomfut {

	public static void main(String[] args) {
		S�kidom.Henger h1 = new Henger(5, 10);

		System.out.println(h1.toString());
		System.out.println("A h1 t�rfogata: " + h1.getVolume());

		System.out.println("");
		Teglatest t1 = new Teglatest(5, 10, 5);
		System.out.println(t1.toString());
		System.out.println("A t1 t�rfogata: " + t1.getVolume());
	}

}
