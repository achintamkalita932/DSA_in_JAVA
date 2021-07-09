package sortingDsa;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		
		mergeSort(arr, 0, arr.length);
		
		for(int i = 0; i < arr.length; i++) {
		     System.out.print(arr[i] + " ");	
		}
	}
	
	//20, 35, -15, 7, 55, 1, -22
	public static void mergeSort(int[] input, int start, int end) {
	
		if(end - start < 2) {
			return;
		}
		
		int mid = (start+end) / 2;
		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		merge(input, start, mid, end);
	}
	
	//20, 35, -15, 7, 55, 1, -22
	public static void merge(int[] input,int start, int mid, int end) {
		
		if(input[mid-1] <= input[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempindex =0;
		
		int[] temp = new int[end - start];
		while(i < mid && j < end) {
			
			temp[tempindex++] = input[i] <= input[j] ? input[i++] : input[j++];
			
		}
		
		// optimisation
		System.arraycopy(input, i, input, start + tempindex, mid-i);
		System.arraycopy(temp, 0, input, start, tempindex);
		
	}
}
