package S�kidom;

public class Henger extends Hasab {
	private double radius;
	
	public Henger(int radius, int height){
		super(height);
		this.radius = radius;
	}
	
	public double baseArea(){
		
		return this.radius * this.radius * Math.PI;
		//return Math.pow(radius, 2) * Math.PI;
	}
	
	public String toString(){
		return "A henger adatai: sug�r: " + this.radius + " magass�g: " + super.getHeight();
	}
}
