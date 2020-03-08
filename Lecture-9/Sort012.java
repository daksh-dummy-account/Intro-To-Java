public class Sort012{	

	public static void sort012(int[] arr){
		
        int n = arr.length;
      	int[] temp = new int[n];
        
		int i, nz = 0, nt = n-1;
        
		for(i = 0; i < n; i++) {
			if(arr[i] == 0) {
				temp[nz++] = arr[i];
			}
			else if(arr[i] == 2) {
				temp[nt--] = arr[i];
			}
		}
		
		for(i = nz; i <= nt; i++) {
			temp[i] = 1;
		}
		
		for(i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
        
	}
}