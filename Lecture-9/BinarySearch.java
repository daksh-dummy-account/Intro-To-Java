public class BinarySearch{	

	public static int binarySearch(int[] arr, int element){
        
        int l = 0, r = arr.length - 1;
		while(l <= r) {
			int mid = (l+r)/2;
			if(element == arr[mid]) {
				return mid;
			}
			else if(element < arr[mid]) {
				r = mid - 1;
			}
			else {
				l = mid + 1;
			}
		}
		return -1;

	}
}