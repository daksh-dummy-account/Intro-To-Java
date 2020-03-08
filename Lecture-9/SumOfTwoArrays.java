public class SumOfTwoArrays{	

	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
        
        int n1 = arr1.length;
      	int n2 = arr2.length;
      	int n3;
        
		if(n1 > n2) {
			n3 = n1+1;
		}
		else {
			n3 = n2+1;
		}
        
		int[] arr3 = new int[n3];
		int i, j, k = n3-1, num, carry = 0;
		for(i = n1-1,j = n2-1; i>=0 && j>=0; i--,j--) {
			num = arr1[i] + arr2[j] + carry;
			arr3[k--] = num % 10;
			carry = num/10;
		}
        
		if(i > j) {
			while(i>=0) {
				num = arr1[i--] + carry;
				arr3[k--] = num % 10;
				carry = num/10;
			}
			
		}
		else if(i < j){
			while(j>=0) {
				num = arr2[j--] + carry;
				arr3[k--] = num % 10;
				carry = num/10;
			}
		}
		else {
			arr3[0] += carry;
		}
        
        return arr3;

	}
}