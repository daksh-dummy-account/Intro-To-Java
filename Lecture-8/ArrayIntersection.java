public class Solution{	
	
	public static void intersections(int[] input1, int[] input2){
        
      for(int i = 0; i < input1.length; i++){
        for(int j = 0; j < input2.length; j++){
            if(input1[i] == input2[j]){
                System.out.println(input1[i]);
                // this is done to prevent duplicates:
                input2[j] = Integer.MAX_VALUE;
                break;
            }
        }
      }
		
	}
}