import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt(); 
        
        int ans = (int) Math.pow(x,n);	

		System.out.println(ans);
    
	}
}