package algo_ds;

/**
 * 
 * @author Kunal
 *
 * Time Complexity: O(n+k) where n is the number of elements in input
 *  array and k is the range of input. 
 *
 * 	Auxiliary Space: O(n+k)
 */
public class CountingSort {
	
	public static void main(String[] args) {
		 CountingSort ob = new CountingSort();
	        char arr[] = { 'g', 'e', 'e', 'k', 's', 'f', 'o',
	                       'r', 'g', 'e', 'e', 'k', 's' };
	 
	        ob.sort(arr);
	 
	        System.out.print("Sorted character array is ");
	        for (int i = 0; i < arr.length; ++i)
	            System.out.print(arr[i]);
	    
	}

	private void sort(char[] arr) {
	
		int n = arr.length;
		
		char output[] = new char[n];
		
		 // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        int count[] = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;
        
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];
        
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];
 
    
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }
 
        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
        		
	}

}
