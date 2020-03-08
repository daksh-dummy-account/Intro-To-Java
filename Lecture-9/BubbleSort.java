public class BubbleSort {	

	public static void bubbleSort(int[] arr){
        
        int i, temp, round;
		int n = arr.length;
		for(round = 1; round < n; round++) {
			for(i = 0; i < n-1; i++) {
				if(arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
        
	}
}