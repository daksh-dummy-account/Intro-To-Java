import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
        
        int prev = s.nextInt();
        
        int count = 2;    // minimum numbers
        
        int current;
        
        boolean isDecreasing = true;
        
        while(count <= n) {
            current = s.nextInt();
            count++;
            
            if(current == prev){
                System.out.println("false");
                return;
            }
            
            if(current < prev){
                if(isDecreasing == false){
                    System.out.println("false");
                    return;
                }
            }
            else {
                if(isDecreasing == true){
                    isDecreasing = false;
                }
            }
            prev = current;
        }
        
        System.out.println("true");


    }
}