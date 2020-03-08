public class solution {

	public static char highestOccuringCharacter(String str) {

        int count[] = new int[256];		//for storing alphabets from a(97) to z(256)
		int max = -1;
		char ans = str.charAt(0);

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++; 
		}

		for (int i = 0; i < str.length(); i++) { 
			if (max < count[str.charAt(i)]) { 
				max = count[str.charAt(i)]; 
				ans = str.charAt(i); 
			} 
		} 

		return ans;

	}
}