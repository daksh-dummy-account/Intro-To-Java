import java.util.Scanner;

public class Solution {

	public static Scanner s = new Scanner(System.in);

	public static void printRowSum(int[][] arr){
		for(int i = 0; i < arr.length; i++) {
			int sumr = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sumr+=arr[i][j];
			}
			System.out.print(sumr + " ");
		}
	}

	public static int[][] takeInput() {
		int rows = s.nextInt();
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr = takeInput();
		printRowSum(arr);
	}

}