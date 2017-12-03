import java.math.*;
public class QuickSortApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int maxSize = 16;
		ArrayIns2 arr = new ArrayIns2(maxSize);
		for(int i = 0 ; i < maxSize; i++){
			long n = (int)(Math.random()*99);
			arr.insert(n);
			
		}
		arr.display();
		arr.quickSort();
		arr.display();

	}

}
