public class solution {

	public static String removeAllOccurrencesOfChar(String str, char c) {
        
        String temp = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != c) {
				temp += str.charAt(i);
			}
		}
		
		return temp;

	}

}