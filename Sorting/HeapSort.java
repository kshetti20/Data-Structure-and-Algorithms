package algo_ds;


/**
 * 
 * @author Kunal
 *
 * Auxiliary space: In-place algorithm
 * Time complexity of Heapify: logn
 * Time complexity of create and BuildHealp: n
 * Heap sort: nlogn
 * Application:  Sort a nearly sorted (or K sorted) array 
 * Heap is widely used data structure 
 *
 */
public class HeapSort {
	
	
	public static void main(String[] args) {
		
		
		 int arr[] = { 12, 11, 13, 5, 6, 7 };
	 
		 HeapSort ob = new HeapSort();
	        ob.sort(arr);
	 
	        System.out.println("Sorted array is");
	        printArray(arr);
		
	}
	
	
	   private void sort(int[] arr) {
		   
		   int n = arr.length;

		   //Max heap the array first
		   for(int i = n/2-1; i >=0; i++) {
			   heapify(arr, n, i);
		   }
		   
		   
		   //Swap the largest mode with the lowest one
		   //Swap the root node woth the last node
		   //Consider the last node after swapping out of the array
		   for(int i = n-1; i > 0; i--) {
			   int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;
	 
	            // call max heapify on the reduced heap
	            heapify(arr, i, 0);
		   }
		   
		}


	private void heapify(int[] arr, int n, int i) {
		int largest = i;
		
		int left = i*2 +1;
		int right = i*2 + 2;
		
		
		if(left < n && arr[left] > arr[i]) {
			largest = left;
		}
		
		if(right < n && arr[right] > arr[i]) {
			largest = right;
		}
		
		if(i != largest) {
			int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
		}
		
		heapify(arr, n, largest);
		
	}


	/* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
