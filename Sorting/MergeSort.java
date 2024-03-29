package algorithmsAndDS;


/**
 * 
 * @author Kunal
 *
 * Time complexity for all 3 cases (worst, average and best) : θ(nLogn)
 * Auxiliary Space: O(n)
 * Algorithmic Paradigm: Divide and Conquer
 * Applications: Linked List sorting
 *
 */


public class MergeSort {
	
	public static void main(String[] args) {
		
		int mainArray[] = {55,21,66,11,32,75,32,43,66,01,22,111};
		
		int last = mainArray.length-1;
		
		int first = 0;
		int mid = first + (last - first)/2;
		
		MergeSort merge = new MergeSort();
		merge.mergeSort(mainArray, first, last);
	

		for(int i = 0; i <= last; i += 1) {
			System.out.print(mainArray[i] + " ");
		}
	}
	
	void mergeSort(int mainArray[], int start, int end){
	
		if(start < end) {
		
			int mid = start + (end - start)/2;
			
			mergeSort(mainArray, start, mid);
			
			mergeSort(mainArray, mid + 1, end);
			
			merge(mainArray, start, mid, end);			
	
		}
	}
	
	
	private void merge(int mainArray[], int start, int mid, int end) {
		
		int temp[] = new int[end - start + 1];
		
		int i = start;
		int j = mid + 1;
		int k = 0;
		while(i <= mid && j <= end) {
			if(mainArray[i] <= mainArray[j]) {
				temp[k] = mainArray[i];
				k+=1;
				i+=1;
			}else {
				temp[k] = mainArray[j];
				k+=1;
				j+=1;
			}
		}
		
		while(i<=mid) {
			temp[k] = mainArray[i];
			k+=1; 
			i+=1;
		}
		
		while(j <= end) {
			temp[k] = mainArray[j];
			k+=1; 
			j+=1;
		}
		
		for(i = start; i <= end; i += 1) {
			mainArray[i] = temp[i - start];
		}
	}
}
