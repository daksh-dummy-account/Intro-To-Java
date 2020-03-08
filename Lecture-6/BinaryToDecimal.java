import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int x;
        long ans = 0, i = 0;
        while (n > 0) {
        	x = n % 10; 
            ans = (long) (ans + (x * Math.pow(2, i)));
            i++;
            n = n / 10; 
        } 
        System.out.println(ans);

	}

}