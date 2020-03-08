public class LinearSearch{	
	
	public static int linearSearch(int[] arr, int num){
		
        int flag = 0, i;
        
		for(i = 0; i < arr.length; i++){
           if(arr[i] == num){
              flag = 1;
              break;
           }
        }
        
        if(flag == 1){
            return i;
        }
        else {
            return -1;
        }
	
	}
}