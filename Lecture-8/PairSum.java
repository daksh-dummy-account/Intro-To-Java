public class Solution{	
	
	public static void pairSum(int[] input, int x){
		
        // we don't need to sort the given array    
      	int n = input.length;
		int a, b;
		for (int i = 0; i < n - 1; i++) { 
			for (int j = i + 1; j < n; j++) { 
				if (input[i] + input[j] == x) {
					if(input[j] < input[i]) {
						a = input[j];
						b = input[i];
					}
					else {
						a = input[i];
						b = input[j];
					}
					System.out.println(a + " " + b); 
				}
			} 
		}
		
	}
}