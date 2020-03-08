public class Solution {

	public static int[] merge(int arr1[], int arr2[]){
		
		int n = arr1.length + arr2.length;
		int arr3[] = new int[n];
		int i, j, k;
		i = j = k = 0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			}
			else {
				arr3[k++] = arr2[j++];
			}
		}
		while(i < arr1.length) {
			arr3[k++] = arr1[i++];
		}
		while(j < arr2.length) {
			arr3[k++] = arr2[j++];
		}
		return arr3;		

	}
	
}