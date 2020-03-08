public class PushZerosAtEnd {
	
	public static void pushZerosAtEnd(int[] arr){
		
        int n =arr.length;
      	int[] temp = new int[n];
		int i, nz = 0, nt = n-1;
		for(i=0; i<n; i++) {
			if(arr[i] != 0) {
				temp[nz++] = arr[i];
			}
			else {
				temp[nt--] = arr[i];
			}
		}
		
		for(i=0; i<n; i++) {
			arr[i] = temp[i];
		}

	}
}