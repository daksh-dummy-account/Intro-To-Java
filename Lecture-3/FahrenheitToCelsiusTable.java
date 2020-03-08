import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();
		int d;
        
		while(s <= e) {
			d = 5*(s-32)/9;
			System.out.print(s);
			System.out.print(" ");
			System.out.println(d);
			s = s + w;
		}
	}

}