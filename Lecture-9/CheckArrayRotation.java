public class CheckRotation {	

	public static int arrayRotateCheck(int[] arr){
		
        int i, min = arr[0], j = 0;
		for(i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
				j = i;
			}
		}
      	return j;

	}
}