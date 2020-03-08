public class Solution {
    
	public static void diamondOfStars(int n) {
        
        int half = n/2 + 1;
        
        for(int i = 1; i <= half; i++){
            for(int j = 1; j <= half-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        int secondHalf = n - half;
        
        for(int i = secondHalf; i >= 1; i--){
            for(int j = 1; j <= half-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
	}
}