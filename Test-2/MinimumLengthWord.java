public class Solution {
    
	public static String minLengthWord(String input){
		
		int length = input.length();
        int startIndex = 0, endIndex = 0; 
        int minLength = length;
        int minStartIndex = 0;
        String minWord = ""; 
  
        // loop while input string is not empty 
        while(startIndex <= length) { 
            
            if((endIndex < length) && (input.charAt(endIndex) != ' ')) { 
                endIndex++;    
            }
            
            else {
                
                // end of a word 
                // find current word length:
                
                int currentLength = endIndex - startIndex; 
  
                if(currentLength < minLength) { 
                    minLength = currentLength; 
                    minStartIndex = startIndex; 
                }
                
                endIndex++; 
                startIndex = endIndex; 
            }
            
        } 
  
        // store minimum length word
        minWord = input.substring(minStartIndex, minStartIndex + minLength);
        return minWord;
	}
}
