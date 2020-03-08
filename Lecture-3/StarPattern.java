import java.util.Scanner;

public class Solution {
    
    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);					
		int n = s.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int space = 1; space <= n - i; space++) {
				System.out.print(" ");
			}
			int k = 0;
			while(k != 2 * i - 1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
		}   

    }

}