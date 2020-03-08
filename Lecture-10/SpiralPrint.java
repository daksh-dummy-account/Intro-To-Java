public class solution {

	public static void spiralPrint(int arr[][]){
		
        int rowStart = 0, rowEnd = arr.length - 1;
		int colStart = 0, colEnd = arr[0].length - 1;
		int count = 1;
		int n = arr.length * arr[0].length;
		while(count <= n) {
			for(int j = colStart; count <= n && j <= colEnd; j++) {
				System.out.print(arr[rowStart][j] + " ");
				count++;
			}
			rowStart++;
			for(int i = rowStart; count <= n && i <= rowEnd; i++) {
				System.out.print(arr[i][colEnd] + " ");
				count++;
			}
			colEnd--;
			for(int j = colEnd; count <= n && j >= colStart; j--) {
				System.out.print(arr[rowEnd][j] + " ");
				count++;
			}
			rowEnd--;
			for(int i = rowEnd; count <= n && i >= rowStart; i--) {
				System.out.print(arr[i][colStart] + " ");
				count++;
			}
			colStart++;
		}


	}
}