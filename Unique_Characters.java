package Assignment_4;
import java.lang.*;
public class Unique_Characters {

	    public static boolean isUnique(String str) {
	        
	        boolean[] charSet = new boolean[128];

	        for (int i = 0; i < str.length(); i++) {
	            int val = str.charAt(i);
	            if (charSet[val]) {
	                return false;
	            }
	            charSet[val] = true;
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	        String str = "Navaneeth";
	        boolean result = isUnique(str);

	        if (result) {
	            System.out.println("All unique characters");
	        } else {
	            System.out.println("Not Unique Characters");
	        }
	    }
	}




