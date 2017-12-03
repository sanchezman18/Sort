import java.math.*;
public class PartionApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int maxSize = 16;
	ArraySh  theArr = new ArraySh(maxSize);
	for(int i = 0 ; i < maxSize; i++){
		long n = (int) (Math.random()*199);
		theArr.insert(n);
	}
	theArr.display();
	
	long pivot = 99;
	System.out.println("Pivot is"+pivot);
	int size = theArr.size();
	
	int parDex = theArr.partion(0, size-1, pivot);
	System.out.println("Petition is at index " + parDex);
	theArr.display();

	}

}
