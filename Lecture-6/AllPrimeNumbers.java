import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);					
		int x = s.nextInt();  
		int i, n, flag;
		for(n = 2; n <= x; n++) {
		    flag = 0;
			for(i=2; i<=n/2; i++) {
				if(n % i == 0){      
					flag = 1;       
				}
			}
			if(flag == 0) {
				System.out.println(n);
			}
			
		}      
	}
}