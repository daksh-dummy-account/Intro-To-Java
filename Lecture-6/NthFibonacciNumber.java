import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);					
		int n = s.nextInt();
        
		int a = 1, b = 1, c = 0;
        
		for(int i = 0; i < n-2; i++) {
			c = a + b;
			a = b;
			b = c;	
		}
        
		System.out.println(c);
	
    }
}