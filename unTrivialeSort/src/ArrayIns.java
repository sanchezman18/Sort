
public class ArrayIns {
	private long[] theArray; // обычная быстрая сортировка
	private int nElem;
	
	public ArrayIns(int max){
		theArray = new long[max];
		 nElem = 0;
	}
	public void insert(long value){
		theArray[nElem] = value;
		nElem++;
		
	}
	
	public void display()
	{
		System.out.print("A=");
		for(int i = 0; i<nElem;i++)
			System.out.print(theArray[i]+ " ");
		System.out.print(" ");
		
	}
	public void quickSort(){
		recQuickSort(0, nElem-1);
	}
	public void recQuickSort(int left,int right){
		if(right-left <= 0)
			return;
		else
		{
			long pivot = theArray[right];
			
			int partition = partitionIt(left,right,pivot);
			recQuickSort(left,partition-1);
			recQuickSort(partition+1,right);
		}
	}
	public int partitionIt(int left, int right, long pivot){
		int leftPtr = left - 1;
		int rightPtr = right ;
		while(true){
			while( theArray[++leftPtr]<pivot);
			while(rightPtr > 0 && theArray[--rightPtr] > pivot);
			
			if(leftPtr >= rightPtr) break;
			else swap(leftPtr, rightPtr);
		}
		swap(leftPtr, right);
		return leftPtr;
	}
	public void swap(int dex1, int dex2){
		long temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}
}

