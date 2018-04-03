package myproductrun;

//import myproducts.Bread;
//import myproducts.Product;

import myproducts.*;

public class ProductsRun {

	public static void main(String[] args) {

		Product p1 = new Product("Product1", 100, 27);
		Bread b1 = new Bread("Bread1", 200, 27, 2);

		System.out.println("A p1 adatai: " + p1.toString());
		System.out.println("A b1 adatai: " + b1.toString());

		System.out.println("");	
		
		int priceCompare = p1.productCompare(b1);
		
		if (priceCompare == 1)
			System.out.println("A p1 �ra a nagyobb.");
		
		else if (priceCompare == -1)
			System.out.println("A b1 �ra a nagyobb.");
		
		else
			System.out.println("A p1 �s b1 �ra megegyezik.");
		
		System.out.println("");
		
		
		Bread b2 = new Bread("Bread", 150, 24, 3);
		Product product2 = b2;
		
		System.out.println("A product2 adatai: " + product2.toString());
		
		System.out.println("");
		
		Bread bread2 = new Bread("bread2", 200, 20, 3);
		
		boolean res = Bread.breadPriceCompare((Bread) product2, bread2);
		if(res)
			System.out.println("A product2 �ra a nagyobb.");
		else
			System.out.println("A bread2 �ra a nagyobb.");
	}

}
