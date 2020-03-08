import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i, sume = 0, sumo = 0;
		while(n > 0) {
			i = n % 10;
			if(i % 2 == 0) {
				sume += i;
			}
			else {
				sumo += i;
			}
			n = n / 10;
		}
		System.out.println(sume + " " + sumo);
	}

}