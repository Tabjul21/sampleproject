package Assignment_4;

public class Palindrome {

	public static void main(String[] args) {
		int n=2552; 
			  int r=0,sum=0,temp;
			  temp=n;    
			  while(n>0){    
			   r=n%10;   
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
			}  
	
