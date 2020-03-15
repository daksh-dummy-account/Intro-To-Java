public class Solution {

	public static void leaders(int[] arr) {

        int n = arr.length;
        for(int i = 0; i < n; i++) { 
            int j; 
            for(j = i + 1; j < n; j++) { 
                if(arr[i] < arr[j]){
                    break;
                }
            } 
            if(j == n) {     // the loop didn't break 
                System.out.print(arr[i] + " "); 
            }
        } 

	}
	
}