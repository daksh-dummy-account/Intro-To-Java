import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int q;
        int rev = 0;
        
        while(n != 0){
            q = n % 10;
            rev = rev * 10 + q;
            n = n / 10;
            q++;
            
        }
        
        System.out.print(rev);

	}
}