import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        
		char name = s.nextLine().charAt(0);
		int m1 = s.nextInt();
		int m2 = s.nextInt();
		int m3 = s.nextInt();
		
		int avg = (m1+m2+m3)/3;
        
		System.out.println(name);
        System.out.println(avg);

	}

}