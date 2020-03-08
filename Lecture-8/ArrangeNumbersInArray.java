public class Solution {

	public static int[] arrange(int n){
        
        int[] arr = new int[n];
		int i, val = 1;
        
      	int start = 0, end = n-1;

		for(i = 0; i <= n/2; i++) {
            
			arr[start] = val;
			val++;
            
          	if(start == n/2) {
				return arr;
			}
            
			arr[end] = val;
			val++;
            
          	if(end == n/2) {
				return arr;
			}
            
			start++;
			end--;
            
		}	
        
		return arr;
        
	}
}