public class solution {

	public static String removeConsecutiveDuplicates(String str) {
	    
        String newStr = "";
		newStr += str.charAt(0);
		char c = str.charAt(0);

		for (int i = 1; i < str.length(); i++) { 
			if(str.charAt(i) != c) {	//comparing with last added character
				newStr += str.charAt(i);
				c = str.charAt(i);		//updating the last added character
			}
		} 

		return newStr;

	}
}