public class SecondLargest{	
	
	public static int secondLargestElement(int[] arr) {
		
        int i, n = arr.length;
		int max1 = arr[0], max2 = arr[0];
        
		for(i = 1; i < n; i++) {
			if(arr[i] > max1) {
				max1 = arr[i];
			}
		}
        
		for(i = 0; i < n; i++) {
			if(arr[i] < max1 && arr[i] > max2) {
				max2 = arr[i];
			}
		}
        
        return max2;

	}
}