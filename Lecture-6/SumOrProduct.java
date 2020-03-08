import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int choice = s.nextInt();
        
		int sum = 0, product = 1;
		if(choice == 1) {
			for(int i=0; i<=n; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
		else if(choice == 2) {
			for(int i=1; i<=n; i++) {
				product *= i;
			}
			System.out.println(product);
		}
		else {
			System.out.println(-1);
		}
        
	}
}