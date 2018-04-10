package hasabokTarol;

import S�kidom.*;

public class HasabTarol {
	private Hasab[] hasabArray;
	
	public HasabTarol(int size){
		this.hasabArray = new Hasab[size];
	}
	
	public void setHasabRef(int index, Hasab h){
		this.hasabArray[index] = h;
	}
	
	public int getArraySize(){
		return this.hasabArray.length;
	}
	
	public Hasab getIndexofHasab(int index){
		return this.hasabArray[index];
	}
	
	public int getNotNullElements(){
		int db = 0;
		for(Hasab h : this.hasabArray){
			if(h != null)
				db++;
		}
		
		return db;
	}
	
	public double getHasabAverageVolume(){
		double sum = 0;
		
		for(Hasab h : this.hasabArray)
			if(h != null)
				sum = sum + h.getVolume();
			
		return sum / this.hasabArray.length;
	}
	
	public int getHengerHasab(){
		int db = 0;
		
		for(Hasab h : this.hasabArray){
			if(h instanceof Henger)
				db++;
		}
		return db;
	}
}
