import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);				
		int n = s.nextInt();				
		int row = 1;				
		while (row<=n) {			
			int sp = 1;
			while (sp <= n-row) {
				System.out.print(" ");
				sp++;
			}
			int val =row;
			int count = 1;
			while (count <= row) {
				System.out.print(val);
				val++;
				count++;			
			}
			System.out.println("\n");
			row++;
		}
	}
}