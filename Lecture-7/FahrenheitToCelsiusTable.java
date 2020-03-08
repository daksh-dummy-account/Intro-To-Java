import java.util.Scanner;

public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {

		while (start <= end) {
			int c = 5 * (start - 32) / 9;
			System.out.println(start + "\t" + c);
			start = start + step;
        }

    }		
	
}