import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int n = s.nextInt();		

        for(int i = 1; i <= n; i++) {
        	for(int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
        	int val = i;
        	for(int j = 1; j <= i; j++) {
                System.out.print(val);
                val++;
            }
        	int val1 = 2*i-2;
        	for(int k = 1; k <= i-1; k++) {
                System.out.print(val1);
                val1--;
                
            }
        	System.out.println();
        }
	}
}