package algorithmsAndDS;

public class QuickSort {
	
	public static void main(String[] args) {
		
		int mainArray[] = {55,121,166,11,32,75,32,43,66,01,22,111};
	
		int size = mainArray.length;
		
		int first = 0;
		
		sort(mainArray, first, size - 1);
		
		printArray(mainArray, size);
		
	}
	
	private static void printArray(int[] arr, int size)
	{
	    for(int i = 0; i < size; i++)
	        System.out.print(arr[i] + " ");
	         
	    System.out.println();
	}

	private static void sort(int[] mainArray, int first, int last) {
		
		if(first < last) {
			
			int pi = partition(mainArray, first, last);
			sort(mainArray, first, pi);
			sort(mainArray, pi+1, last);
			
		}
		
	}

	private static int partition(int[] mainArray, int first, int last) {

		int pivot = mainArray[last];
		
		int i = first - 1;
		
		for(int j = first; j < last; j++) {
			
			
			if(mainArray[j] < pivot)
			{
				i++;
				if(i<j) {
				swap(mainArray, i, j);
				}
				
			}
			
		}
		
		return 0;
	}

	private static void swap(int[] mainArray, int i, int j) {
		int temp = mainArray[j];
		mainArray[j] = mainArray[i];
		mainArray[i] = temp;
		
	}

}
