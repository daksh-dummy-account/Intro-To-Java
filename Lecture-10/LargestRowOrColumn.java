public class Solution {

	public static void findLargest(int arr[][]){
		
		int sumr, maxRowSum = Integer.MIN_VALUE, maxRowIndex = -1;
		for(int i = 0; i < arr.length; i++) {
			sumr = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sumr+=arr[i][j];
			}
			if(sumr > maxRowSum) {
				maxRowSum = sumr;
				maxRowIndex = i;
			}
		}
		
		int sumc, maxColSum = Integer.MIN_VALUE, maxColIndex = -1;
		for(int j = 0; j < arr[0].length; j++) {
			sumc = 0;
			for(int i = 0; i < arr.length; i++) {
				sumc+=arr[i][j];
			}
			if(sumc > maxColSum) {
				maxColSum = sumc;
				maxColIndex = j;
			}
		}
		
		if(maxRowSum >= maxColSum) {
			System.out.println("row " + maxRowIndex + " " + maxRowSum);
		}
		else {
			System.out.println("column " + maxColIndex + " " + maxColSum);
		}

	}
	
}