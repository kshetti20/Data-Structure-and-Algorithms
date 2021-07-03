package algo_ds;


//Java program to sort an array
//using bucket sort
import java.util.*;
import java.util.Collections;

/**
 * 
 * @author Kunal
 * 
 *  We need a hash(Ai) that uniformly partitions the input 
 *  set of n elements into these n buckets
 *  Applications: Could be used to sort a set of uniformly distributed 
 *  floating-point numbers in the range [0,1).
 * 
 * indexInBucket: bi = n*arr[i]/(max+1);
 * 
 * 
 * 
 */

public class BucketSort {
	
	public static void main(String[] args) {
		
		
		float arr[] = { (float)0.897, (float)0.565,
                (float)0.656, (float)0.1234,
                (float)0.665, (float)0.3434 };
		
		  int n = arr.length;
	        bucketSort(arr, n);
	 
	        System.out.println("Sorted array is ");
	        for (float el : arr) {
	            System.out.print(el + " ");
	        }
		
	}

	private static void bucketSort(float[] arr, int n) {

		 if (n <= 0)
	          return;
		 
		 
		 Vector<Float>[] buckets = new Vector[n];
		 
		  for (int i = 0; i < n; i++) {
	            buckets[i] = new Vector<Float>();
		  }
		  
		  for (int i = 0; i < n; i++) {
			  
			  //This formula changes as per the hashing algo used for uniformly distributing the elements
	            float idx = arr[i] * n;
	            
	            buckets[(int)idx].add(arr[i]);
	        }
		  
		  for (int i = 0; i < n; i++) {
	            Collections.sort(buckets[i]);
	        }
	 
		   // 4) Concatenate all buckets into arr[]
	        int index = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < buckets[i].size(); j++) {
	                arr[index++] = buckets[i].get(j);
	            }
	        }
		  
		 
		 
	}

}
