package Assignment_2;

public class BubbleSearch {

	public static void main(String[] args) {
		int []a= {6,5,8,2,1,3};
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[j]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int ele:a) {
			System.out.println(ele+" ");
		}
	}

}
