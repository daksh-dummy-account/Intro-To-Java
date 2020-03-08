public class Solution{	

	public static void tripletSum(int[] arr, int sum){
		
        //first we need to sort the array
		int n = arr.length;
		for(int round = 1; round < n; round++) {
			for(int i=0; i<n-1; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
      
      	//now we need to find and print the triplets
		for (int i = 0; i < n - 2; i++) { 
			for (int j = i + 1; j < n - 1; j++) { 
				for (int k = j + 1; k < n; k++) { 
					if (arr[i] + arr[j] + arr[k] == sum) { 
						System.out.println(arr[i]+ " " + arr[j] + " " + arr[k]); 
					} 
				} 
			} 
		}
		
	}
}
