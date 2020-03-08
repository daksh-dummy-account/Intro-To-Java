public class Solution{	
	
	public static int duplicate(int[] arr){
		
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
               if(i != j && arr[i] == arr[j]){
                   return arr[i];
               }
            }
        }
        return Integer.MAX_VALUE;
		
	}
}