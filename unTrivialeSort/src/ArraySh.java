
public class ArraySh {		// сортировка Шэла и алгоритм разбиениея 
	private long[] theArray;
	private int nElem;
	
	public ArraySh(int max){
		theArray = new long[max];
		nElem=0;
	}
	public void insert(long value){
		theArray[nElem]= value;
		nElem++;
	}
	public int size(){
		return nElem;
	}
	public void display(){
		System.out.println("A= ");
		for(int i = 0; i < nElem;i++)
			System.out.print(theArray[i]+ " ");
		System.out.print(" ");
	}
	public void swap(int dex1, int dex2){
		long temp = theArray[dex1];
		theArray[dex1]= theArray[dex2];
		theArray[dex2] = temp;
		
		
	}
	
	public void shellSort(){
		int inner, outer;
		long temp;
		int h= 1;
		while(h<= nElem/3) h = h*3 + 1;
		
		while(h>0)
		{
			for(outer=h; outer<nElem; outer++){
				temp = theArray[outer];
				inner = outer ;
				
				while(inner > h-1 && theArray[inner-h] >= temp)
				{
					theArray[inner] = theArray[inner - h];
					inner -= h;
					
				}
				theArray[inner] = temp;
				
			}
			h = (h-1)/3;
		}		
	}
	public int  partion(int left, int right, long pivot)
	{
		int leftPtr = left -1;
		int rightPtr = right+1;
		while(true){
			while(leftPtr < right && theArray[++leftPtr]<pivot);
			
			while(rightPtr >left && theArray[--rightPtr] > pivot);
			
			if(leftPtr >= rightPtr) break;
			else swap(leftPtr, rightPtr);
		}
		return leftPtr;	
	}
}
