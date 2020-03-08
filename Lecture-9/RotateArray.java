public class ArrayRotate {	

	public static void rotate(int[] arr, int d) {
		
        int i, j = d, n = arr.length;
		int[] arr1 = new int[n];
        
		for(i = 0; i < arr.length; i++) {
			arr1[i] = arr[d++];
			if(d == n) {
			    break;	
			}
		}
        
		int k = n - j;
		for(i = 0; i < j; i++) {
			arr1[k++] = arr[i];
		}
        
      	for(i = 0; i < n; i++) {
			arr[i] = arr1[i];
		}

	}
}