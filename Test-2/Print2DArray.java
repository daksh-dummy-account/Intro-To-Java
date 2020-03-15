public class solution {
    
	public static void print2DArray(int input[][]) {
        
        int n = input.length;
		for(int i = 0; i < input.length; i++) {
            for(int j = n - 1; j >= 0; j--) {
                for(int k = 0; k < input[i].length; k++){
                    System.out.print(input[i][k] + " ");
                }
                System.out.println();
            }
            n--;
        }

	}
}
