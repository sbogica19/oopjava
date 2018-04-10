package Pont;


import java.awt.Color;

import szinezheto.ISzinezheto;

public class SzinesPont extends Pont implements ISzinezheto {
	private Color color;
	
	public SzinesPont(Color color){
		super(0,0);
		this.color = color;
	}
	
	public SzinesPont(int x, int y, Color color){
		super(x,y);
		this.color = color;
	}
	
	public String toString(){
		return "A szinespont adatai: " + this.color;
	}

	@Override
	public void setColor(Color colorIn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}
}
