public class Solution {

	// Return the reversed string. No need to print
    
	public static String reverseEachWord(String str) {

        String revStr = "";
		String revWord = "";
		int beginIndex = 0;
		for(int i = 0; i < str.length(); i++) {
			revWord = "";
			if(str.charAt(i) == ' ') {
				for(int j = i-1; j >= beginIndex; j--) {
					revWord += str.charAt(j);
				}
				revStr = revStr + revWord + " ";
				beginIndex = i + 1;
			}
		}
		for(int i = str.length() - 1; i >= beginIndex; i--) {
			revWord = revWord + str.charAt(i);
		}
		revStr = revStr + revWord;
		return revStr;

	}
}
