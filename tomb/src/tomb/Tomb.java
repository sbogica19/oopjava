package tomb;
import java.util.Random;
public class Tomb {
	public static void main(String[] args){
		int array[] = new int[10];
		Random rnd=new Random();
		
		for(int i=0;i<array.length;i++){
			array[i] = rnd.nextInt(50)+1;
			//array[i]=(int)(Math.random()*50)+1;
			//System.out.println(array[i]+" ");
		}
		/*for(int e: array) {
			System.out.println(e);
		}*/
		System.out.println("\n");
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[9-i]+" ");
		}
	}

}
