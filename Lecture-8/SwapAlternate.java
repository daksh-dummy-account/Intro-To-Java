public class Solution {
	
	public static void swapAlternate(int[] arr){
        
        int temp, newLength;
		int n = arr.length;
        
		if(n%2 == 0) {
			newLength = n;
		}
		else {
			newLength = n - 1;
		}
        
		for(int i = 0; i < newLength; i += 2) {
			temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
        
	}	
}