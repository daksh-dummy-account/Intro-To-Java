public class Solution {

	public static String compress(String str) {
		
        int count = 1;		//initializing count as 1 as a character will be present atleast once
		String str1 = "";
		str1 += str.charAt(0); 
		str += " ";			//adding space at the end of given string so as 
							//to give output corresponding last letter

		for (int i = 1; i < str.length() ; i++) { 
			if(str.charAt(i) == str.charAt(i-1)) {
				count++;
			}
			else {
				if(count != 1) {
					str1 += count;
					str1 += str.charAt(i);
					count = 1;
				}
				else {
					str1 += str.charAt(i);
					count = 1;
				}
			}
		} 
		return str1;

	}

}