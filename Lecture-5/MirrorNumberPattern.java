import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		int n = s.nextInt();		

        for(int i = 1; i <= n; i++) {
        	for(int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
        	int val = 1;
        	for(int j = 1; j <= i; j++) {
                System.out.print(val);
                val++;
            }
        	System.out.println();
        }
	}
}