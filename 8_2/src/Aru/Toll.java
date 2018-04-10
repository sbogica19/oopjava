package Aru;

java.awt.Color;

public class Toll extends Product implements ISzinezheto{
	private Color color;
	private String brandName;
	public Toll(String name, int netPrice, int percentage, Color color, String brandName) {
		super(name, netPrice, percentage);
		this.color = color;
		this.brandName = brandName;
	}
	
	

}
