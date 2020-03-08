public class InsertionSort {	

	public static void insertionSort(int[] arr){
        
        int n = arr.length;
		for(int i = 1; i < n; i++) {
			int j = i;
			while(j >= 1 && arr[j-1] > arr[j]) {  //j should be >=1 to prevent error & should 
				int temp = arr[j-1];			  //be written prior to the other condition
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
        
	}
}