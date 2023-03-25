package Assignment_2;

public class Subset_Array {

	public static void main(String[] args) {
		 int [] arr1= {3,8,10};
	        int [] arr2= {1, 2, 5};
	        boolean status= false;

	        for(int i=0; i<arr2.length; i++)
	        {
	            for(int j=i+1; j<arr1.length; j++)
	            {
	                if(arr1[i]==arr2[j])
	                {
	                    status=true;
	                    break;
	                }
	            }

	            if(status==true)
	            {
	                System.out.println("Subset of Arr1 and Arr2");
	                break;
	            }
	            else{
	                System.out.println("Not Subset of Arr1 and Arr2");
	                break;
	            }
	        }
	}
}
