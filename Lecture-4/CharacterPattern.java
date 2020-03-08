import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        
		for(int i = 1; i <= n; i++) {
            char val = (char)(i + 'A' - 1);
			for(int j = 1; j <= i; j++) {
				System.out.print(val);
                val = (char)(val + 1);
			}
			System.out.println();
		}   
	}
}