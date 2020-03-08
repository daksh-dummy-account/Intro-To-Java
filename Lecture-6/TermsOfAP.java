import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x, count = 0, i = 1;
		while(count < n) {
			x = 3 * i + 2;
			if(x%4 != 0) {
				System.out.print(x + " ");
				count++;
			}
			i++;
		}

	}
}
