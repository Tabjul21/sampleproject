package Assignment_2;

public class Duplicates_In_Array {

	public static void main(String[] args) {
		int [] arr = new int [] {2,3,4,3,2,4,5,6,5,6};   
        System.out.println("Duplicate elements: ");  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]); 
			}
		}
	}
}
