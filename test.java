import java.util.Arrays;
import java.util.Random;

public class test {
	public static void main(String[] args) {
		int[] array;// = {0,0,0,0,0};
		array=new int[5]; //perchè [4] lancia l'eccezione ArrayIndexOutOfBoundsException
		
		for(int i=0;i<5;i++) {
			//1 soluzione con math.random
			array[i]=(int) (Math.random()*101);
			//2nd soluzione con random class
			//Random random = new Random();
			//array[i]=random.nextInt(101);
		}
		
		System.out.println("L'array è composto da: ");
		//for(int i=0;i<5;i++) {
			//System.out.println(array[i]);
			System.out.println(Arrays.toString(array));
		//}
	}
}