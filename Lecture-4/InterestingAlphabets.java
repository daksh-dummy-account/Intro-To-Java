import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        char ch = 'A', c;
        ch += n - 1;
		for(int i = 1; i <= n; i++) {
            c = ch;
			for(int j = 1; j <= i; j++) {
				System.out.print(c);
                c++;
			}
            ch--;
			System.out.println();
		}   
	}
}