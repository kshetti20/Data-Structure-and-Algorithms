package algo_ds;

public class BinarySearch {

	
	public static void main(String[] args) {
		
	        int arr[] = { 2, 3, 4, 10, 40 };
	        int n = arr.length;
	        int x = 10;
	        int result = binarySearch(arr, 0, n - 1, x);
	        if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at index " + result);
	}

	private static int binarySearch(int[] arr, int start, int end, int value) {
		 if (end >= start) {
	            int mid = start + (end - start) / 2;
	  
	            if (arr[mid] == value)
	                return mid;
	  
	            if (arr[mid] > value)
	                return binarySearch(arr, start, mid - 1, value);
	  

	            return binarySearch(arr, mid + 1, end, value);
	        }
	  
	        // We reach here when element is not present
	        // in array
	        return -1;
	}
}
