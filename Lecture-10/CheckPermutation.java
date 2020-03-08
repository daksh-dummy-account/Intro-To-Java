public class solution {

	public static boolean isPermutation(String str1, String str2) {
	    
        if(str1.length() != str2.length()) {
			return false;
		}

		int count[] = new int[256];		//for storing alphabets from a(97) to z(256)

		//refer hint video for explanation
		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i)]++; 
		}

		for (int i = 0; i < str2.length(); i++) {
			count[str2.charAt(i)]--; 
		}

		for (int i = 0; i < count.length; i++) {
			if(count[i] != 0) {
				return false;
			}
		}
		return true;

	}
}