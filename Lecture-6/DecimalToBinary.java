import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int x;
      	long ans = 0, i = 1;
        while (n > 0) {
        	x = n % 2; 
            ans = ans + (x * i);
            i *= 10;
            n = n / 2; 
        } 
        System.out.println(ans);	
	}
}