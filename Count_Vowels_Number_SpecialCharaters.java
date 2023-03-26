package Assignment_4;

public class Count_Vowels_Number_SpecialCharaters {

	  public static void main(String[] args) {        
	        int vowels = 0, consonent = 0,specialcharacters=0,Numbers=0;    
	        String str = "Navaneeth@21";    
	        str = str.toLowerCase();    
	        for(int i = 0; i < str.length(); i++) {    
	        	if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {   
	        		vowels++;    
	            }    
	             else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
	            	 consonent++;    
	            }
	             else if(str.charAt(i) >= '0' && str.charAt(i)<='9') {      
	            	 Numbers++;    
	            }
	             else {
	            	 specialcharacters++; 
	             }
	        }    
	        System.out.println("Number of vowels: " + vowels);    
	        System.out.println("Number of consonants: " + consonent);
	        System.out.println("Number of specialcharacters: " + specialcharacters);
	        System.out.println("Number of Numbers: " + Numbers);
	    }    

}
